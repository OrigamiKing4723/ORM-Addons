package net.origamiking.mcmods.orm_addon.movie_characters.items.custom.movie_soundwave_addon;

import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm_addon.movie_characters.items.custom.movie_soundwave_addon.renderer.MovieSoundwaveAddonItemRenderer;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.SingletonGeoAnimatable;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class MovieSoundwaveAddonItem extends Item implements GeoItem {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);

    public MovieSoundwaveAddonItem(Settings settings) {
        super(settings);
        SingletonGeoAnimatable.registerSyncedAnimatable(this);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private MovieSoundwaveAddonItemRenderer renderer;

            @Override
            public BuiltinModelItemRenderer getCustomRenderer() {
                if (this.renderer == null)
                    this.renderer = new MovieSoundwaveAddonItemRenderer();

                return this.renderer;
            }
        });

    }

    @Override
    public Supplier<Object> getRenderProvider() {
        return this.renderProvider;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "idle", 20, state -> PlayState.STOP)
//                .triggerableAnim("box_open", POPUP_ANIM)
                // We've marked the "box_open" animation as being triggerable from the server
//                .setSoundKeyframeHandler(event -> {
//                    // Use helper method to avoid client-code in common class
//                    PlayerEntity player = ClientUtils.getClientPlayer();
//
//                    if (player != null)
//                        player.playSound(SoundRegistry.JACK_MUSIC, 1, 1);
//                })
        );
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
