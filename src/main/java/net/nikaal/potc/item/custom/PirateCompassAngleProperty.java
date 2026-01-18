package net.nikaal.potc.item.custom;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class PirateCompassAngleProperty {

    public static float getAngle(ItemStack stack, ClientLevel level, LivingEntity entity, int seed) {
        if (entity == null || level == null) {
            return 0.0F;
        }

        // Mauvaise dimension → comportement "aléatoire" vanilla
        if (!level.dimension().equals(PirateCompassTarget.DIMENSION)) {
            return Mth.positiveModulo(seed / 2147483648.0F, 1.0F);
        }

        double dx = PirateCompassTarget.POTC1_NEW_PROVIDENCE_POSITION.getX() + 0.5D - entity.getX();
        double dz = PirateCompassTarget.POTC1_NEW_PROVIDENCE_POSITION.getZ() + 0.5D - entity.getZ();

        // Angle vers la cible (0 = Nord)
        double angleToTarget = Math.atan2(dx, -dz);

        // Rotation du joueur (en radians)
        double playerYaw = Math.toRadians(entity.getYRot());

        return (float) Mth.positiveModulo(
                (angleToTarget - playerYaw + Math.PI) / (Math.PI * 2D),
                1.0D
        );
    }

    private PirateCompassAngleProperty() {}
}
