
package net.mcreator.kidgamer.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.BlockState;

import net.mcreator.kidgamer.KidGamerModElements;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

@KidGamerModElements.ModElement.Tag
public class DragonscalebowItem extends KidGamerModElements.ModElement {
	@ObjectHolder("kid_gamer:dragonscalebow")
	public static final Item block = null;
	public DragonscalebowItem(KidGamerModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
			@Override
			public boolean hasContainerItem() {
				return true;
			}

			@Override
			public ItemStack getContainerItem(ItemStack itemstack) {
				return new ItemStack(this);
			}

			@Override
			public boolean isRepairable(ItemStack itemstack) {
				return false;
			}
		}.setRegistryName("dragonscalebow"));
	}
	private static class ItemToolCustom extends Item {
		protected ItemToolCustom() {
			super(new Item.Properties().group(ItemGroup.COMBAT).maxDamage(55555).isImmuneToFire());
		}

		@Override
		public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
			if (equipmentSlot == EquipmentSlotType.MAINHAND) {
				ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
				builder.putAll(super.getAttributeModifiers(equipmentSlot));
				builder.put(Attributes.ATTACK_DAMAGE,
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 55553f, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.ATTACK_SPEED,
						new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", 1, AttributeModifier.Operation.ADDITION));
				return builder.build();
			}
			return super.getAttributeModifiers(equipmentSlot);
		}

		@Override
		public boolean canHarvestBlock(BlockState state) {
			return 551 >= state.getHarvestLevel();
		}

		@Override
		public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
			return 5554f;
		}

		@Override
		public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
			stack.damageItem(1, attacker, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
			stack.damageItem(1, entityLiving, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public int getItemEnchantability() {
			return 5555;
		}
	}
}
