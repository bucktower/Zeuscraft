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
	//Altar
		GameRegistry.registerBlock(Zeuscraft.Altar, "Altar");
		LanguageRegistry.addName(Zeuscraft.Altar, "Altar");
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.Altar), "MMM", "ABC", "MMM", Character.valueOf('M'), Zeuscraft.Marble, Character.valueOf('A'), Zeuscraft.PearlNether, Character.valueOf('B'), Zeuscraft.PearlThunder, Character.valueOf('C'), Zeuscraft.PearlWater);
	//Grape Leaves
		GameRegistry.registerBlock(Zeuscraft.GrapeLeaves, "GrapeLeaves");
		LanguageRegistry.addName(Zeuscraft.GrapeLeaves, "Grape Leaves");
	//Grape Log
		GameRegistry.registerBlock(Zeuscraft.GrapeLog, "GrapeLog");
		LanguageRegistry.addName(Zeuscraft.GrapeLog, "Grape Log");
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
	//Pearl (Flame)
		LanguageRegistry.addName(Zeuscraft.PearlNether, "\u00A7cFlame Pearl");
	//Pearl (Thunder)
		LanguageRegistry.addName(Zeuscraft.PearlThunder, "\u00A7eThunder Pearl");
	//Pearl (Water)
		LanguageRegistry.addName(Zeuscraft.PearlWater, "\u00A7bWater Pearl");
	//Reed Pipes
		LanguageRegistry.addName(Zeuscraft.ReedPipes, "Reed Pipes");
	//Scepter
		LanguageRegistry.addName(Zeuscraft.Scepter, "\u00A72Scepter");
	//Thunderbolt
		LanguageRegistry.addName(Zeuscraft.Thunderbolt, "\u00A7eThunderbolt");
	//Trident
		LanguageRegistry.addName(Zeuscraft.Trident, "\u00A7bTrident");
	//Wine
		LanguageRegistry.addName(Zeuscraft.Wine, "Wine");
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.Wine), " M ", " M ", " G ", Character.valueOf('M'), Zeuscraft.Grapes, Character.valueOf('G'), Zeuscraft.Goblet);
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.Wine), "M  ", "M  ", "G  ", Character.valueOf('M'), Zeuscraft.Grapes, Character.valueOf('G'), Zeuscraft.Goblet);
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.Wine), "  M", "  M", "  G", Character.valueOf('M'), Zeuscraft.Grapes, Character.valueOf('G'), Zeuscraft.Goblet);
	//Nectar
		LanguageRegistry.addName(Zeuscraft.Nectar, "Nectar");
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.Nectar), " P ", " P ", " G ", Character.valueOf('P'), Zeuscraft.PlantNectar, Character.valueOf('G'), Zeuscraft.Goblet);
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.Nectar), "P  ", "P  ", "G  ", Character.valueOf('P'), Zeuscraft.PlantNectar, Character.valueOf('G'), Zeuscraft.Goblet);
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.Nectar), "  P", "  P", "  G", Character.valueOf('P'), Zeuscraft.PlantNectar, Character.valueOf('G'), Zeuscraft.Goblet);
}

public void registerRenderers(){
	
}

}