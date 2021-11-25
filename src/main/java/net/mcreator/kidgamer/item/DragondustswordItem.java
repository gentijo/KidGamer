
package net.mcreator.kidgamer.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.kidgamer.KidGamerModElements;

import java.util.List;

@KidGamerModElements.ModElement.Tag
public class DragondustswordItem extends KidGamerModElements.ModElement {
	@ObjectHolder("kid_gamer:dragondustsword")
	public static final Item block = null;
	public DragondustswordItem(KidGamerModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 200;
			}

			public float getEfficiency() {
				return 25.5f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 25;
			}

			public int getEnchantability() {
				return 25;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DragondustemItem.block));
			}
		}, 3, 11.5f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Old dragon sword lost in the blocks gaining its streangh back"));
			}
		}.setRegistryName("dragondustsword"));
	}
}
