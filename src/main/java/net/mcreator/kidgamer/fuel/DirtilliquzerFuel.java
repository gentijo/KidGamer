
package net.mcreator.kidgamer.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.kidgamer.block.DirtliquidBlock;

@Mod.EventBusSubscriber
public class DirtilliquzerFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == DirtliquidBlock.block.asItem())
			event.setBurnTime(5000);
	}
}
