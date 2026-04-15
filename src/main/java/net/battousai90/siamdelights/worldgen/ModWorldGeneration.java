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
    }
}
