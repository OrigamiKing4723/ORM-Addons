package net.origamiking.mcmods.orm_addon.movie_characters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.origamiking.mcmods.orm_addon.movie_characters.armor.movie_soundwave.MovieSoundwave;
import net.origamiking.mcmods.orm_addon.movie_characters.items.chips.robo_1.MovieSoundwaveChip;
import net.origamiking.mcmods.orm.datagen.recipes.ArmorRecipes;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ArmorRecipes.transformerRecipes(exporter, MovieSoundwave.HELMET, MovieSoundwave.CHESTPLATE, MovieSoundwave.LEGGINGS, MovieSoundwave.BOOTS, MovieSoundwave.CAR, MovieSoundwaveChip.MOVIE_SOUNDWAVE_CHIP);
    }
}
