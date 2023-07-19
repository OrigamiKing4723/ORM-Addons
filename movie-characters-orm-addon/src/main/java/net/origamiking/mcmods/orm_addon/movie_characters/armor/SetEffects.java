package net.origamiking.mcmods.orm_addon.movie_characters.armor;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;
import net.origamiking.mcmods.orm_addon.movie_characters.armor.movie_soundwave.MovieSoundwaveCarArmorItem;

public class SetEffects {
    public static void setEffects() {
        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
            boolean hasCompleteSet = false;
            if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof TransformerArmorItem &&
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof TransformerArmorItem &&
                    player.getEquippedStack(EquipmentSlot.LEGS).getItem() instanceof TransformerArmorItem &&
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof TransformerArmorItem) {
                hasCompleteSet = true;
            }
            if (hasCompleteSet || player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof MovieSoundwaveCarArmorItem) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
            } else {
                player.removeStatusEffect(StatusEffects.INVISIBILITY);
            }
        }));
    }
}
