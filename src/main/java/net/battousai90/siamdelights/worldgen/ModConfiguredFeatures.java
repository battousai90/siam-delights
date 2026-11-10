package net.battousai90.siamdelights.worldgen;

import net.battousai90.siamdelights.SiamDelights;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.Feature;

public class ModConfiguredFeatures {

    public static final ResourceKey<Feature> COCONUT_TREE =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "coconut_tree"));

    public static final ResourceKey<Feature> MANGO_TREE =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "mango_tree"));

    public static final ResourceKey<Feature> MAKRUT_TREE =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "makrut_tree"));

    public static final ResourceKey<Feature> BANANA_TREE =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "banana_tree"));

    public static final ResourceKey<Feature> PAPAYA_TREE =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "papaya_tree"));

    public static final ResourceKey<Feature> THAI_BASIL_PLANT =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "thai_basil_plant"));

    public static final ResourceKey<Feature> GALANGAL_CROP =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "galangal_crop"));

    public static final ResourceKey<Feature> LEMONGRASS_PLANT =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "lemongrass_plant"));

    public static final ResourceKey<Feature> CORIANDER_PLANT =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "coriander_plant"));

    public static final ResourceKey<Feature> GINGER_CROP =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "ginger_crop"));

    public static final ResourceKey<Feature> RED_CHILI_CROP =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "red_chili_crop"));

    public static final ResourceKey<Feature> GREEN_CHILI_CROP =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "green_chili_crop"));

    public static final ResourceKey<Feature> THAI_EGGPLANT_CROP =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "thai_eggplant_crop"));

    public static final ResourceKey<Feature> GARLIC_CROP =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "garlic_crop"));

    public static final ResourceKey<Feature> SHALLOT_CROP =
            ResourceKey.create(Registries.FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "shallot_crop"));
}
