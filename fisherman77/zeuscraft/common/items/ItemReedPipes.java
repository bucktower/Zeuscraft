package fisherman77.zeuscraft.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fisherman77.zeuscraft.common.Zeuscraft;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.IconRegister;

public class ItemReedPipes extends Item
{
       public ItemReedPipes(int id)
       {
             super(id);
             this.setCreativeTab(Zeuscraft.tabZeuscraft);
             this.maxStackSize = 1;
       }
       
       @Override
       @SideOnly(Side.CLIENT)
       public void registerIcons(IconRegister iconRegister)
       {
    	   itemIcon = iconRegister.registerIcon("zeuscraft:" + "ReedPipes");
       }
}
