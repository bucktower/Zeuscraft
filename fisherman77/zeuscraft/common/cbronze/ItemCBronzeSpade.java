package fisherman77.zeuscraft.common.cbronze;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fisherman77.zeuscraft.common.Zeuscraft;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;

public class ItemCBronzeSpade extends ItemToolCBronze
{
public static final Block[] blocksEffectiveAgainst = new Block[] {Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium};
public ItemCBronzeSpade(int ID, EnumToolMaterial m, int tex, String name)
{
         super(ID, 1, m, blocksEffectiveAgainst);
         this.setCreativeTab(Zeuscraft.tabZeuscraft);
}
public boolean canHarvestBlock(Block par1Block)
{
         return par1Block == Block.snow ? true : par1Block == Block.blockSnow;
}

@SideOnly(Side.CLIENT)
public void updateIcons(IconRegister par1IconRegister)
    {
        this.iconIndex = par1IconRegister.registerIcon("Zeuscraft:CBronzeSpade");
    }

}