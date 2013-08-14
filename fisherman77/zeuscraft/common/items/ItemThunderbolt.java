package fisherman77.zeuscraft.common.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fisherman77.zeuscraft.common.Zeuscraft;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.IconRegister;

public class ItemThunderbolt extends Item
{
       public ItemThunderbolt(int id)
       {
             super(id);
             this.setCreativeTab(Zeuscraft.tabZeuscraft);
             this.maxStackSize = 1;
       }
       
       public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
       {
                if((par3EntityPlayer.rayTrace(200, 1.0F) != null)){
                       double blockHitX = par3EntityPlayer.rayTrace(200, 1.0F).blockX;
                       double blockHitY = par3EntityPlayer.rayTrace(200, 1.0F).blockY;
                       double blockHitZ = par3EntityPlayer.rayTrace(200, 1.0F).blockZ;
                       double blockHitSide = par3EntityPlayer.rayTrace(200, 1.0F).sideHit;
                       par2World.spawnEntityInWorld(new EntityLightningBolt(par2World, blockHitX , blockHitY , blockHitZ ));
               }
         
         
                 return par1ItemStack;
       }

       @SideOnly(Side.CLIENT) //Marks a method as client side only, typically for graphics and rendering

       public EnumRarity getRarity(ItemStack par1ItemStack)
       {
           return par1ItemStack.getItemDamage() == 0 ? EnumRarity.rare : EnumRarity.epic;
       }
       
       @Override
       @SideOnly(Side.CLIENT)
       public void registerIcons(IconRegister iconRegister)
       {
    	   itemIcon = iconRegister.registerIcon("zeuscraft:" + "Thunderbolt");
       }
       
       @SideOnly(Side.CLIENT)
       public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean i)
       {
    	   list.add("\u00A7e\u00A7oZeus' Weapon");
    	   list.add("Lightning on right click.");
    	   list.add("Proven to be Kronos-effective.");
       }
}
