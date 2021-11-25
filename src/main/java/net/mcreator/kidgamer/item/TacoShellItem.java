
package net.mcreator.kidgamer.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.kidgamer.KidGamerModElements;

import java.util.List;

@KidGamerModElements.ModElement.Tag
public class TacoShellItem extends KidGamerModElements.ModElement {
	@ObjectHolder("kid_gamer:taco_shell")
	public static final Item block = null;
	public TacoShellItem(KidGamerModElements instance) {
		super(instance, 69);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.RARE)
					.food((new Food.Builder()).hunger(20).saturation(0.3f).setAlwaysEdible().build()));
			setRegistryName("taco_shell");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 5;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.SPEAR;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Part for dragon food"));
		}
	}
}
