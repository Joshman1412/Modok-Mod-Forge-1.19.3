package net.joshman1412.modokmod.procedures;

import net.joshman1412.modokmod.entities.Modok;
import net.minecraft.world.entity.Entity;

public class DownOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getVehicle()) instanceof Modok == true) {
			(entity.getVehicle()).getPersistentData().putDouble("VerticalMovement", 0);
		}
	}
}
