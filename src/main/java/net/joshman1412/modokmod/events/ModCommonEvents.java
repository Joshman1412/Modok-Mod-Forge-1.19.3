package net.joshman1412.modokmod.events;
import net.joshman1412.modokmod.ModokMod;
import net.joshman1412.modokmod.entities.Modok;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;


@Mod.EventBusSubscriber(modid = ModokMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCommonEvents
{
    //@SubscribeEvent
    //public static void entityAttributes(EntityAttributeCreationEvent event)
    //{
        //event.put(Entityinit.MODOK.get(), Modok.getRAttributes().build());
    //}
}
