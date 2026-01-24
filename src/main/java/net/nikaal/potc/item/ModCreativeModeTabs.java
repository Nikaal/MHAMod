package net.nikaal.potc.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nikaal.potc.PotCMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PotCMod.MOD_ID);

    public static final Supplier<CreativeModeTab> POTC_TAB = CREATIVE_MODE_TAB.register("potc",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.TREASURE_MAP.get()))
                    .title(Component.translatable("creativetab.potc"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PIRATE_COMPASS);
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
                        output.accept(ModItems.TREASURE_MAP);
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
