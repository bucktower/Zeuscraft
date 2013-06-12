package fisherman77.zeuscraft.common.items;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.*;
import fisherman77.zeuscraft.common.Zeuscraft;
import net.minecraft.creativetab.CreativeTabs;

public class ItemWaterPearl extends Item {
public ItemWaterPearl(int par1) {
		super(par1); //Returns super constructor: par1 is ID
		
		setCreativeTab(Zeuscraft.tabZeuscraft); //Tells the game what creative mode tab it goes in
}

public EnumRarity getRarity(ItemStack par1ItemStack)
{
    return par1ItemStack.getItemDamage() == 0 ? EnumRarity.rare : EnumRarity.epic;
}
}