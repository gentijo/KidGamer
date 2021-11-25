
package net.mcreator.kidgamer;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.Blocks;

import net.mcreator.kidgamer.potion.DragonbreathPotion;
import net.mcreator.kidgamer.potion.CursePotion;

@KidGamerModElements.ModElement.Tag
public class CurserecipeBrewingRecipe extends KidGamerModElements.ModElement {
	public CurserecipeBrewingRecipe(KidGamerModElements instance) {
		super(instance, 64);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			Item inputItem = input.getItem();
			return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION)
					&& PotionUtils.getPotionFromItem(input) == DragonbreathPotion.potionType;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == Blocks.TNT.asItem();
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(input.getItem()), CursePotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
