package net.nikaal.potc.item.custom;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.GlobalPos;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.PlayerChatMessage;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CompassItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.nbt.CompoundTag;

public class PirateCompassItem extends Item {

    public PirateCompassItem(Properties properties) {
        super(properties);
    }

    /*
    @NotNull
    @Override
    public InteractionResult useOn(UseOnContext context) {
        ItemStack is = context.getItemInHand();
        BlockPos bp = context.getClickedPos();
        String message = "X:" + bp.getX() + ";Y:" + bp.getY() + ";Z:" + bp.getZ();
        assert Minecraft.getInstance().player != null;
        Minecraft.getInstance().player.sendSystemMessage(Component.literal(message));
        return InteractionResult.SUCCESS;
    }

    @NotNull
    @Override
    public InteractionResultHolder<ItemStack> use(@NotNull Level level, @NotNull Player player, @NotNull InteractionHand usedHand) {
        String message = "X:" + player.getX() + ";Y:" + player.getY() + ";Z:" + player.getZ();
        player.sendSystemMessage(Component.literal(message));
        return InteractionResultHolder.pass(player.getItemInHand(usedHand));
    }

    private static void setPosition(ItemStack stack) {
        CompoundTag ct = new CompoundTag();
        BlockPos bp = new BlockPos(911, 75, 113);
        assert Minecraft.getInstance().player != null;
        //ct.putString("destination_dimension", Minecraft.getInstance().player.getDimensions().get);
        ct.put("destination_position", NbtUtils.writeBlockPos(bp));
        //stack.ta
    }

    private static BlockPos getDestination(ItemStack stack) {
        //return NbtUtils.readBlockPos(stack.getTags().)
    }
    */
}
