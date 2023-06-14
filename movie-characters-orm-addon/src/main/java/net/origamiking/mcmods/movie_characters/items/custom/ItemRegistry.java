package net.origamiking.mcmods.movie_characters.items.custom;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.movie_characters.MovieCharactersModMain;
import net.origamiking.mcmods.movie_characters.items.custom.movie_soundwave_addon.MovieSoundwaveAddonItem;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;

public class ItemRegistry {
    public static final MovieSoundwaveAddonItem MOVIE_SOUNDWAVE_ADDON = registerItem("movie_soundwave_addon", new MovieSoundwaveAddonItem(new OrigamiItemSettings()));

    public static void get() {

    }
    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, new Identifier(MovieCharactersModMain.MOD_ID, name), item);
    }
}
