
package net.mcreator.kidgamer;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.kidgamer.potion.MrbeastpotionPotion;
import net.mcreator.kidgamer.item.FivedollersItem;

@KidGamerModElements.ModElement.Tag
public class MrbeastpotionrecipeBrewingRecipe extends KidGamerModElements.ModElement {
	public MrbeastpotionrecipeBrewingRecipe(KidGamerModElements instance) {
		super(instance, 87);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.DRAGON_BREATH;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == FivedollersItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), MrbeastpotionPotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
