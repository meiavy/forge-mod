package com.example.examplemod;

import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
//护腿
public class MyLeggings extends ItemSword {

	public static ToolMaterial MySwordMaterial = EnumHelper.addToolMaterial("MySword", 3, 9999, 100, 100, 100);
	
	public MyLeggings(String unlocalizedName,ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName("examplemod" + ":" + "MySword");
	}

}
