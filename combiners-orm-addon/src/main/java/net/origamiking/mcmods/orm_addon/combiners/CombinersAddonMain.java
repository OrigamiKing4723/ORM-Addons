package net.origamiking.mcmods.orm_addon.combiners;

import net.fabricmc.api.ModInitializer;

import net.origamiking.mcmods.orm.OrmMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CombinersAddonMain implements ModInitializer {
	public static final String MOD_ID = "combiners";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final String VERSION = "0.0.1-1.20.1";

	@Override
	public void onInitialize() {
		CombinersAddonMain.LOGGER.info("Starting "+ MOD_ID + "-" + VERSION + " for ORM-" + OrmMain.VERSION);
	}
}