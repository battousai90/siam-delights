package net.battousai90.siamdelights.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModWorldGeneration {

    public static void initialize() {
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ModPlacedFeatures.COCONUT_TREE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_BEACH),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ModPlacedFeatures.COCONUT_TREE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ModPlacedFeatures.MANGO_TREE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ModPlacedFeatures.MAKRUT_TREE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ModPlacedFeatures.THAI_BASIL_PLANT
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ModPlacedFeatures.GALANGAL_CROP
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ModPlacedFeatures.LEMONGRASS_PLANT
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ModPlacedFeatures.CORIANDER_PLANT
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ModPlacedFeatures.GINGER_CROP
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ModPlacedFeatures.RED_CHILI_CROP
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ModPlacedFeatures.GREEN_CHILI_CROP
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ModPlacedFeatures.THAI_EGGPLANT_CROP
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ModPlacedFeatures.GARLIC_CROP
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                ModPlacedFeatures.SHALLOT_CROP
        );
    }
}
