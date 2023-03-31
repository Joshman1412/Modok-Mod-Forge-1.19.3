package net.joshman1412.modokmod.events;

import net.joshman1412.modokmod.ModokMod;
import net.joshman1412.modokmod.client.models.ModokModel;
import net.joshman1412.modokmod.client.models.Modok_Aggresive;
import net.joshman1412.modokmod.client.renderer.ModokEntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.joshman1412.modokmod.init.EntityInit;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ModokMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents
{
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event)
    {

    }
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.MODOK.get(), ModokEntityRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(Modok_Aggresive.LAYER_LOCATION, Modok_Aggresive::createBodyLayer);
    }
}
