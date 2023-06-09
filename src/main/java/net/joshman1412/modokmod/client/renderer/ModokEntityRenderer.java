package net.joshman1412.modokmod.client.renderer;

import net.joshman1412.modokmod.ModokMod;

import net.joshman1412.modokmod.client.models.Modok_Aggresive;
import net.joshman1412.modokmod.entities.Modok;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ModokEntityRenderer extends MobRenderer<Modok, Modok_Aggresive>
{
private static final ResourceLocation TEXTURE = new ResourceLocation(ModokMod.MOD_ID, "textures/entities/modok_agg.png");


    public ModokEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new Modok_Aggresive(ctx.bakeLayer(Modok_Aggresive.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Modok entity)
    {
        return TEXTURE;
    }
}
