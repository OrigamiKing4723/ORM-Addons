package net.origamiking.mcmods.orm_addon.combiners;

import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.addon.OrmAddonEntrypoint;
import net.origamiking.mcmods.orm.addon.OrmAddonHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CombinersAddonMain implements OrmAddonEntrypoint {
    public static final String MOD_ID = "combiners";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final String VERSION = "0.0.1-1.20.1";

    @Override
    public void onInitializeOrmAddon(OrmAddonHelper addonHelper) {
        CombinersAddonMain.LOGGER.info("Starting " + MOD_ID + "-" + VERSION + " for ORM-" + OrmMain.VERSION);

    }
}