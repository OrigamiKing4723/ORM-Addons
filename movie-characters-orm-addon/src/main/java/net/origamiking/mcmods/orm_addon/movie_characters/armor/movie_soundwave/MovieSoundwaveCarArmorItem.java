package net.origamiking.mcmods.orm_addon.movie_characters.armor.movie_soundwave;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import net.origamiking.mcmods.orm_addon.movie_characters.armor.movie_soundwave.renderer.MovieSoundwaveCarArmorRenderer;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;

import java.util.function.Consumer;


public final class MovieSoundwaveCarArmorItem extends TransformerArmorItem implements GeoItem {
    public MovieSoundwaveCarArmorItem(ArmorMaterial armorMaterial, Type slot, Settings properties) {
        super(armorMaterial, slot, properties);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            //private GeoArmorRenderer<?> renderer;
            private MovieSoundwaveCarArmorRenderer renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if(this.renderer == null)
                    this.renderer = new MovieSoundwaveCarArmorRenderer();
                    //this.renderer = new GeckoArmorRenderer();

                // This prepares our GeoArmorRenderer for the current render frame.
                // These parameters may be null however, so we don't do anything further with them
                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }
//    @Override
//    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
//        controllers.add(new AnimationController<>(this, 20, state -> {
//            // Apply our generic idle animation.
//            // Whether it plays or not is decided down below.
//            state.getController().setAnimation(DefaultAnimations.IDLE);
//
//            // Let's gather some data from the state to use below
//            // This is the entity that is currently wearing/holding the item
//            Entity entity = state.getData(DataTickets.ENTITY);
//
////            if (entity instanceof ArmorStandEntity)
////                return PlayState.STOP;
//
//            // For this example, we only want the animation to play if the entity is wearing all pieces of the armor
//            // Let's collect the armor pieces the entity is currently wearing
//            Set<Item> wornArmor = new ObjectOpenHashSet<>();
//
//            for (ItemStack stack : entity.getArmorItems()) {
//                // We can stop immediately if any of the slots are empty
//                if (stack.isEmpty())
//                    return PlayState.STOP;
//
//                wornArmor.add(stack.getItem());
//            }
//
//            // Check each of the pieces match our set
//            boolean isFullSet = wornArmor.containsAll(ObjectArrayList.of(
//                    MovieSoundwave.HELMET,
//                    MovieSoundwave.CHESTPLATE,
//                    MovieSoundwave.LEGGINGS,
//                    MovieSoundwave.BOOTS));
//
//            // Play the animation if the full set is being worn, otherwise stop
//            return PlayState.STOP;
//        }));
//    }
}