package net.origamiking.mcmods.movie_characters.group;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.movie_characters.MovieCharactersModMain;
import net.origamiking.mcmods.movie_characters.armor.movie_soundwave.MovieSoundwave;
import net.origamiking.mcmods.movie_characters.items.chips.robo_1.MovieSoundwaveChip;
import net.origamiking.mcmods.movie_characters.items.custom.ItemRegistry;
import net.origamiking.mcmods.orm.group.ModGroups;

public class ModGroup {
    public static final RegistryKey<ItemGroup> MOVIE_CHARACTERS_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MovieCharactersModMain.MOD_ID, "movie_characters_group"));

    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ModGroups.ORM_CHIPS).register(entries -> {
            entries.add(MovieSoundwaveChip.MOVIE_SOUNDWAVE_CHIP);
        });

        ItemGroupEvents.modifyEntriesEvent(ModGroups.ORM_ADDONS).register(entries -> {
            entries.add(ItemRegistry.MOVIE_SOUNDWAVE_ADDON);
        });

        Registry.register(Registries.ITEM_GROUP, MOVIE_CHARACTERS_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("group.movie-characters.group"))
                .icon(() -> new ItemStack(MovieSoundwave.HELMET))
                .entries((context, entries) -> {
                    entries.add(MovieSoundwave.HELMET);
                    entries.add(MovieSoundwave.CHESTPLATE);
                    entries.add(MovieSoundwave.LEGGINGS);
                    entries.add(MovieSoundwave.BOOTS);
                    entries.add(MovieSoundwave.CAR);
                }).build());
    }
}
