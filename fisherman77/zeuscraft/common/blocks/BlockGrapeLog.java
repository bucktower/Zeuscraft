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

public class BlockGrapeLog extends Block
{
	@SideOnly(Side.CLIENT)
    private Icon sideIcon;
	
        public BlockGrapeLog(int par1)
        {
                super(par1, Material.wood); //You can set different materials, check them out!
                this.setCreativeTab(Zeuscraft.tabZeuscraft);
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
}