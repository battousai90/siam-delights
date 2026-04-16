package net.battousai90.siamdelights.registry;

import net.battousai90.siamdelights.SiamDelights;
import net.battousai90.siamdelights.item.SiamFoodItem;
import net.battousai90.siamdelights.items.MangoItem;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTabOutput;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {

    private static final ResourceKey<CreativeModeTab> FOOD_AND_DRINKS =
            ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.withDefaultNamespace("food_and_drinks"));

    // ─── RAW FRUITS ─────────────────────────────────────────────────────────

    public static final MangoItem MANGO = register("mango",
            props -> new MangoItem(props.food(ModFoods.MANGO)));

    public static final SiamFoodItem COCONUT = register("coconut",
            props -> new SiamFoodItem(props.food(ModFoods.COCONUT)));

    // ─── HERBS & AROMATICS ──────────────────────────────────────────────────

    public static final SiamFoodItem LEMONGRASS = register("lemongrass",
            props -> new SiamFoodItem(props.food(ModFoods.LEMONGRASS)));

    public static final SiamFoodItem GALANGAL = register("galangal",
            props -> new SiamFoodItem(props.food(ModFoods.GALANGAL)));

    public static final SiamFoodItem MAKRUT_LEAF = register("makrut_leaf",
            props -> new SiamFoodItem(props.food(ModFoods.MAKRUT_LEAF)));

    public static final SiamFoodItem MAKRUT = register("makrut",
            props -> new SiamFoodItem(props.food(ModFoods.MAKRUT)));

    public static final SiamFoodItem SLICED_GALANGAL = register("sliced_galangal",
            props -> new SiamFoodItem(props.food(ModFoods.SLICED_GALANGAL)));

    public static final Item MAKRUT_JUICE = register("makrut_juice",
            props -> new Item(props));

    public static final SiamFoodItem THAI_BASIL = register("thai_basil",
            props -> new SiamFoodItem(props.food(ModFoods.THAI_BASIL)));

    // ─── TRANSFORMED ────────────────────────────────────────────────────────

    public static final SiamFoodItem COCONUT_MEAT = register("coconut_meat",
            props -> new SiamFoodItem(props.food(ModFoods.COCONUT_MEAT)));

    public static final Item COCONUT_MILK = register("coconut_milk",
            props -> new Item(props));

    public static final SiamFoodItem SLICED_MANGO = register("sliced_mango",
            props -> new SiamFoodItem(props.food(ModFoods.SLICED_MANGO)));

    public static final SiamFoodItem STICKY_RICE = register("sticky_rice",
            props -> new SiamFoodItem(props.food(ModFoods.STICKY_RICE)));

    // ─── DISHES ─────────────────────────────────────────────────────────────

    public static final SiamFoodItem MANGO_STICKY_RICE = register("mango_sticky_rice",
            props -> new SiamFoodItem(
                    props.food(ModFoods.MANGO_STICKY_RICE),
                    "item.siam_delights.mango_sticky_rice.tooltip"));

    public static final SiamFoodItem TOM_YUM = register("tom_yum",
            props -> new SiamFoodItem(
                    props.food(ModFoods.TOM_YUM, ModFoods.TOM_YUM_CONSUMABLE),
                    "item.siam_delights.tom_yum.tooltip"));

    // ─── BLOCK ITEMS ────────────────────────────────────────────────────────

    public static final BlockItem COCONUT_LOG = register("coconut_log",
            props -> new BlockItem(ModBlocks.COCONUT_LOG, props));

    public static final BlockItem COCONUT_LEAVES = register("coconut_leaves",
            props -> new BlockItem(ModBlocks.COCONUT_LEAVES, props));

    public static final BlockItem COCONUT_SAPLING = register("coconut_sapling",
            props -> new BlockItem(ModBlocks.COCONUT_SAPLING, props));

    public static final BlockItem MANGO_LOG = register("mango_log",
            props -> new BlockItem(ModBlocks.MANGO_LOG, props));

    public static final BlockItem MANGO_LEAVES = register("mango_leaves",
            props -> new BlockItem(ModBlocks.MANGO_LEAVES, props));

    public static final BlockItem MANGO_SAPLING = register("mango_sapling",
            props -> new BlockItem(ModBlocks.MANGO_SAPLING, props));

    public static final BlockItem MAKRUT_LOG = register("makrut_log",
            props -> new BlockItem(ModBlocks.MAKRUT_LOG, props));

    public static final BlockItem MAKRUT_LEAVES = register("makrut_leaves",
            props -> new BlockItem(ModBlocks.MAKRUT_LEAVES, props));

    public static final BlockItem MAKRUT_SAPLING = register("makrut_sapling",
            props -> new BlockItem(ModBlocks.MAKRUT_SAPLING, props));

    public static final BlockItem THAI_BASIL_PLANT = register("thai_basil_plant",
            props -> new BlockItem(ModBlocks.THAI_BASIL_PLANT, props));

    public static final BlockItem GALANGAL_CROP = register("galangal_crop",
            props -> new BlockItem(ModBlocks.GALANGAL_CROP, props));

    public static final BlockItem LEMONGRASS_PLANT = register("lemongrass_plant",
            props -> new BlockItem(ModBlocks.LEMONGRASS_PLANT, props));

    // ─── Helpers ────────────────────────────────────────────────────────────

    private static <T extends Item> T register(String name, Function<Item.Properties, T> factory) {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM,
                Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, name));
        T item = factory.apply(new Item.Properties().setId(key));
        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(FOOD_AND_DRINKS).register((FabricCreativeModeTabOutput output) -> {
            // Raw
            output.accept(MANGO);
            output.accept(COCONUT);
            // Herbs & Aromatics
            output.accept(LEMONGRASS);
            output.accept(GALANGAL);
            output.accept(MAKRUT_LEAF);
            output.accept(MAKRUT);
            output.accept(SLICED_GALANGAL);
            output.accept(MAKRUT_JUICE);
            output.accept(THAI_BASIL);
            // Transformed
            output.accept(COCONUT_MEAT);
            output.accept(COCONUT_MILK);
            output.accept(SLICED_MANGO);
            output.accept(STICKY_RICE);
            // Dishes
            output.accept(MANGO_STICKY_RICE);
            output.accept(TOM_YUM);
            // Blocks — Coconut
            output.accept(COCONUT_LOG);
            output.accept(COCONUT_LEAVES);
            output.accept(COCONUT_SAPLING);
            // Blocks — Mango
            output.accept(MANGO_LOG);
            output.accept(MANGO_LEAVES);
            output.accept(MANGO_SAPLING);
            // Blocks — Makrut
            output.accept(MAKRUT_LOG);
            output.accept(MAKRUT_LEAVES);
            output.accept(MAKRUT_SAPLING);
            output.accept(THAI_BASIL_PLANT);
            output.accept(LEMONGRASS_PLANT);
        });
    }
}
