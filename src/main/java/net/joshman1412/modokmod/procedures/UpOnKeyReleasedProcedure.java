package net.joshman1412.modokmod.procedures;

import net.joshman1412.modokmod.entities.Modok;
import net.minecraft.world.entity.Entity;

public class UpOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Modok == true) {
			entity.getPersistentData().putDouble("VerticalMovement", 0);
		}
	}
}
