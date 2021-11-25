
package net.mcreator.kidgamer.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DragonbreathPotion {
	@ObjectHolder("kid_gamer:dragonbreath")
	public static final Potion potionType = null;
	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(Effects.SPEED, 3600, 0, false, true), new EffectInstance(Effects.HASTE, 3600, 0, false, true),
					new EffectInstance(Effects.STRENGTH, 3600, 0, false, true), new EffectInstance(Effects.INSTANT_HEALTH, 3600, 0, false, true),
					new EffectInstance(Effects.JUMP_BOOST, 3600, 0, false, true), new EffectInstance(Effects.REGENERATION, 3600, 0, false, true),
					new EffectInstance(Effects.RESISTANCE, 3600, 0, false, true), new EffectInstance(Effects.INVISIBILITY, 3600, 0, false, true),
					new EffectInstance(Effects.NIGHT_VISION, 3600, 0, false, true), new EffectInstance(Effects.WATER_BREATHING, 3600, 0, false, true),
					new EffectInstance(Effects.HEALTH_BOOST, 3600, 0, false, true), new EffectInstance(Effects.ABSORPTION, 3600, 0, false, true),
					new EffectInstance(Effects.FIRE_RESISTANCE, 3600, 0, false, true),
					new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 3600, 0, false, true), new EffectInstance(Effects.LUCK, 3600, 0, false, true));
			setRegistryName("dragonbreath");
		}
	}
}
