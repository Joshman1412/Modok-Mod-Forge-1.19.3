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

public class ModokModel extends EntityModel<Modok>
{
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(ModokMod.MOD_ID, "modok_entity"), "main");


	private final ModelPart Body;
	private final ModelPart Saddle;

	public ModokModel(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Saddle = root.getChild("Saddle");
	}

	public static LayerDefinition createBodyLayer() {
		var mesh = new MeshDefinition();
		PartDefinition parts = mesh.getRoot();

		PartDefinition Body = parts.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 19.0F, 7.0F));

		PartDefinition RightArmGroup = Body.addOrReplaceChild("RightArmGroup", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		RightArmGroup.addOrReplaceChild("RightArmJoint_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-31.0F, -12.0F, -3.0F, 3.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0212F, -0.0496F, 0.9101F));

		RightArmGroup.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-28.0F, 13.0F, -2.0F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0713F, -0.0642F, 1.3324F));

		PartDefinition LeftArmGroup = Body.addOrReplaceChild("LeftArmGroup", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		LeftArmGroup.addOrReplaceChild("LeftArmJoint_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-31.0F, -12.0F, -3.0F, 3.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 3.0162F, 0.1295F, 2.2222F));

		LeftArmGroup.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-28.0F, 13.0F, -2.0F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 2.9426F, 0.0945F, 1.799F));

		PartDefinition LeftLegGroup = Body.addOrReplaceChild("LeftLegGroup", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		LeftLegGroup.addOrReplaceChild("LeftLegJoint_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-31.0F, -12.0F, -3.0F, 3.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 21.0F, -1.0F, -1.5753F, -0.6618F, 1.5997F));

		LeftLegGroup.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-28.0F, 13.0F, -2.0F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 21.0F, -1.0F, -1.6128F, -0.2405F, 1.6263F));

		PartDefinition RightLegGroup = Body.addOrReplaceChild("RightLegGroup", CubeListBuilder.create(), PartPose.offset(-15.0F, 0.0F, 0.0F));

		RightLegGroup.addOrReplaceChild("RightLegJoint_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-31.0F, -12.0F, -3.0F, 3.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 21.0F, -1.0F, -1.5753F, -0.6618F, 1.5997F));

		RightLegGroup.addOrReplaceChild("RightLeg_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-28.0F, 13.0F, -2.0F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 21.0F, -1.0F, -1.6128F, -0.2405F, 1.6263F));

		Body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, -43.0F, -8.0F, 30.0F, 30.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, -7.0F));

		parts.addOrReplaceChild("Saddle", CubeListBuilder.create().texOffs(0, 60).addBox(-5.0F, 0.0F, -6.0F, 10.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 9.0F));

		return LayerDefinition.create(mesh, 128, 128);
	}

	@Override
	public void setupAnim(Modok entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Saddle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}