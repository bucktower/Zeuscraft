package fisherman77.zeuscraft.common.items;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fisherman77.zeuscraft.common.Zeuscraft;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.IconRegister;

public class ItemNectar extends ItemFood
{
	
       public ItemNectar(int id)
       {
             super(id, 5, 1.2F, false);
             this.setCreativeTab(Zeuscraft.tabZeuscraft);
             this.maxStackSize = 1;
       }

       public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
       {
    	   par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 720, 1));
           return new ItemStack(Zeuscraft.Goblet);
       }
       
       @Override
       @SideOnly(Side.CLIENT)
       public void registerIcons(IconRegister iconRegister)
       {
    	   itemIcon = iconRegister.registerIcon("zeuscraft:" + "Wine");
       }
}
