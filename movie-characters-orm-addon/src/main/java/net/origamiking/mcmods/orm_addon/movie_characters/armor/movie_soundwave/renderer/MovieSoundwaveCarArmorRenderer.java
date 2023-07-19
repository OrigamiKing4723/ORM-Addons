package net.origamiking.mcmods.orm_addon.movie_characters.armor.movie_soundwave.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm_addon.movie_characters.MovieCharactersModMain;
import net.origamiking.mcmods.orm_addon.movie_characters.armor.movie_soundwave.MovieSoundwaveCarArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MovieSoundwaveCarArmorRenderer extends GeoArmorRenderer<MovieSoundwaveCarArmorItem>{
        public MovieSoundwaveCarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(MovieCharactersModMain.MOD_ID, "armor/movie_soundwave_car")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


