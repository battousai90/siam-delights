package net.battousai90.siamdelights;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SiamDelights implements ModInitializer {
	public static final String MOD_ID = "siam_delights";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Siam Delights initialized!");
	}
}
