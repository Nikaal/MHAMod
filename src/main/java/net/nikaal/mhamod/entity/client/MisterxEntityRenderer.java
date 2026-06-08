package net.nikaal.mhamod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.nikaal.mhamod.MHAMod;
import net.nikaal.mhamod.entity.custom.MisterxEntity;
import org.jetbrains.annotations.NotNull;

public class MisterxEntityRenderer extends MobRenderer<MisterxEntity, PlayerModel<MisterxEntity>> {

    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(MHAMod.MOD_ID, "textures/entity/misterx_entity.png");

    public MisterxEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new PlayerModel<>(context.bakeLayer(ModelLayers.PLAYER), false), 0.5F);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull MisterxEntity misterxEntity) {
        return TEXTURE;
    }

    @Override
    public void render(@NotNull MisterxEntity entity, float entityYaw, float partialTicks, @NotNull PoseStack poseStack, @NotNull MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
