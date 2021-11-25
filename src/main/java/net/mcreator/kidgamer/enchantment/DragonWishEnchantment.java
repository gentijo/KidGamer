
package net.mcreator.kidgamer.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.kidgamer.KidGamerModElements;

@KidGamerModElements.ModElement.Tag
public class DragonWishEnchantment extends KidGamerModElements.ModElement {
	@ObjectHolder("kid_gamer:dragon_wish")
	public static final Enchantment enchantment = null;
	public DragonWishEnchantment(KidGamerModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("dragon_wish"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.BOW, slots);
		}

		@Override
		public int getMinLevel() {
			return 55;
		}

		@Override
		public int getMaxLevel() {
			return 55;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return true;
		}
	}
}
