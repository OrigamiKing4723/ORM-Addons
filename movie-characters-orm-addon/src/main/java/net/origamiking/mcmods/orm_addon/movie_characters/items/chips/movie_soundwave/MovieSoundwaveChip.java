package net.origamiking.mcmods.orm_addon.movie_characters.items.chips.movie_soundwave;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.orm_addon.movie_characters.MovieCharactersModMain;

public class MovieSoundwaveChip extends ItemsUtils {
    public static final Item MOVIE_SOUNDWAVE_CHIP = registerItem(MovieCharactersModMain.MOD_ID, "movie_soundwave_chip", new Item(new OrigamiItemSettings()));

    public static void get() {
    }
}
