package net.nikaal.mhamod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nikaal.mhamod.MHAMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MHAMod.MOD_ID);

    public static final Supplier<CreativeModeTab> MHAMOD_TAB = CREATIVE_MODE_TAB.register("mhamod",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.VICTORY_TROPHY.get()))
                    .title(Component.translatable("creativetab.mhamod"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ADVENTURER_COMPASS);
                        output.accept(ModItems.DIAL);
                        output.accept(ModItems.NEEDLE);
                        output.accept(ModItems.CASING);
                        output.accept(ModItems.SCREW);
                        output.accept(ModItems.GEAR);
                        output.accept(ModItems.PIVOT);
                        output.accept(ModItems.BEARING);
                        output.accept(ModItems.LENS);
                        output.accept(ModItems.CELL);
                        output.accept(ModItems.MAP_PIECE_1);
                        output.accept(ModItems.MAP_PIECE_2);
                        output.accept(ModItems.MAP_PIECE_3);
                        output.accept(ModItems.MAP_PIECE_4);
                        output.accept(ModItems.MAP_PIECE_5);
                        output.accept(ModItems.MAP_PIECE_6);
                        output.accept(ModItems.MAP_PIECE_7);
                        output.accept(ModItems.MAP_PIECE_8);
                        output.accept(ModItems.MAP_PIECE_9);
                        output.accept(ModItems.ENCODED_TREASURE_MAP);
                        output.accept(ModItems.AELWYN_TROPHY);
                        output.accept(ModItems.CONJONCTIVIX_TROPHY);
                        output.accept(ModItems.DEEZ_TROPHY);
                        output.accept(ModItems.HEAVENLORD_TROPHY);
                        output.accept(ModItems.IPLAY4YOU_TROPHY);
                        output.accept(ModItems.JOLIROUGE_TROPHY);
                        output.accept(ModItems.LUDOLIK_TROPHY);
                        output.accept(ModItems.MAESTROMM_TROPHY);
                        output.accept(ModItems.MIKEFRAISE_TROPHY);
                        output.accept(ModItems.MISTERX_TROPHY);
                        output.accept(ModItems.NICODELPRA_TROPHY);
                        output.accept(ModItems.PETLEFEU_TROPHY);
                        output.accept(ModItems.PIMPRY_TROPHY);
                        output.accept(ModItems.RORSHAK_TROPHY);
                        output.accept(ModItems.SORAX_TROPHY);
                        output.accept(ModItems.SYMETRIX_TROPHY);
                        output.accept(ModItems.TOADY_TROPHY);
                        output.accept(ModItems.VAYLE_TROPHY);
                        output.accept(ModItems.VICTORY_TROPHY);
                        output.accept(ModItems.COCOLYNE_TROPHY);
                        output.accept(ModItems.LAAKIN_TROPHY);
                        output.accept(ModItems.NIKAAL_TROPHY);
                        output.accept(ModItems.AELWYN_SPAWN_EGG);
                        output.accept(ModItems.CONJONCTIVIX_SPAWN_EGG);
                        output.accept(ModItems.DEEZ_SPAWN_EGG);
                        output.accept(ModItems.HEAVENLORD_SPAWN_EGG);
                        output.accept(ModItems.IPLAY4YOU_SPAWN_EGG);
                        output.accept(ModItems.JOLIROUGE_SPAWN_EGG);
                        output.accept(ModItems.LUDOLIK_SPAWN_EGG);
                        output.accept(ModItems.MAESTROMM_SPAWN_EGG);
                        output.accept(ModItems.MIKEFRAISE_SPAWN_EGG);
                        output.accept(ModItems.MISTERX_SPAWN_EGG);
                        output.accept(ModItems.NICODELPRA_SPAWN_EGG);
                        output.accept(ModItems.PETLEFEU_SPAWN_EGG);
                        output.accept(ModItems.PIMPRY_SPAWN_EGG);
                        output.accept(ModItems.RORSHAK_SPAWN_EGG);
                        output.accept(ModItems.SORAX_SPAWN_EGG);
                        output.accept(ModItems.SYMETRIX_SPAWN_EGG);
                        output.accept(ModItems.TOADY_SPAWN_EGG);
                        output.accept(ModItems.VAYLE_SPAWN_EGG);
                        output.accept(ModItems.NIKAAL_SPAWN_EGG);
                        output.accept(ModItems.COCOLYNE_SPAWN_EGG);
                        output.accept(ModItems.LAAKIN_SPAWN_EGG);
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
