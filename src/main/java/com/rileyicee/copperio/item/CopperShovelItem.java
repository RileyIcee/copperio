
package com.rileyicee.copperio.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.rileyicee.copperio.init.CopperioModTabs;

public class CopperShovelItem extends ShovelItem {
	public CopperShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 190;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
			}
		}, 1, -3f, new Item.Properties().tab(CopperioModTabs.TAB_COPPER_IO_TAB));
	}
}
