
package net.mcreator.kidgamer.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MrbeastpotionPotion {
	@ObjectHolder("kid_gamer:mrbeastpotion")
	public static final Potion potionType = null;
	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 10000, 0, false, true), new EffectInstance(Effects.LUCK, 10000, 0, false, true),
					new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 10000, 0, false, true), new EffectInstance(Effects.LUCK, 10000, 0, false, true),
					new EffectInstance(Effects.ABSORPTION, 10000, 0, false, true));
			setRegistryName("mrbeastpotion");
		}
	}
}
