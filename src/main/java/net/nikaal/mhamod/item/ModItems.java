package net.nikaal.mhamod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nikaal.mhamod.MHAMod;
import net.nikaal.mhamod.item.custom.AdventurerCompassItem;

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

    public static final DeferredItem<Item> TREASURE_MAP = ITEMS.register("treasure_map",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
