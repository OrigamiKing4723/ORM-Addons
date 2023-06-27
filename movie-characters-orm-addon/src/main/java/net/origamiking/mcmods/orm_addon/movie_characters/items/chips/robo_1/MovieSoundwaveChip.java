package net.origamiking.mcmods.orm_addon.movie_characters.items.chips.robo_1;

import net.minecraft.item.Item;
import net.origamiking.mcmods.orm_addon.movie_characters.MovieCharactersModMain;
import net.origamiking.mcmods.oapi.items.ItemsUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;

public class MovieSoundwaveChip extends ItemsUtils {
    public static final Item MOVIE_SOUNDWAVE_CHIP = registerItem(MovieCharactersModMain.MOD_ID, "movie_soundwave_chip", new Item(new OrigamiItemSettings()));
    public static void get() {}
}
