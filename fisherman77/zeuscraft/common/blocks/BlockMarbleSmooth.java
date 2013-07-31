package fisherman77.zeuscraft.common.blocks;

import java.util.Random;

import fisherman77.glacierice.common.GlacierIce;
import fisherman77.zeuscraft.common.Zeuscraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockMarbleSmooth extends Block
{
        public BlockMarbleSmooth(int par1)
        {
                super(par1, Material.rock); //You can set different materials, check them out!
        }
        public void registerIcons(IconRegister iconRegister)
        {
                         blockIcon = iconRegister.registerIcon("zeuscraft:MarbleSmooth");//Telling Forge where our texture is
        }
        public int idDropped(int i, Random random, int j)
        {
                return Zeuscraft.Marble.blockID;
        }
        public int quantityDropped(Random random)
        {
                return 1;
        }
}