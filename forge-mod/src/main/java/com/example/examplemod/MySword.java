package com.example.examplemod;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class MySword extends ItemSword {

	public static ToolMaterial MySwordMaterial = EnumHelper.addToolMaterial("MySword", 3, 9999, 1000, 1000, 1000);
	
	public MySword(String unlocalizedName,ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName("examplemod" + ":" + "MySword");
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase hitEntity, EntityLivingBase attackingEntity) {
		
	   hitEntity.addPotionEffect(new PotionEffect(Potion.weakness.getId(),500,4));
		return true;
	}

}
