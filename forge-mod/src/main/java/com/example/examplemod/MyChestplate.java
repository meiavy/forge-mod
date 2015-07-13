package com.example.examplemod;

import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
//胸甲
public class MyChestplate extends ItemSword {

	public static ToolMaterial MySwordMaterial = EnumHelper.addToolMaterial("MySword", 3, 9999, 100, 100, 100);
	
	public MyChestplate(String unlocalizedName,ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName("examplemod" + ":" + "MySword");
	}

}
