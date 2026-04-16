package net.battousai90.siamdelights;

import net.battousai90.siamdelights.registry.ModBlocks;
import net.battousai90.siamdelights.registry.ModItems;
import net.battousai90.siamdelights.worldgen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SiamDelights implements ModInitializer {
    public static final String MOD_ID = "siam_delights";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private static final TagKey<Item> KNIFE_TAG =
            TagKey.create(Registries.ITEM, Identifier.parse("c:tools/knife"));

    private static final Identifier TALL_GRASS_TABLE =
            Identifier.fromNamespaceAndPath("minecraft", "blocks/tall_grass");

    @Override
    public void onInitialize() {
        ModBlocks.initialize();
        ModItems.initialize();
        ModWorldGeneration.initialize();
        registerLootTableEvents();
        LOGGER.info("Siam Delights initialized!");
    }

    private void registerLootTableEvents() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (TALL_GRASS_TABLE.equals(key.identifier())) {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);
                tableBuilder.withPool(
                    LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.LEMONGRASS)
                            .when(LootItemRandomChanceCondition.randomChance(0.15f))
                            .when(MatchTool.toolMatches(
                                ItemPredicate.Builder.item().of(itemLookup, KNIFE_TAG)
                            ))
                        )
                );
            }
        });
    }
}
