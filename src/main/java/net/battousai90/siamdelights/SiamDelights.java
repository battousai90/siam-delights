package net.battousai90.siamdelights;

import net.battousai90.siamdelights.registry.ModBlocks;
import net.battousai90.siamdelights.registry.ModItems;
import net.battousai90.siamdelights.worldgen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SiamDelights implements ModInitializer {
    public static final String MOD_ID = "siam_delights";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.initialize();
        ModItems.initialize();
        ModWorldGeneration.initialize();
        LOGGER.info("Siam Delights initialized!");
    }
}
