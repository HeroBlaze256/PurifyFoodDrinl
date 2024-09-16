package com.heroblaze.purifyfooddrink.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;

public class Purifier extends ItemBase{

	public Purifier(String name) {
		super(name);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
		ItemStack item = playerIn.getHeldItem(handIn);
		Item itemToChange = getByNameOrId("minecraft:rotten_flesh");
		Item changedItem = getByNameOrId("minecraft:porkchop");
		ItemStack j = new ItemStack(itemToChange);
		int i = 0;
		for(ItemStack itemChecking : playerIn.inventory.mainInventory) {
			if(itemChecking.isItemEqual(j)) {
				playerIn.inventory.decrStackSize(i, 1);
				ItemHandlerHelper.giveItemToPlayer(playerIn, new ItemStack(changedItem, 1));
			}
			else {
				i++;
			}
		}
		//item.damageItem(1, playerIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}
}
