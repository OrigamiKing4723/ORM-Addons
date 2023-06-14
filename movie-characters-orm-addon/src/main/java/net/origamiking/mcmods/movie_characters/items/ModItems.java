package net.origamiking.mcmods.movie_characters.items;

import net.origamiking.mcmods.movie_characters.items.chips.ModChips;
import net.origamiking.mcmods.movie_characters.items.custom.ItemRegistry;

public class ModItems {
    public static void register() {
        ModChips.get();
        ItemRegistry.get();
    }
}
