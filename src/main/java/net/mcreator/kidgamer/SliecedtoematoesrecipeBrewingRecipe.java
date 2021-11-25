
package net.mcreator.kidgamer;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.kidgamer.item.SlicedtoematoesItem;
import net.mcreator.kidgamer.item.DirtytoemeatoesItem;

@KidGamerModElements.ModElement.Tag
public class SliecedtoematoesrecipeBrewingRecipe extends KidGamerModElements.ModElement {
	public SliecedtoematoesrecipeBrewingRecipe(KidGamerModElements instance) {
		super(instance, 80);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == DirtytoemeatoesItem.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == Items.WATER_BUCKET;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(SlicedtoematoesItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
