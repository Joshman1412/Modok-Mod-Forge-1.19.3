package net.joshman1412.modokmod;

import com.mojang.logging.LogUtils;
import net.joshman1412.modokmod.entities.Modok;
import net.joshman1412.modokmod.init.EntityInit;
import net.joshman1412.modokmod.init.Iteminit;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(ModokMod.MOD_ID)
public class ModokMod
{
    public static final String MOD_ID = "modokmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ModokMod()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        EntityInit.REGISTRY.register(bus);
        Iteminit.ITEMS.register(bus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }
}
