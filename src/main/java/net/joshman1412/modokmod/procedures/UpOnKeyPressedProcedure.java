package net.joshman1412.modokmod.procedures;

import net.minecraft.world.entity.Entity;

import net.joshman1412.modokmod.entities.Modok;

public class UpOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getVehicle()) instanceof Modok == true) {
			entity.getPersistentData().putDouble("VerticalMovement", 1);
		}
	}
}
