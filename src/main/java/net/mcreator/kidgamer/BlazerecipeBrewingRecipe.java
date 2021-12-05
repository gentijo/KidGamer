
package net.mcreator.kidgamer;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.kidgamer.item.EmttyluncherItem;
import net.mcreator.kidgamer.item.BlazebreathlauncherItem;

@KidGamerModElements.ModElement.Tag
public class BlazerecipeBrewingRecipe extends KidGamerModElements.ModElement {
	public BlazerecipeBrewingRecipe(KidGamerModElements instance) {
		super(instance, 165);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == EmttyluncherItem.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == Items.BLAZE_POWDER;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(BlazebreathlauncherItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
