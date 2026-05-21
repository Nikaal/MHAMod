package net.nikaal.mhamod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.nikaal.mhamod.MHAMod;
import net.nikaal.mhamod.item.ModItems;
import net.nikaal.mhamod.util.ModTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, MHAMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(ModTags.Items.POTC_ITEMS)
                .add(ModItems.ADVENTURER_COMPASS.get())
                .add(ModItems.BEARING.get())
                .add(ModItems.CASING.get())
                .add(ModItems.CELL.get())
                .add(ModItems.DIAL.get())
                .add(ModItems.GEAR.get())
                .add(ModItems.LENS.get())
                .add(ModItems.NEEDLE.get())
                .add(ModItems.PIVOT.get())
                .add(ModItems.SCREW.get())
                .add(ModItems.ENCODED_TREASURE_MAP.get())
                .add(ModItems.MAP_PIECE_1.get())
                .add(ModItems.MAP_PIECE_2.get())
                .add(ModItems.MAP_PIECE_3.get())
                .add(ModItems.MAP_PIECE_4.get())
                .add(ModItems.MAP_PIECE_5.get())
                .add(ModItems.MAP_PIECE_6.get())
                .add(ModItems.MAP_PIECE_7.get())
                .add(ModItems.MAP_PIECE_8.get())
                .add(ModItems.MAP_PIECE_9.get());
        tag(ModTags.Items.POTC_MAP_PIECES)
                .add(ModItems.ENCODED_TREASURE_MAP.get())
                .add(ModItems.MAP_PIECE_1.get())
                .add(ModItems.MAP_PIECE_2.get())
                .add(ModItems.MAP_PIECE_3.get())
                .add(ModItems.MAP_PIECE_4.get())
                .add(ModItems.MAP_PIECE_5.get())
                .add(ModItems.MAP_PIECE_6.get())
                .add(ModItems.MAP_PIECE_7.get())
                .add(ModItems.MAP_PIECE_8.get())
                .add(ModItems.MAP_PIECE_9.get());
        tag(ModTags.Items.POTC_COMPASS_PIECES)
                .add(ModItems.ADVENTURER_COMPASS.get())
                .add(ModItems.BEARING.get())
                .add(ModItems.CASING.get())
                .add(ModItems.CELL.get())
                .add(ModItems.DIAL.get())
                .add(ModItems.GEAR.get())
                .add(ModItems.LENS.get())
                .add(ModItems.NEEDLE.get())
                .add(ModItems.PIVOT.get())
                .add(ModItems.SCREW.get());
    }
}
