package net.origamiking.mcmods.movie_characters.armor.movie_soundwave;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.origamiking.mcmods.movie_characters.utils.armor.ArmorUtils;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;

public class MovieSoundwave extends ArmorUtils {
    public static final MovieSoundwaveCarArmorItem CAR = registerItem("movie_soundwave_car", new MovieSoundwaveCarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final MovieSoundwaveArmorItem HELMET = registerItem("movie_soundwave_armor_helmet", new MovieSoundwaveArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new OrigamiItemSettings()));
    public static final MovieSoundwaveArmorItem CHESTPLATE = registerItem("movie_soundwave_armor_chestplate", new MovieSoundwaveArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new OrigamiItemSettings()));
    public static final MovieSoundwaveArmorItem LEGGINGS = registerItem("movie_soundwave_armor_leggings", new MovieSoundwaveArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new OrigamiItemSettings()));
    public static final MovieSoundwaveArmorItem BOOTS = registerItem("movie_soundwave_armor_boots", new MovieSoundwaveArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new OrigamiItemSettings()));
    public static void get() {

    }
}
