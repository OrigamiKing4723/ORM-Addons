package net.origamiking.mcmods.orm_addon.movie_characters.utils.armor;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm_addon.movie_characters.MovieCharactersModMain;

public class ArmorUtils {
    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, new Identifier(MovieCharactersModMain.MOD_ID, name), item);
    }
}
