package fisherman77.zeuscraft.common;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ZeuscraftCommonProxy implements IGuiHandler{ //THIS IS IMPORTANT, CANNOT BE A PROXY/GUI HANDLER WITHOUT THIS!!
public void registerRenderInformation() //Client side texture registering
{
}
@Override
public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
return null;
}
@Override
public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
return null;
}

public void registerTiles(){ //For registering TileEntities
}

public void registerBlocks(){ //For registering Blocks
	//Marble
		GameRegistry.registerBlock(Zeuscraft.Marble, "Marble");
		LanguageRegistry.addName(Zeuscraft.Marble, "Marble");
		GameRegistry.addSmelting(Zeuscraft.Marble.blockID, new ItemStack(Zeuscraft.MarbleSmooth), 0.1F);
	//Marble Smooth
		GameRegistry.registerBlock(Zeuscraft.MarbleSmooth, "MarbleSmooth");
		LanguageRegistry.addName(Zeuscraft.MarbleSmooth, "Smooth Marble");
}

public void registerItems(){ //For registering Items
	//Goblet
		LanguageRegistry.addName(Zeuscraft.Goblet, "Goblet");
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.Goblet), "M M", " M ", "MMM", Character.valueOf('M'), Block.planks);
	//Grapes
		LanguageRegistry.addName(Zeuscraft.Grapes, "Grapes");
	//Thunderbolt
		LanguageRegistry.addName(Zeuscraft.Thunderbolt, "Thunderbolt");
	//Trident
		LanguageRegistry.addName(Zeuscraft.Trident, "Trident");
	//Wine
		LanguageRegistry.addName(Zeuscraft.Wine, "Wine");
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.Wine), " M ", " M ", " G ", Character.valueOf('M'), Zeuscraft.Grapes, Character.valueOf('G'), Zeuscraft.Goblet);
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.Wine), "M  ", "M  ", "G  ", Character.valueOf('M'), Zeuscraft.Grapes, Character.valueOf('G'), Zeuscraft.Goblet);
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.Wine), "  M", "  M", "  G", Character.valueOf('M'), Zeuscraft.Grapes, Character.valueOf('G'), Zeuscraft.Goblet);
}
}