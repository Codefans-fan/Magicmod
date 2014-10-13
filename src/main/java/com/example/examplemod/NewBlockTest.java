package main.java.com.example.examplemod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class NewBlockTest extends Block {
	@SuppressWarnings("unused")
	private static final String __OBFID = "CL_00000333";

	protected NewBlockTest(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Test_Block");
		this.setBlockTextureName(ExampleMod.MODID + ":test");
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random p_149745_1_) {
		return 0;
	}
}
