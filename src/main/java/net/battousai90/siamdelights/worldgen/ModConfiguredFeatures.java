package net.battousai90.siamdelights.worldgen;

import net.battousai90.siamdelights.SiamDelights;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> COCONUT_TREE =
            ResourceKey.create(Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "coconut_tree"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> MANGO_TREE =
            ResourceKey.create(Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "mango_tree"));
}
