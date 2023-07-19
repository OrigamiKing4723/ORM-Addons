package net.origamiking.mcmods.orm_addon.movie_characters.armor.movie_soundwave.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm_addon.movie_characters.MovieCharactersModMain;
import net.origamiking.mcmods.orm_addon.movie_characters.armor.movie_soundwave.MovieSoundwaveArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MovieSoundwaveArmorRenderer extends GeoArmorRenderer<MovieSoundwaveArmorItem>{
        public MovieSoundwaveArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(MovieCharactersModMain.MOD_ID, "armor/movie_soundwave")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


