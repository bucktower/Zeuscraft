package fisherman77.zeuscraft.common.blocks;

import java.util.Random;

import fisherman77.zeuscraft.common.Zeuscraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockColumn extends Block
{
private Icon sides, updown;
private Icon[][] iconBuffer;

public BlockColumn(int id)
{
super(id, Material.rock);
setHardness(1.0F);
this.setCreativeTab(Zeuscraft.tabZeuscraft);
}

public void registerIcons(IconRegister par1IconRegister)
	{
		this.sides = par1IconRegister.registerIcon("Zeuscraft:ColumnSide");
		this.updown = par1IconRegister.registerIcon("Zeuscraft:ColumnUpDown");
	}

public Icon getBlockTextureFromSideAndMetadata(int i, int j)
  {
	if (i == 0)
		{
			return updown;
		}
	if (i == 1)
	{
		return updown;
	}
	else
	{
		return sides;
	}
  }
}