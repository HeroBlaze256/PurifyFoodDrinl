package com.heroblaze.purifyfooddrink.init;

import java.util.ArrayList;
import java.util.List;

import com.heroblaze.purifyfooddrink.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final Item PURIFIER = new ItemBase("purifier");
	/**
	 * If I want to make more items, copy line 13 and change the name.
	 * Then add a JSON file with that item, add a line to en_us.lang,
	 * and add a texture to it.
	 */
}
