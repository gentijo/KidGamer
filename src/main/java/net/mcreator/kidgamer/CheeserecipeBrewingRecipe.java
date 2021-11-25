
package net.mcreator.kidgamer;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.ItemStack;

import net.mcreator.kidgamer.item.SlicedcheeseItem;
import net.mcreator.kidgamer.item.CheeseItem;
import net.mcreator.kidgamer.item.BagItem;

@KidGamerModElements.ModElement.Tag
public class CheeserecipeBrewingRecipe extends KidGamerModElements.ModElement {
	public CheeserecipeBrewingRecipe(KidGamerModElements instance) {
		super(instance, 90);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == BagItem.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == SlicedcheeseItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(CheeseItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
