package fisherman77.zeuscraft.common.items;

import java.util.List;

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
       
       /**
        * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
        * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
        */
       public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
       {
    	   par3World.playSoundAtEntity(par2EntityPlayer, "zeuscraft:ReedPipes", 1.0f, 1.0f);
    	   return true;
       }
       
       @Override
       @SideOnly(Side.CLIENT)
       public void registerIcons(IconRegister iconRegister)
       {
    	   itemIcon = iconRegister.registerIcon("zeuscraft:" + "ReedPipes");
       }
       
       @SideOnly(Side.CLIENT)
       public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean i)
       {
    	   list.add("Right click to play.");
       }
}
