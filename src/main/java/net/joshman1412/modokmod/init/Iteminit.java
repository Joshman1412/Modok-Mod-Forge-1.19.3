package net.joshman1412.modokmod.init;

import net.joshman1412.modokmod.ModokMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Iteminit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModokMod.MOD_ID);

    public static final RegistryObject<ForgeSpawnEggItem> MODOK_SPAWN_EGG = ITEMS.register("modok_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.MODOK, 0xFF55AA, 0x27DA9F, new Item.Properties().stacksTo(16)));

}
