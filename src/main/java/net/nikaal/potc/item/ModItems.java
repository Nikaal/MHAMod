package net.nikaal.potc.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nikaal.potc.PotCMod;
import net.nikaal.potc.item.custom.PirateCompassItem;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PotCMod.MOD_ID);

    public static final DeferredItem<Item> PIRATE_COMPASS = ITEMS.register("pirate_compass",
            () -> new PirateCompassItem((new Item.Properties().stacksTo(1))));

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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
