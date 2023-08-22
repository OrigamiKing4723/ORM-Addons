package net.origamiking.mcmods.orm_addon.movie_characters.armor.movie_soundwave;

import net.minecraft.item.ArmorItem;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm_addon.movie_characters.MovieCharactersModMain;

import static net.origamiking.mcmods.oapi.items.ItemsUtils.registerItem;

public class MovieSoundwave extends ArmorUtils {
    public static final MovieSoundwaveCarArmorItem CAR = registerItem(MovieCharactersModMain.MOD_ID, "movie_soundwave_car", new MovieSoundwaveCarArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final MovieSoundwaveArmorItem HELMET = registerItem(MovieCharactersModMain.MOD_ID, "movie_soundwave_armor_helmet", new MovieSoundwaveArmorItem(ArmorItem.Type.HELMET));
    public static final MovieSoundwaveArmorItem CHESTPLATE = registerItem(MovieCharactersModMain.MOD_ID, "movie_soundwave_armor_chestplate", new MovieSoundwaveArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final MovieSoundwaveArmorItem LEGGINGS = registerItem(MovieCharactersModMain.MOD_ID, "movie_soundwave_armor_leggings", new MovieSoundwaveArmorItem(ArmorItem.Type.LEGGINGS));
    public static final MovieSoundwaveArmorItem BOOTS = registerItem(MovieCharactersModMain.MOD_ID, "movie_soundwave_armor_boots", new MovieSoundwaveArmorItem(ArmorItem.Type.BOOTS));

    public static void get() {

    }
}
