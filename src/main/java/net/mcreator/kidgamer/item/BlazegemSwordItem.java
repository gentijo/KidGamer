
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
public class BlazegemSwordItem extends KidGamerModElements.ModElement {
	@ObjectHolder("kid_gamer:blazegem_sword")
	public static final Item block = null;
	public BlazegemSwordItem(KidGamerModElements instance) {
		super(instance, 196);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2719;
			}

			public float getEfficiency() {
				return 60f;
			}

			public float getAttackDamage() {
				return 55553f;
			}

			public int getHarvestLevel() {
				return 11;
			}

			public int getEnchantability() {
				return 200;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BlazegemItem.block));
			}
		}, 3, -3.99f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Burn magic"));
			}
		}.setRegistryName("blazegem_sword"));
	}
}
