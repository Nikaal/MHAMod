package net.nikaal.mhamod.event;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.MapItem;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.saveddata.maps.MapDecorationTypes;
import net.minecraft.world.level.saveddata.maps.MapItemSavedData;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.nikaal.mhamod.item.ModItems;

public class TreasureMapCraftHandler {

    // Coordonnées FIXES du trésor
    private static final BlockPos TREASURE_POS = new BlockPos(1936, 64, 52);

    @SubscribeEvent
    public void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {

        ItemStack crafted = event.getCrafting();

        // Vérifie si l'item crafté est notre item intermédiaire
        if (!crafted.is(ModItems.TREASURE_MAP.get())) {
            return;
        }

        Player player = event.getEntity();
        Level level = player.level();

        if (!(level instanceof ServerLevel serverLevel)) {
            return; // sécurité côté client
        }

        // Crée la vraie carte de trésor
        ItemStack treasureMap = MapItem.create(
                level,
                TREASURE_POS.getX(),
                TREASURE_POS.getZ(),
                (byte) 2,
                true,
                true
        );

        // Tag custom
        CompoundTag tag = new CompoundTag();
        tag.putBoolean("mhamod_treasure_map", true);

        treasureMap.set(
                DataComponents.CUSTOM_DATA,
                CustomData.of(tag)
        );

        // Croix rouge
        MapItemSavedData data = MapItem.getSavedData(treasureMap, level);
        if (data != null) {
            data.addTargetDecoration(
                    treasureMap,
                    TREASURE_POS,
                    "+",
                    MapDecorationTypes.RED_X
            );
            data.setDirty();
        }

        // Remplace le résultat du craft dans le curseur du joueur
        AbstractContainerMenu container = player.containerMenu;
        container.setCarried(treasureMap);
    }
}
