package net.nikaal.mhamod.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.MapItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.saveddata.maps.MapDecorationTypes;
import net.minecraft.world.level.saveddata.maps.MapItemSavedData;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class EncodedTreasureMapItem extends Item {

    private static final BlockPos TREASURE_POS = new BlockPos(1936, 64, 52);

    public EncodedTreasureMapItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable("tooltip.mhamod.encoded_treasure_map"));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, @NotNull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        // côté client → succès visuel uniquement
        if (level.isClientSide()) {
            return InteractionResultHolder.success(stack);
        }

        ServerLevel serverLevel = (ServerLevel) level;

        // création de la map
        ItemStack treasureMap = MapItem.create(serverLevel, TREASURE_POS.getX(), TREASURE_POS.getZ(), (byte) 2, true, true);

        // custom_data
        CompoundTag tag = new CompoundTag();
        tag.putBoolean("mhamod_treasure_map", true);
        treasureMap.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));

        // croix rouge
        MapItemSavedData data = MapItem.getSavedData(treasureMap, serverLevel);
        if (data != null) {
            data.addTargetDecoration(
                    treasureMap,
                    TREASURE_POS,
                    "+",
                    MapDecorationTypes.RED_X
            );

            data.setDirty();
        }

        // consomme l'item
        stack.shrink(1);

        // donne la carte
        if (stack.isEmpty()) {
            return InteractionResultHolder.success(treasureMap);
        }

        if (!player.getInventory().add(treasureMap)) {
            player.drop(treasureMap, false);
        }

        return InteractionResultHolder.success(stack);
    }
}
