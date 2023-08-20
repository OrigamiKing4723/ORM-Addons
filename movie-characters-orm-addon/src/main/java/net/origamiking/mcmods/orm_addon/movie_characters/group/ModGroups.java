package net.origamiking.mcmods.orm_addon.movie_characters.group;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.addon.OrmAddonHelper;
import net.origamiking.mcmods.orm_addon.movie_characters.MovieCharactersModMain;
import net.origamiking.mcmods.orm_addon.movie_characters.armor.movie_soundwave.MovieSoundwave;
import net.origamiking.mcmods.orm_addon.movie_characters.items.chips.movie_soundwave.MovieSoundwaveChip;
import net.origamiking.mcmods.orm_addon.movie_characters.items.custom.ItemRegistry;

public class ModGroups {
    private static final RegistryKey<ItemGroup> MOVIE_CHARACTERS_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MovieCharactersModMain.MOD_ID, "movie_characters_group"));

    public static void register(OrmAddonHelper ormAddonHelper) {
        ormAddonHelper.addChipToGroup(MovieSoundwaveChip.MOVIE_SOUNDWAVE_CHIP);
        ormAddonHelper.addAddonToGroup(ItemRegistry.MOVIE_SOUNDWAVE_ADDON);

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
