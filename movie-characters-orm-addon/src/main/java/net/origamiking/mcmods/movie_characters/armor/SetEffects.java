package net.origamiking.mcmods.movie_characters.armor;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.origamiking.mcmods.movie_characters.armor.movie_soundwave.MovieSoundwaveArmorItem;
import net.origamiking.mcmods.movie_characters.armor.movie_soundwave.MovieSoundwaveCarArmorItem;

public class SetEffects {
    public static void setEffects() {
        ServerTickEvents.END_SERVER_TICK.register(server -> server.getPlayerManager().getPlayerList().forEach(player -> {
            if (player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof MovieSoundwaveArmorItem ||
                    player.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof MovieSoundwaveCarArmorItem) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2, 0, false, false));
            } else {
                player.removeStatusEffect(StatusEffects.INVISIBILITY);
            }
        }));
    }
}
