package com.heroblaze.purifyfooddrink.tabs;

import com.heroblaze.purifyfooddrink.init.ModItems;
import com.heroblaze.purifyfooddrink.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PurifierTab extends CreativeTabs{

	public PurifierTab() {
		super(Reference.MOD_ID);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.PURIFIER);
	}
}
