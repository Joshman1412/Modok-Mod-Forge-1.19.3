package net.joshman1412.modokmod.client.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.joshman1412.modokmod.ModokMod;
import net.joshman1412.modokmod.entities.Modok;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class Modok_Passive extends EntityModel<Modok> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(ModokMod.MOD_ID, "modok_passive"), "main");
	private final ModelPart bb_main;

	public Modok_Passive(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		var mesh = new MeshDefinition();
		PartDefinition parts = mesh.getRoot();

		PartDefinition bb_main = parts.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 18).addBox(-10.0F, -9.0F, -8.0F, 20.0F, 2.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(58, 38).addBox(-7.0F, -5.0F, -7.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(58, 18).addBox(-5.0F, -9.0F, -11.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 38).addBox(3.0F, -9.0F, -11.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 50).addBox(-8.0F, -7.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(90, 95).addBox(3.0F, -9.0F, -9.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(82, 95).addBox(-5.0F, -9.0F, -9.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 78).addBox(-5.0F, -4.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-12.0F, -11.0F, -6.0F, 24.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(94, 78).addBox(-6.0F, -11.0F, -7.0F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 38).addBox(-13.0F, -13.0F, 0.0F, 26.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 68).addBox(-7.0F, -23.0F, -5.0F, 14.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-9.0F, -23.0F, -4.0F, 2.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(7.0F, -23.0F, -4.0F, 2.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(14, 86).addBox(-12.0F, -10.0F, -8.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 86).addBox(10.0F, -10.0F, -8.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 78).addBox(10.0F, -15.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(44, 68).addBox(-12.0F, -15.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(98, 30).addBox(9.0F, -15.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 97).addBox(-10.0F, -15.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(94, 81).addBox(-12.0F, -12.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 6).addBox(10.0F, -13.0F, -6.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(54, 58).addBox(-9.0F, -25.0F, 0.0F, 18.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(62, 43).addBox(-2.0F, -25.0F, -7.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(62, 38).addBox(0.0F, -25.0F, -7.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(58, 30).addBox(-9.0F, -25.0F, -4.0F, 18.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(62, 95).addBox(2.0F, -25.0F, -6.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(42, 95).addBox(-7.0F, -25.0F, -6.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 0).addBox(-7.0F, -27.0F, -4.0F, 14.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(82, 54).addBox(-7.0F, -27.0F, 8.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 0).addBox(-12.0F, -13.0F, -6.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(28, 93).addBox(10.0F, -12.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(58, 18).addBox(-10.0F, -15.0F, 0.0F, 20.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(10, 98).addBox(-4.0F, -26.0F, -6.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 97).addBox(7.0F, -26.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(96, 81).addBox(-8.0F, -26.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(34, 68).addBox(-8.0F, -27.0F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 68).addBox(7.0F, -27.0F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(mesh, 128, 128);
	}

	@Override
	public void setupAnim(Modok entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}