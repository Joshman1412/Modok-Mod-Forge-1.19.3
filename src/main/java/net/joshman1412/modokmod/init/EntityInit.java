package net.joshman1412.modokmod.init;

import net.joshman1412.modokmod.ModokMod;
import net.joshman1412.modokmod.entities.Modok;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit
{
public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ModokMod.MOD_ID);

public static final RegistryObject<EntityType<Modok>> MODOK = ENTITIES.register("modok", () -> EntityType.Builder.of(Modok::new, MobCategory.CREATURE).build(ModokMod.MOD_ID + ":modok"));
}
