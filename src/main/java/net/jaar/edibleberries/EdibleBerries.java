package net.jaar.edibleberries;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EdibleBerries implements ModInitializer {
    public static final String MOD_ID = "edible-berries";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	//test

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}