package com.heroblaze.purifyfooddrink.items;

import com.heroblaze.purifyfooddrink.Main;
import com.heroblaze.purifyfooddrink.init.ModItems;
import com.heroblaze.purifyfooddrink.util.IHasModel;
import com.heroblaze.purifyfooddrink.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Reference.PFD_TAB);
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0 ,"inventory");
	}

}
