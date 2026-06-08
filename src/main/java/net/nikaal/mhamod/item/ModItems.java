package net.nikaal.mhamod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nikaal.mhamod.MHAMod;
import net.nikaal.mhamod.entity.ModEntities;
import net.nikaal.mhamod.item.custom.AdventurerCompassItem;
import net.nikaal.mhamod.item.custom.EncodedTreasureMapItem;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MHAMod.MOD_ID);

    public static final DeferredItem<Item> ADVENTURER_COMPASS = ITEMS.register("adventurer_compass",
            () -> new AdventurerCompassItem((new Item.Properties().stacksTo(1))));

    public static final DeferredItem<Item> DIAL = ITEMS.register("dial",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEEDLE = ITEMS.register("needle",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CASING = ITEMS.register("casing",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SCREW = ITEMS.register("screw",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GEAR = ITEMS.register("gear",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PIVOT = ITEMS.register("pivot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BEARING = ITEMS.register("bearing",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LENS = ITEMS.register("lens",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CELL = ITEMS.register("cell",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAP_PIECE_1 = ITEMS.register("map_piece_1",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAP_PIECE_2 = ITEMS.register("map_piece_2",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAP_PIECE_3 = ITEMS.register("map_piece_3",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAP_PIECE_4 = ITEMS.register("map_piece_4",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAP_PIECE_5 = ITEMS.register("map_piece_5",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAP_PIECE_6 = ITEMS.register("map_piece_6",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAP_PIECE_7 = ITEMS.register("map_piece_7",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAP_PIECE_8 = ITEMS.register("map_piece_8",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAP_PIECE_9 = ITEMS.register("map_piece_9",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENCODED_TREASURE_MAP = ITEMS.register("encoded_treasure_map",
            () -> new EncodedTreasureMapItem(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> VICTORY_TROPHY = ITEMS.register("victory_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> AELWYN_TROPHY = ITEMS.register("aelwyn_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CONJONCTIVIX_TROPHY = ITEMS.register("conjonctivix_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DEEZ_TROPHY = ITEMS.register("deez_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HEAVENLORD_TROPHY = ITEMS.register("heavenlord_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> IPLAY4YOU_TROPHY = ITEMS.register("iplay4you_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> JOLIROUGE_TROPHY = ITEMS.register("jolirouge_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LUDOLIK_TROPHY = ITEMS.register("ludolik_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAESTROMM_TROPHY = ITEMS.register("maestromm_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MIKEFRAISE_TROPHY = ITEMS.register("mikefraise_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MISTERX_TROPHY = ITEMS.register("misterx_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NICODELPRA_TROPHY = ITEMS.register("nicodelpra_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PETLEFEU_TROPHY = ITEMS.register("petlefeu_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PIMPRY_TROPHY = ITEMS.register("pimpry_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RORSHAK_TROPHY = ITEMS.register("rorshak_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SORAX_TROPHY = ITEMS.register("sorax_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SYMETRIX_TROPHY = ITEMS.register("symetrix_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TOADY_TROPHY = ITEMS.register("toady_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VAYLE_TROPHY = ITEMS.register("vayle_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COCOLYNE_TROPHY = ITEMS.register("cocolyne_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LAAKIN_TROPHY = ITEMS.register("laakin_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NIKAAL_TROPHY = ITEMS.register("nikaal_trophy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> AELWYN_SPAWN_EGG = ITEMS.register("aelwyn_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.AELWYN_ENTITY, 0x000000, 0x0000ff,
                    new Item.Properties()));

    public static final DeferredItem<Item> CONJONCTIVIX_SPAWN_EGG = ITEMS.register("conjonctivix_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.CONJONCTIVIX_ENTITY, 0x000000, 0xe4e4e4,
                    new Item.Properties()));

    public static final DeferredItem<Item> DEEZ_SPAWN_EGG = ITEMS.register("deez_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.DEEZ_ENTITY, 0x000000, 0xbb0a1e,
                    new Item.Properties()));

    public static final DeferredItem<Item> HEAVENLORD_SPAWN_EGG = ITEMS.register("heavenlord_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.HEAVENLORD_ENTITY, 0x000000, 0x48494b,
                    new Item.Properties()));

    public static final DeferredItem<Item> IPLAY4YOU_SPAWN_EGG = ITEMS.register("iplay4you_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.IPLAY4YOU_ENTITY, 0x000000, 0x00ff00,
                    new Item.Properties()));

    public static final DeferredItem<Item> JOLIROUGE_SPAWN_EGG = ITEMS.register("jolirouge_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.JOLIROUGE_ENTITY, 0x000000, 0xdc143c,
                    new Item.Properties()));

    public static final DeferredItem<Item> LUDOLIK_SPAWN_EGG = ITEMS.register("ludolik_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.LUDOLIK_ENTITY, 0x000000, 0xc8af55,
                    new Item.Properties()));

    public static final DeferredItem<Item> MAESTROMM_SPAWN_EGG = ITEMS.register("maestromm_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.MAESTROMM_ENTITY, 0x000000, 0x4b5320,
                    new Item.Properties()));

    public static final DeferredItem<Item> MIKEFRAISE_SPAWN_EGG = ITEMS.register("mikefraise_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.MIKEFRAISE_ENTITY, 0x000000, 0xf5f5f5,
                    new Item.Properties()));

    public static final DeferredItem<Item> MISTERX_SPAWN_EGG = ITEMS.register("misterx_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.MISTERX_ENTITY, 0x000000, 0x8b0000,
                    new Item.Properties()));

    public static final DeferredItem<Item> NICODELPRA_SPAWN_EGG = ITEMS.register("nicodelpra_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.NICODELPRA_ENTITY, 0x000000, 0xc0c0c0,
                    new Item.Properties()));

    public static final DeferredItem<Item> PETLEFEU_SPAWN_EGG = ITEMS.register("petlefeu_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.PETLEFEU_ENTITY, 0x000000, 0x708090,
                    new Item.Properties()));

    public static final DeferredItem<Item> PIMPRY_SPAWN_EGG = ITEMS.register("pimpry_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.PIMPRY_ENTITY, 0x000000, 0x0b6623,
                    new Item.Properties()));

    public static final DeferredItem<Item> RORSHAK_SPAWN_EGG = ITEMS.register("rorshak_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.RORSHAK_ENTITY, 0x000000, 0xc19a6b,
                    new Item.Properties()));

    public static final DeferredItem<Item> SORAX_SPAWN_EGG = ITEMS.register("sorax_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.SORAX_ENTITY, 0x000000, 0x7e7e7e,
                    new Item.Properties()));

    public static final DeferredItem<Item> SYMETRIX_SPAWN_EGG = ITEMS.register("symetrix_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.SYMETRIX_ENTITY, 0x000000, 0x654321,
                    new Item.Properties()));

    public static final DeferredItem<Item> TOADY_SPAWN_EGG = ITEMS.register("toady_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.TOADY_ENTITY, 0x000000, 0xff0000,
                    new Item.Properties()));

    public static final DeferredItem<Item> VAYLE_SPAWN_EGG = ITEMS.register("vayle_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.VAYLE_ENTITY, 0x000000, 0xd3d3d3,
                    new Item.Properties()));

    public static final DeferredItem<Item> NIKAAL_SPAWN_EGG = ITEMS.register("nikaal_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.NIKAAL_ENTITY, 0x000000, 0xffff00,
                    new Item.Properties()));

    public static final DeferredItem<Item> COCOLYNE_SPAWN_EGG = ITEMS.register("cocolyne_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.COCOLYNE_ENTITY, 0x000000, 0xffc0cb,
                    new Item.Properties()));

    public static final DeferredItem<Item> LAAKIN_SPAWN_EGG = ITEMS.register("laakin_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.LAAKIN_ENTITY, 0x000000, 0x008000,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
