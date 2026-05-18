package net.nikaal.mhamod;

import net.minecraft.world.item.*;
import net.nikaal.mhamod.event.TreasureMapCraftHandler;
import net.nikaal.mhamod.item.ModCreativeModeTabs;
import net.nikaal.mhamod.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(MHAMod.MOD_ID)
public class MHAMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "mhamod";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public MHAMod(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);
        NeoForge.EVENT_BUS.register(new TreasureMapCraftHandler());

        // Register the creative mode tab
        ModCreativeModeTabs.register(modEventBus);

        // Register the items
        ModItems.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.ADVENTURER_COMPASS);
            event.accept(ModItems.TREASURE_MAP);
        }

        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.DIAL);
            event.accept(ModItems.NEEDLE);
            event.accept(ModItems.CASING);
            event.accept(ModItems.SCREW);
            event.accept(ModItems.GEAR);
            event.accept(ModItems.PIVOT);
            event.accept(ModItems.BEARING);
            event.accept(ModItems.LENS);
            event.accept(ModItems.CELL);
            event.accept(ModItems.MAP_PIECE_1);
            event.accept(ModItems.MAP_PIECE_2);
            event.accept(ModItems.MAP_PIECE_3);
            event.accept(ModItems.MAP_PIECE_4);
            event.accept(ModItems.MAP_PIECE_5);
            event.accept(ModItems.MAP_PIECE_6);
            event.accept(ModItems.MAP_PIECE_7);
            event.accept(ModItems.MAP_PIECE_8);
            event.accept(ModItems.MAP_PIECE_9);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
