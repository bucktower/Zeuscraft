package fisherman77.zeuscraft.common.items;

import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;
import fisherman77.zeuscraft.common.Zeuscraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class ItemNectar extends Item {
public ItemNectar(int par1) {
		super(par1); //Returns super constructor: par1 is ID
		setUnlocalizedName("Nectar"); //Sets the incode name of the item, make sure it doesn't clash with other items, weird stuff happens
		setCreativeTab(Zeuscraft.tabZeuscraft); //Tells the game what creative mode tab it goes in
}

@SideOnly(Side.CLIENT)
public void updateIcons(IconRegister par1IconRegister)
    {
        this.iconIndex = par1IconRegister.registerIcon("Zeuscraft:Nectar");
    }

}