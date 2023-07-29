package net.origamiking.mcmods.orm_addon.movie_characters.items.custom;

import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm_addon.movie_characters.MovieCharactersModMain;
import net.origamiking.mcmods.orm_addon.movie_characters.items.custom.movie_soundwave_addon.MovieSoundwaveAddonItem;


public class ItemRegistry extends ItemsUtils {
    public static final MovieSoundwaveAddonItem MOVIE_SOUNDWAVE_ADDON = registerItem(MovieCharactersModMain.MOD_ID, "movie_soundwave_addon", new MovieSoundwaveAddonItem(new OrigamiItemSettings()));

    public static void get() {

    }
}
