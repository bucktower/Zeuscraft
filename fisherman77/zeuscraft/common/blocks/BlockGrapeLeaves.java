
package fisherman77.zeuscraft.common.blocks;
import java.util.Random;

import fisherman77.zeuscraft.common.Zeuscraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
public class BlockGrapeLeaves extends Block
{
public BlockGrapeLeaves(int par1)
{
super(par1, Material.leaves);
this.setCreativeTab(Zeuscraft.tabZeuscraft);
this.setStepSound(soundGrassFootstep);
this.setHardness(0.2F);
}

	public void registerIcons(IconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon("zeuscraft:GrapeLeaves");//Telling Forge where our texture is
	}

	public boolean isOpaqueCube()
	{
		return false;
	}
	
	/**
	* Returns the ID of the items to drop on destruction.
	*/
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return this.blockID;
	}
	
	/**
	* Returns the quantity of items to drop on block destruction.
	*/
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}
}

