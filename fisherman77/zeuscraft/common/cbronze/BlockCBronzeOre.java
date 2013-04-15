package fisherman77.zeuscraft.common.cbronze;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fisherman77.zeuscraft.common.Zeuscraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockCBronzeOre extends Block {
public BlockCBronzeOre(int ID) {
super(ID, Material.iron); //The ID and material (The material defines what tools are better on it)
	setHardness(5.0F); //How hard the block is to break
	setResistance(10.0F); //How well the block resists explosions
	setStepSound(super.soundMetalFootstep); //The sound the block makes when you walk on it as well as place or break it
	setCreativeTab(Zeuscraft.tabZeuscraft); //The tab it appears in
}

@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister)
{
         this.blockIcon = par1IconRegister.registerIcon("Zeuscraft:CBronzeOre");
}
}