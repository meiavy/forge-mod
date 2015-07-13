package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod {
	public static final String MODID = "examplemod";
	public static final String VERSION = "1.0";

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// some example code
		System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());

	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Item myGun = new MyGun();
		GameRegistry.registerItem(myGun, "MyGun");
		Item mySword = new MySword("MySword", MySword.MySwordMaterial);
		GameRegistry.registerItem(mySword, "MySword");
		
		Item myBoots = new MyBoots();
		GameRegistry.registerItem(myBoots, "MyBoots");

		GameRegistry.addRecipe(new ItemStack(GameRegistry.findItem("examplemod", "MySword"), 1), new Object[] {
				"AA", 
				'A', Blocks.dirt });
		
		GameRegistry.addRecipe(new ItemStack(GameRegistry.findItem("examplemod", "MyBoots"), 1), new Object[] {
			"AA", 
			"AA",
			'A', Blocks.dirt });

		// RenderingRegistry.registerEntityRenderingHandler(EntityMyBolt.class,
		// new RenderArrow());
	}
}
