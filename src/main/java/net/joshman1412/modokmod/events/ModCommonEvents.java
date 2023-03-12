package net.joshman1412.modokmod.events;
import net.joshman1412.modokmod.entities.Modok;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.joshman1412.modokmod.init.EntityInit;


public class ModCommonEvents
{

    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event)
    {
        event.put(EntityInit.MODOK.get(), Modok.getModokAttributes().build());
    }
}
