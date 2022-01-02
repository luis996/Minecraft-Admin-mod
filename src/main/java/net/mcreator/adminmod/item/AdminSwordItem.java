
package net.mcreator.adminmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.adminmod.itemgroup.AdminToolsItemGroup;
import net.mcreator.adminmod.AdminModModElements;

@AdminModModElements.ModElement.Tag
public class AdminSwordItem extends AdminModModElements.ModElement {
	@ObjectHolder("admin_mod:admin_sword")
	public static final Item block = null;
	public AdminSwordItem(AdminModModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100000;
			}

			public float getEfficiency() {
				return 100000f;
			}

			public float getAttackDamage() {
				return 99998f;
			}

			public int getHarvestLevel() {
				return 71;
			}

			public int getEnchantability() {
				return 100000;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 46f, new Item.Properties().group(AdminToolsItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("admin_sword"));
	}
}
