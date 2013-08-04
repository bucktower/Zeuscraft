package fisherman77.zeuscraft.common.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import fisherman77.zeuscraft.common.Zeuscraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockGrapeLog extends Block
{
	@SideOnly(Side.CLIENT)
    private Icon sideIcon;
	
        public BlockGrapeLog(int par1)
        {
                super(par1, Material.wood); //You can set different materials, check them out!
                this.setCreativeTab(Zeuscraft.tabZeuscraft);
        }
        
        /**
        * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
        */
        public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
        {
	        int j1 = par9 & 3;
	        byte b0 = 0;
	        switch (par5)
	        {
		        case 0:
		        case 1:
		        b0 = 0;
		        break;
		        case 2:
		        case 3:
		        b0 = 8;
		        break;
		        case 4:
		        case 5:
		        b0 = 4;
	        }
	        return j1 | b0;
        }

        
        @SideOnly(Side.CLIENT)

        /**
         * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
         */
        public Icon getIcon(int par1, int par2)
        {
            return par1 != 1 && par1 != 0 ? this.sideIcon : this.blockIcon;
        }
        
        public void registerIcons(IconRegister iconRegister)
        {
                blockIcon = iconRegister.registerIcon("zeuscraft:GrapeWoodTop");//Telling Forge where our texture is
                sideIcon = iconRegister.registerIcon("zeuscraft:GrapeWoodSide");
        }
        
        public int idDropped(int i, Random random, int j)
        {
                return Zeuscraft.GrapeLog.blockID;
        }
        
        public int quantityDropped(Random random)
        {
                return 1;
        }

		@Override
		public boolean canSustainLeaves(World world, int x, int y, int z)
		{
		return true;
		}
		
		@Override
		public boolean isWood(World world, int x, int y, int z)
		{
		return true;
		}

}