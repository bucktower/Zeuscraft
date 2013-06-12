package fisherman77.zeuscraft.common.cbronze;

import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;
import fisherman77.zeuscraft.common.Zeuscraft;
import net.minecraft.creativetab.CreativeTabs;

public class ItemCBronzeIngot extends Item {
	public ItemCBronzeIngot(int par1) {
		super(par1); //Returns super constructor: par1 is ID
		
		setCreativeTab(Zeuscraft.tabZeuscraft); //Tells the game what creative mode tab it goes in
	} 
}