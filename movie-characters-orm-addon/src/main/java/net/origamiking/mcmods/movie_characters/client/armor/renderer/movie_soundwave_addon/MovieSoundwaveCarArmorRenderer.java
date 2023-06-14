package net.origamiking.mcmods.movie_characters.client.armor.renderer.movie_soundwave_addon;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.movie_characters.MovieCharactersModMain;
import net.origamiking.mcmods.movie_characters.armor.robo_1.MovieSoundwaveCarArmorItem;
import net.origamiking.mcmods.orm.OrmMain;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MovieSoundwaveCarArmorRenderer extends GeoArmorRenderer<MovieSoundwaveCarArmorItem>{
        public MovieSoundwaveCarArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(MovieCharactersModMain.MOD_ID, "armor/movie_soundwave_car")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


