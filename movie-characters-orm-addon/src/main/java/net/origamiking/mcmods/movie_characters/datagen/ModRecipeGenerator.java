package net.origamiking.mcmods.movie_characters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.origamiking.mcmods.movie_characters.armor.movie_soundwave.MovieSoundwave;
import net.origamiking.mcmods.movie_characters.items.chips.robo_1.MovieSoundwaveChip;

import java.util.function.Consumer;

import static net.origamiking.mcmods.orm.datagen.ModRecipeGenerator.*;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerTransformerHelmet(exporter, MovieSoundwave.HELMET, MovieSoundwaveChip.MOVIE_SOUNDWAVE_CHIP);
        offerTransformerChestplate(exporter, MovieSoundwave.CHESTPLATE, MovieSoundwaveChip.MOVIE_SOUNDWAVE_CHIP);
        offerTransformerLeggings(exporter, MovieSoundwave.LEGGINGS, MovieSoundwaveChip.MOVIE_SOUNDWAVE_CHIP);
        offerTransformerBoots(exporter, MovieSoundwave.BOOTS, MovieSoundwaveChip.MOVIE_SOUNDWAVE_CHIP);
        //TODO ADD CAR




        offerChipRefiningRecipe(exporter, RecipeCategory.MISC, MovieSoundwaveChip.MOVIE_SOUNDWAVE_CHIP, Blocks.DIAMOND_BLOCK);
    }
}
