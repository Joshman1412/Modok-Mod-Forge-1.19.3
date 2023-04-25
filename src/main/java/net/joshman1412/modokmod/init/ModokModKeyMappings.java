package net.joshman1412.modokmod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.joshman1412.modokmod.networking.UpMessage;
import net.joshman1412.modokmod.networking.DownMessage;
import net.joshman1412.modokmod.ModokMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ModokModKeyMappings {
	public static final KeyMapping DOWN = new KeyMapping("key.modok.down", GLFW.GLFW_KEY_LEFT_CONTROL, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ModokMod.PACKET_HANDLER.sendToServer(new DownMessage(0, 0));
				DownMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				DOWN_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - DOWN_LASTPRESS);
				ModokMod.PACKET_HANDLER.sendToServer(new DownMessage(1, dt));
				DownMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping UP = new KeyMapping("key.modok.up", GLFW.GLFW_KEY_SPACE, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ModokMod.PACKET_HANDLER.sendToServer(new UpMessage(0, 0));
				UpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				UP_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - UP_LASTPRESS);
				ModokMod.PACKET_HANDLER.sendToServer(new UpMessage(1, dt));
				UpMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long DOWN_LASTPRESS = 0;
	private static long UP_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(DOWN);
		event.register(UP);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				DOWN.consumeClick();
				UP.consumeClick();
			}
		}
	}
}
