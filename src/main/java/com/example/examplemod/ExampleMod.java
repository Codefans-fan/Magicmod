package main.java.com.example.examplemod;

import main.common.Common;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod {
	public static final String MODID = "examplemod";
	public static final String VERSION = "1.0";

	@SidedProxy(clientSide = "main.client.ExampleCommonClient", serverSide = "main.common.Common")
	public static Common proxy;

	public static Block blockTeset;

	@EventHandler
	public void preLoad(FMLPreInitializationEvent event) {
		blockTeset = new NewBlockTest(new Material(MapColor.diamondColor));

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// some example code
		System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
		System.out.println("This is my first mod");
		GameRegistry.registerBlock(blockTeset, "TestBlock");

		LanguageRegistry.addName(blockTeset, "Test Block");

	}

	@EventHandler
	public void postLoad(FMLPostInitializationEvent event) {

	}
}
