package net.origamiking.mcmods.orm_addon.movie_characters.items;

import net.origamiking.mcmods.orm_addon.movie_characters.items.chips.ModChips;
import net.origamiking.mcmods.orm_addon.movie_characters.items.custom.ItemRegistry;

public class ModItems {
    public static void register() {
        ModChips.get();
        ItemRegistry.get();
    }
}
