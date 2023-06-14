package net.origamiking.mcmods.movie_characters.client.items.renderer.movie_soundwave_addon;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.movie_characters.MovieCharactersModMain;
import net.origamiking.mcmods.movie_characters.items.custom.movie_soundwave_addon.MovieSoundwaveAddonItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class MovieSoundwaveAddonItemRenderer extends GeoItemRenderer<MovieSoundwaveAddonItem> {
    public MovieSoundwaveAddonItemRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(MovieCharactersModMain.MOD_ID, "movie_soundwave_addon")));
    }
}
