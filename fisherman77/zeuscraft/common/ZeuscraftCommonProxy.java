package fisherman77.zeuscraft.common;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import fisherman77.zeuscraft.common.cbronze.WorldGeneratorCBronzeOre;
import fisherman77.zeuscraft.common.mobs.EntityCentaur;

public class ZeuscraftCommonProxy implements IGuiHandler{//THIS IS IMPORTANT, CANNOT BE A PROXY/GUI HANDLER WITHOUT THIS!!
	
	public static String ITEMS_PNG = "/Zeuscraft/ZeuscraftItems.png";
    public static String BLOCK_PNG = "/Zeuscraft/ZeuscraftBlocks.png";
    
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
	//Celestial Bronze Block
		GameRegistry.registerBlock(Zeuscraft.CBronzeBlock, "CBronzeBlock");
		LanguageRegistry.addName(Zeuscraft.CBronzeBlock, "Celestial Bronze Block");
		
	//Celestial Bronze Ore
		GameRegistry.registerBlock(Zeuscraft.CBronzeOre, "CBronzeOre");
		LanguageRegistry.addName(Zeuscraft.CBronzeOre, "Celestial Bronze Ore");
		OreDictionary.registerOre("oreCelestialBronze", Zeuscraft.CBronzeOre);
			
	//Column
		GameRegistry.registerBlock(Zeuscraft.Column, "Column");
		LanguageRegistry.addName(Zeuscraft.Column, "Column");
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.Column,1), "XXX","XXX","XXX", Character.valueOf('X'), Block.bedrock);
		
	//Marble
		GameRegistry.registerBlock(Zeuscraft.Marble, "Marble");
		LanguageRegistry.addName(new ItemStack(Zeuscraft.Marble,1,0), "White Marble");
		LanguageRegistry.addName(new ItemStack(Zeuscraft.Marble,1,1), "Pink Marble");
		LanguageRegistry.addName(new ItemStack(Zeuscraft.Marble,1,2), "Green Marble");
		LanguageRegistry.addName(new ItemStack(Zeuscraft.Marble,1,3), "Tan Marble");
		LanguageRegistry.addName(new ItemStack(Zeuscraft.Marble,1,4), "Dark Marble");
		LanguageRegistry.addName(new ItemStack(Zeuscraft.Marble,1,5), "Red Marble");
		LanguageRegistry.addName(new ItemStack(Zeuscraft.Marble,1,6), "Marble");
		
	//Minotaur Head
		GameRegistry.registerBlock(Zeuscraft.MinotaurHead, "MinotaurHead");
		LanguageRegistry.addName(new ItemStack(Zeuscraft.MinotaurHead), "Minotaur Head");
		
	//Olympus Portal
		GameRegistry.registerBlock(Zeuscraft.OlympusPortal, "OlympusPortal");
		LanguageRegistry.addName(new ItemStack(Zeuscraft.OlympusPortal), "Olympus Portal");
		
}

public void registerItems(){ //For adding Item's ingame names
	//Celestial Bronze Axe
		
	//Celestial Bronze Hoe
	
	//Celestial Bronze Ingot
		LanguageRegistry.addName(Zeuscraft.CBronzeIngot, "Celestial Bronze Ingot");
		GameRegistry.addSmelting(Zeuscraft.CBronzeOre.blockID, new ItemStack(Zeuscraft.CBronzeIngot), 5);
		OreDictionary.registerOre("gemCelestialBronze", Zeuscraft.CBronzeIngot);

	//Celestial Bronze Pickaxe
		
	//Celestial Bronze Spade
		
	//Celestial Bronze Sword
		
	//Pegasus Feather
		LanguageRegistry.addName(Zeuscraft.PegasusFeather, "Pegasus Feather");
		
	//Pegasus Saddle
		LanguageRegistry.addName(Zeuscraft.PegasusSaddle, "Pegasus Saddle");
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.PegasusSaddle,1), "XXX"," D ", Character.valueOf('X'), Zeuscraft.PegasusFeather, Character.valueOf('D'), Item.ingotIron);
		
	//Thunderbolt
		LanguageRegistry.addName(Zeuscraft.Thunderbolt, "Thunderbolt");
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.Thunderbolt,1), "XCX","XCX","XCX", Character.valueOf('X'), Zeuscraft.ThunderPearl, Character.valueOf('C'), Zeuscraft.CBronzeIngot);
		
	//Thunder Pearl
		LanguageRegistry.addName(Zeuscraft.ThunderPearl, "Thunder Pearl");
		
	//Trident
		LanguageRegistry.addName(Zeuscraft.Trident, "Trident");
		GameRegistry.addRecipe(new ItemStack(Zeuscraft.Trident,1), "XCX","XCX","XCX", Character.valueOf('X'), Zeuscraft.WaterPearl, Character.valueOf('C'), Zeuscraft.CBronzeIngot);
		
	//Water Pearl
		LanguageRegistry.addName(Zeuscraft.WaterPearl, "Water Pearl");
}

public void worldGenerators(){
	//Celestial Bronze Ore Generation
		GameRegistry.registerWorldGenerator(new WorldGeneratorCBronzeOre());
}

public void registerRenderers(){
	
}
}