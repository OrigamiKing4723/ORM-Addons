package net.origamiking.mcmods.orm_addon.movie_characters.armor.movie_soundwave;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import net.origamiking.mcmods.orm_addon.movie_characters.armor.movie_soundwave.renderer.MovieSoundwaveArmorRenderer;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;


public final class MovieSoundwaveArmorItem extends TransformerArmorItem implements GeoItem {

    public MovieSoundwaveArmorItem(Type type) {
        super(type);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (this.renderer == null)
                    this.renderer = new MovieSoundwaveArmorRenderer();

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public boolean isAutobot() {
        return false;
    }
}