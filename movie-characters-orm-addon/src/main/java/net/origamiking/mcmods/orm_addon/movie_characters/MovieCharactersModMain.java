package net.origamiking.mcmods.orm_addon.movie_characters;

import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.addon.OrmAddonEntrypoint;
import net.origamiking.mcmods.orm.addon.OrmAddonHelper;
import net.origamiking.mcmods.orm_addon.movie_characters.armor.ModArmor;
import net.origamiking.mcmods.orm_addon.movie_characters.group.ModGroups;
import net.origamiking.mcmods.orm_addon.movie_characters.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MovieCharactersModMain implements OrmAddonEntrypoint {
	public static final String MOD_ID = "movie-characters";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final String VERSION = "0.0.1-1.20.1";
	@Override
	public void onInitializeOrmAddon(OrmAddonHelper ormAddonHelper) {
		MovieCharactersModMain.LOGGER.info("Starting "+ MOD_ID + "-" + VERSION + " for ORM-" + OrmMain.VERSION);
		ModArmor.register();
		ModGroups.register(ormAddonHelper);
		ModItems.register();
	}
}