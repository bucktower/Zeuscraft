package fisherman77.zeuscraft.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.*;
import fisherman77.zeuscraft.common.Zeuscraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityPig;

public class ItemPegasusSaddle extends Item {
	public ItemPegasusSaddle(int par1) {
		super(par1); //Returns super constructor: par1 is ID
		
		this.maxStackSize = 1;
		setCreativeTab(Zeuscraft.tabZeuscraft); //Tells the game what creative mode tab it goes in
	}

	/**
	 * Called when a player right clicks an entity with an item.
	 */
	public boolean itemInteractionForEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving)
	{
	    if (par2EntityLiving instanceof EntityPig)
	    {
	        EntityPig entitypig = (EntityPig)par2EntityLiving;
	
	        if (!entitypig.getSaddled() && !entitypig.isChild())
	        {
	            entitypig.setSaddled(true);
	            --par1ItemStack.stackSize;
	        }
	
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	}
}