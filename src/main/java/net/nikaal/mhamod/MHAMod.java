package net.nikaal.mhamod;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.*;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.nikaal.mhamod.entity.ModEntities;
import net.nikaal.mhamod.entity.client.*;
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

        // Register the creative mode tab
        ModCreativeModeTabs.register(modEventBus);

        // Register the items
        ModItems.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register the entities
        ModEntities.register(modEventBus);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.ADVENTURER_COMPASS);
            event.accept(ModItems.ENCODED_TREASURE_MAP);
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
            event.accept(ModItems.AELWYN_TROPHY);
            event.accept(ModItems.CONJONCTIVIX_TROPHY);
            event.accept(ModItems.DEEZ_TROPHY);
            event.accept(ModItems.HEAVENLORD_TROPHY);
            event.accept(ModItems.IPLAY4YOU_TROPHY);
            event.accept(ModItems.JOLIROUGE_TROPHY);
            event.accept(ModItems.LUDOLIK_TROPHY);
            event.accept(ModItems.MAESTROMM_TROPHY);
            event.accept(ModItems.MIKEFRAISE_TROPHY);
            event.accept(ModItems.MISTERX_TROPHY);
            event.accept(ModItems.NICODELPRA_TROPHY);
            event.accept(ModItems.PETLEFEU_TROPHY);
            event.accept(ModItems.PIMPRY_TROPHY);
            event.accept(ModItems.RORSHAK_TROPHY);
            event.accept(ModItems.SORAX_TROPHY);
            event.accept(ModItems.SYMETRIX_TROPHY);
            event.accept(ModItems.TOADY_TROPHY);
            event.accept(ModItems.VAYLE_TROPHY);
            event.accept(ModItems.VICTORY_TROPHY);
            event.accept(ModItems.COCOLYNE_TROPHY);
            event.accept(ModItems.LAAKIN_TROPHY);
            event.accept(ModItems.NIKAAL_TROPHY);
        }

        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.AELWYN_SPAWN_EGG);
            event.accept(ModItems.CONJONCTIVIX_SPAWN_EGG);
            event.accept(ModItems.DEEZ_SPAWN_EGG);
            event.accept(ModItems.HEAVENLORD_SPAWN_EGG);
            event.accept(ModItems.IPLAY4YOU_SPAWN_EGG);
            event.accept(ModItems.JOLIROUGE_SPAWN_EGG);
            event.accept(ModItems.LUDOLIK_SPAWN_EGG);
            event.accept(ModItems.MAESTROMM_SPAWN_EGG);
            event.accept(ModItems.MIKEFRAISE_SPAWN_EGG);
            event.accept(ModItems.MISTERX_SPAWN_EGG);
            event.accept(ModItems.NICODELPRA_SPAWN_EGG);
            event.accept(ModItems.PETLEFEU_SPAWN_EGG);
            event.accept(ModItems.PIMPRY_SPAWN_EGG);
            event.accept(ModItems.RORSHAK_SPAWN_EGG);
            event.accept(ModItems.SORAX_SPAWN_EGG);
            event.accept(ModItems.SYMETRIX_SPAWN_EGG);
            event.accept(ModItems.TOADY_SPAWN_EGG);
            event.accept(ModItems.VAYLE_SPAWN_EGG);
            event.accept(ModItems.NIKAAL_SPAWN_EGG);
            event.accept(ModItems.COCOLYNE_SPAWN_EGG);
            event.accept(ModItems.LAAKIN_SPAWN_EGG);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = MHAMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.AELWYN_ENTITY.get(), AelwynEntityRenderer::new);
            EntityRenderers.register(ModEntities.CONJONCTIVIX_ENTITY.get(), ConjonctivixEntityRenderer::new);
            EntityRenderers.register(ModEntities.DEEZ_ENTITY.get(), DeezEntityRenderer::new);
            EntityRenderers.register(ModEntities.HEAVENLORD_ENTITY.get(), HeavenlordEntityRenderer::new);
            EntityRenderers.register(ModEntities.IPLAY4YOU_ENTITY.get(), Iplay4youEntityRenderer::new);
            EntityRenderers.register(ModEntities.JOLIROUGE_ENTITY.get(), JolirougeEntityRenderer::new);
            EntityRenderers.register(ModEntities.LUDOLIK_ENTITY.get(), LudolikEntityRenderer::new);
            EntityRenderers.register(ModEntities.MAESTROMM_ENTITY.get(), MaestrommEntityRenderer::new);
            EntityRenderers.register(ModEntities.MIKEFRAISE_ENTITY.get(), MikefraiseEntityRenderer::new);
            EntityRenderers.register(ModEntities.MISTERX_ENTITY.get(), MisterxEntityRenderer::new);
            EntityRenderers.register(ModEntities.NICODELPRA_ENTITY.get(), NicodelpraEntityRenderer::new);
            EntityRenderers.register(ModEntities.PETLEFEU_ENTITY.get(), PetlefeuEntityRenderer::new);
            EntityRenderers.register(ModEntities.PIMPRY_ENTITY.get(), PimpryEntityRenderer::new);
            EntityRenderers.register(ModEntities.RORSHAK_ENTITY.get(), RorshakEntityRenderer::new);
            EntityRenderers.register(ModEntities.SORAX_ENTITY.get(), SoraxEntityRenderer::new);
            EntityRenderers.register(ModEntities.SYMETRIX_ENTITY.get(), SymetrixEntityRenderer::new);
            EntityRenderers.register(ModEntities.TOADY_ENTITY.get(), ToadyEntityRenderer::new);
            EntityRenderers.register(ModEntities.VAYLE_ENTITY.get(), VayleEntityRenderer::new);
            EntityRenderers.register(ModEntities.NIKAAL_ENTITY.get(), NikaalEntityRenderer::new);
            EntityRenderers.register(ModEntities.COCOLYNE_ENTITY.get(), CocolyneEntityRenderer::new);
            EntityRenderers.register(ModEntities.LAAKIN_ENTITY.get(), LaakinEntityRenderer::new);
        }
    }
}
