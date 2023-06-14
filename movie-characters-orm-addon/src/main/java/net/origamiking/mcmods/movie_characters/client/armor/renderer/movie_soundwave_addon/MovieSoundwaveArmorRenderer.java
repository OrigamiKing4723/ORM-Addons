package net.origamiking.mcmods.movie_characters.client.armor.renderer.movie_soundwave_addon;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.movie_characters.MovieCharactersModMain;
import net.origamiking.mcmods.movie_characters.armor.robo_1.MovieSoundwaveArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MovieSoundwaveArmorRenderer extends GeoArmorRenderer<MovieSoundwaveArmorItem>{
        public MovieSoundwaveArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(MovieCharactersModMain.MOD_ID, "armor/movie_soundwave")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }

