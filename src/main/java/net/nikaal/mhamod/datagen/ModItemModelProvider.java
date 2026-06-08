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
        basicItem(ModItems.AELWYN_TROPHY.get());
        basicItem(ModItems.CONJONCTIVIX_TROPHY.get());
        basicItem(ModItems.DEEZ_TROPHY.get());
        basicItem(ModItems.HEAVENLORD_TROPHY.get());
        basicItem(ModItems.IPLAY4YOU_TROPHY.get());
        basicItem(ModItems.JOLIROUGE_TROPHY.get());
        basicItem(ModItems.LUDOLIK_TROPHY.get());
        basicItem(ModItems.MAESTROMM_TROPHY.get());
        basicItem(ModItems.MIKEFRAISE_TROPHY.get());
        basicItem(ModItems.MISTERX_TROPHY.get());
        basicItem(ModItems.NICODELPRA_TROPHY.get());
        basicItem(ModItems.PETLEFEU_TROPHY.get());
        basicItem(ModItems.PIMPRY_TROPHY.get());
        basicItem(ModItems.SORAX_TROPHY.get());
        basicItem(ModItems.SYMETRIX_TROPHY.get());
        basicItem(ModItems.TOADY_TROPHY.get());
        basicItem(ModItems.VAYLE_TROPHY.get());
        basicItem(ModItems.RORSHAK_TROPHY.get());
        basicItem(ModItems.VICTORY_TROPHY.get());
        basicItem(ModItems.COCOLYNE_TROPHY.get());
        basicItem(ModItems.LAAKIN_TROPHY.get());
        basicItem(ModItems.NIKAAL_TROPHY.get());

        withExistingParent(ModItems.AELWYN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.CONJONCTIVIX_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.DEEZ_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.HEAVENLORD_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.IPLAY4YOU_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.JOLIROUGE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.LUDOLIK_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.MAESTROMM_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.MIKEFRAISE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.MISTERX_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.NICODELPRA_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.PETLEFEU_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.PIMPRY_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.RORSHAK_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.SORAX_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.SYMETRIX_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.TOADY_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.VAYLE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.NIKAAL_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.COCOLYNE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.LAAKIN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
}
