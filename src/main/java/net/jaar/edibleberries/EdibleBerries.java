package net.jaar.edibleberries;

import net.fabricmc.api.ModInitializer;

import net.jaar.edibleberries.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EdibleBerries implements ModInitializer {
    public static final String MOD_ID = "edibleberries";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}