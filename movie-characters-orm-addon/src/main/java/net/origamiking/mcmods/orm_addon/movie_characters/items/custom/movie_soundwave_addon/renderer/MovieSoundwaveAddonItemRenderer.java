package net.origamiking.mcmods.orm_addon.movie_characters.items.custom.movie_soundwave_addon.renderer;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm_addon.movie_characters.MovieCharactersModMain;
import net.origamiking.mcmods.orm_addon.movie_characters.items.custom.movie_soundwave_addon.MovieSoundwaveAddonItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class MovieSoundwaveAddonItemRenderer extends GeoItemRenderer<MovieSoundwaveAddonItem> {
    public MovieSoundwaveAddonItemRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(MovieCharactersModMain.MOD_ID, "movie_soundwave_addon")));
    }
}
