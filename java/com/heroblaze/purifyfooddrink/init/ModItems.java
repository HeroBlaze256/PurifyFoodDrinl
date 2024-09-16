package com.heroblaze.purifyfooddrink.init;

import java.util.ArrayList;
import java.util.List;

import com.heroblaze.purifyfooddrink.items.Purifier;

import net.minecraft.item.Item;

public class ModItems {

	/**
	 * If I want to make more items, copy line 13 and change the name.
	 * Then add a JSON file with that item, add a line to en_us.lang,
	 * and add a texture to it.
	 */
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item PURIFIER = new Purifier("purifier").setMaxStackSize(1);
	
}
