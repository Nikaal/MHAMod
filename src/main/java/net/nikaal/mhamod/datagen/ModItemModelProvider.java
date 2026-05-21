package net.nikaal.mhamod.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.nikaal.mhamod.MHAMod;
import net.nikaal.mhamod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MHAMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //basicItem(ModItems.ADVENTURER_COMPASS.get());
        basicItem(ModItems.BEARING.get());
        basicItem(ModItems.CASING.get());
        basicItem(ModItems.CELL.get());
        basicItem(ModItems.DIAL.get());
        basicItem(ModItems.GEAR.get());
        basicItem(ModItems.LENS.get());
        basicItem(ModItems.NEEDLE.get());
        basicItem(ModItems.PIVOT.get());
        basicItem(ModItems.SCREW.get());
        basicItem(ModItems.ENCODED_TREASURE_MAP.get());
        basicItem(ModItems.MAP_PIECE_1.get());
        basicItem(ModItems.MAP_PIECE_2.get());
        basicItem(ModItems.MAP_PIECE_3.get());
        basicItem(ModItems.MAP_PIECE_4.get());
        basicItem(ModItems.MAP_PIECE_5.get());
        basicItem(ModItems.MAP_PIECE_6.get());
        basicItem(ModItems.MAP_PIECE_7.get());
        basicItem(ModItems.MAP_PIECE_8.get());
        basicItem(ModItems.MAP_PIECE_9.get());
    }
}
