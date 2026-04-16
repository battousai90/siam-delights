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

    public static final ResourceKey<ConfiguredFeature<?, ?>> MAKRUT_TREE =
            ResourceKey.create(Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "makrut_tree"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> THAI_BASIL_PLANT =
            ResourceKey.create(Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "thai_basil_plant"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> GALANGAL_CROP =
            ResourceKey.create(Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "galangal_crop"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> LEMONGRASS_PLANT =
            ResourceKey.create(Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "lemongrass_plant"));
}
