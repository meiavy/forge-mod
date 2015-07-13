package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class MyGun extends Item {

	public static ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("MyGun", 3, 9999, 100, 100, 100);
	
	public MyGun() {
		super();
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("MyGun");
      this.setTextureName("examplemod" + ":" + "MyGun");
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		if (par3EntityPlayer.capabilities.isCreativeMode
				|| par3EntityPlayer.inventory.consumeInventoryItem(Items.arrow)) {
			
			par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F,
					0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

			if (!par2World.isRemote) {
				par2World.spawnEntityInWorld(new EntityMyBolt(par2World,
						par3EntityPlayer));
			}
		}
		return par1ItemStack;
	}
}
