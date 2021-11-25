
package net.mcreator.kidgamer.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CursePotion {
	@ObjectHolder("kid_gamer:curse")
	public static final Potion potionType = null;
	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(Effects.SLOWNESS, 3600, 0, false, true), new EffectInstance(Effects.MINING_FATIGUE, 3600, 0, false, true),
					new EffectInstance(Effects.INSTANT_DAMAGE, 3600, 0, false, true), new EffectInstance(Effects.NAUSEA, 3600, 0, false, true),
					new EffectInstance(Effects.BLINDNESS, 3600, 0, false, true), new EffectInstance(Effects.HUNGER, 3600, 0, false, true),
					new EffectInstance(Effects.POISON, 3600, 0, false, true), new EffectInstance(Effects.WEAKNESS, 3600, 0, false, true),
					new EffectInstance(Effects.WITHER, 3600, 0, false, true), new EffectInstance(Effects.LEVITATION, 3600, 0, false, true),
					new EffectInstance(Effects.BAD_OMEN, 3600, 0, false, true), new EffectInstance(Effects.UNLUCK, 3600, 0, false, true),
					new EffectInstance(Effects.UNLUCK, 3600, 0, false, true), new EffectInstance(Effects.UNLUCK, 3600, 0, false, true),
					new EffectInstance(Effects.BAD_OMEN, 3600, 0, false, true));
			setRegistryName("curse");
		}
	}
}
