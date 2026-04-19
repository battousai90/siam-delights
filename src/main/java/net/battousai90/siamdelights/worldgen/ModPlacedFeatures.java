package net.battousai90.siamdelights.worldgen;

import net.battousai90.siamdelights.SiamDelights;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> COCONUT_TREE =
            ResourceKey.create(Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "coconut_tree"));

    public static final ResourceKey<PlacedFeature> MANGO_TREE =
            ResourceKey.create(Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "mango_tree"));

    public static final ResourceKey<PlacedFeature> MAKRUT_TREE =
            ResourceKey.create(Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "makrut_tree"));

    public static final ResourceKey<PlacedFeature> THAI_BASIL_PLANT =
            ResourceKey.create(Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "thai_basil_plant"));

    public static final ResourceKey<PlacedFeature> GALANGAL_CROP =
            ResourceKey.create(Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "galangal_crop"));

    public static final ResourceKey<PlacedFeature> LEMONGRASS_PLANT =
            ResourceKey.create(Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "lemongrass_plant"));

    public static final ResourceKey<PlacedFeature> CORIANDER_PLANT =
            ResourceKey.create(Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "coriander_plant"));

    public static final ResourceKey<PlacedFeature> GINGER_CROP =
            ResourceKey.create(Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "ginger_crop"));

    public static final ResourceKey<PlacedFeature> RED_CHILI_CROP =
            ResourceKey.create(Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "red_chili_crop"));

    public static final ResourceKey<PlacedFeature> GREEN_CHILI_CROP =
            ResourceKey.create(Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "green_chili_crop"));

    public static final ResourceKey<PlacedFeature> THAI_EGGPLANT_CROP =
            ResourceKey.create(Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "thai_eggplant_crop"));

    public static final ResourceKey<PlacedFeature> GARLIC_CROP =
            ResourceKey.create(Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "garlic_crop"));

    public static final ResourceKey<PlacedFeature> SHALLOT_CROP =
            ResourceKey.create(Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, "shallot_crop"));
}
