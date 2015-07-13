package com.example.examplemod;

import net.minecraft.item.ItemArmor;
//靴子
public class MyBoots extends ItemArmor {

	public MyBoots() {

        super(MyMaterials.ArmorMaterial, 4, 3);
        this.setUnlocalizedName("MyBoots");
        this.setTextureName("examplemod" + ":" + "MySword");
        
	}
	
	
	


}
