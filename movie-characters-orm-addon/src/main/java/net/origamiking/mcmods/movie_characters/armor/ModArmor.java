package net.origamiking.mcmods.movie_characters.armor;

import net.origamiking.mcmods.movie_characters.armor.movie_soundwave.MovieSoundwave;

public class ModArmor {
    public static void register() {
        MovieSoundwave.get();


        SetEffects.setEffects();
    }
}
