package net.joshman1412.modokmod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;

public class ModokOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("VerticalMovement") == 1) {
			entity.setDeltaMovement(new Vec3(0, 0.3, 0));
		} else if (entity.getPersistentData().getDouble("VerticalMovement") == -1) {
			entity.setDeltaMovement(new Vec3(0, (-0.3), 0));
		}
	}
}
