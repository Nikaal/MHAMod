package net.nikaal.mhamod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.nikaal.mhamod.MHAMod;

public class ModTags {

    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MHAMod.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> MHAMOD_ITEMS = createTag("mhamod_items");
        public static final TagKey<Item> MHAMOD_TROPHIES = createTag("mhamod_trophies");
        public static final TagKey<Item> MHAMOD_SPAWN_EGGS = createTag("mhamod_spawn_eggs");
        public static final TagKey<Item> POTC_ITEMS = createTag("potc_items");
        public static final TagKey<Item> POTC_MAP_PIECES = createTag("potc_map_pieces");
        public static final TagKey<Item> POTC_COMPASS_PIECES = createTag("potc_compass_pieces");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MHAMod.MOD_ID, name));
        }
    }
}
