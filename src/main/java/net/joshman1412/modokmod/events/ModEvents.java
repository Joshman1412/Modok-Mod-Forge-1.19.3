package net.joshman1412.modokmod.events;

import net.joshman1412.modokmod.ModokMod;
import net.joshman1412.modokmod.init.Iteminit;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.CreativeModeTabEvent;


@Mod.EventBusSubscriber(modid = ModokMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void addItemsToTabs(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == CreativeModeTabs.SPAWN_EGGS)
        {
            event.accept(Iteminit.MODOK_SPAWN_EGG);
        }
        if (event.getTab() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(Iteminit.MODOK_FRAGMENT);
        }
    }
}