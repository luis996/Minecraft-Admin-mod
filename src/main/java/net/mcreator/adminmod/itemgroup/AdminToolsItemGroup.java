
package net.mcreator.adminmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.adminmod.item.AdminSwordItem;
import net.mcreator.adminmod.AdminModModElements;

@AdminModModElements.ModElement.Tag
public class AdminToolsItemGroup extends AdminModModElements.ModElement {
	public AdminToolsItemGroup(AdminModModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabadmin_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AdminSwordItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
