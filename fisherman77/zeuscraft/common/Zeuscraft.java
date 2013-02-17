
package fisherman77.zeuscraft.common; //The package your mod is in

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;
import fisherman77.zeuscraft.client.ZeuscraftClientProxy;
import fisherman77.zeuscraft.common.blocks.BlockCBronzeBlock;
import fisherman77.zeuscraft.common.blocks.BlockColumn;
import fisherman77.zeuscraft.common.blocks.BlockMarble;
import fisherman77.zeuscraft.common.blocks.BlockMinotaurHead;
import fisherman77.zeuscraft.common.blocks.BlockOlympusPortal;
import fisherman77.zeuscraft.common.cbronze.BlockCBronzeOre;
import fisherman77.zeuscraft.common.cbronze.ItemCBronzeIngot;
import fisherman77.zeuscraft.common.config.ZeuscraftBlocksConfig;
import fisherman77.zeuscraft.common.config.ZeuscraftConfigSettings;
import fisherman77.zeuscraft.common.config.ZeuscraftItemsConfig;
import fisherman77.zeuscraft.common.handlers.*;
import fisherman77.zeuscraft.common.items.ItemPegasusFeather;
import fisherman77.zeuscraft.common.items.ItemPegasusSaddle;
import fisherman77.zeuscraft.common.items.ItemThunderPearl;
import fisherman77.zeuscraft.common.items.ItemThunderbolt;
import fisherman77.zeuscraft.common.items.ItemTrident;
import fisherman77.zeuscraft.common.items.ItemWaterPearl;
import fisherman77.zeuscraft.common.mobs.EntityCentaur;
import fisherman77.zeuscraft.common.mobs.EntityHostileCentaur;
import fisherman77.zeuscraft.common.mobs.EntityWiseCentaur;
import fisherman77.zeuscraft.common.olympus.WorldProviderOlympus;
import fisherman77.zeuscraft.common.tabs.TabZeuscraft;

@NetworkMod(clientSideRequired=true,serverSideRequired=true, //Whether client side and server side are needed
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"Zeuscraft" }, packetHandler = ZeuscraftClientPacketHandler.class), //For clientside packet handling
serverPacketHandlerSpec = @SidedPacketHandler(channels = {}, packetHandler = ZeuscraftServerPacketHandler.class)) //For serverside packet handling


//MOD BASICS
@Mod(modid="Zeuscraft",name="Zeuscraft",version="OLYMPUS 4.0")

public class Zeuscraft {

@Instance("Zeuscraft") //The instance, this is very important later on
public static Zeuscraft instance = new Zeuscraft();

@SidedProxy(clientSide = "fisherman77.zeuscraft.client.ZeuscraftClientProxy", serverSide = "fisherman77.zeuscraft.common.ZeuscraftCommonProxy") //Tells Forge the location of your proxies
public static ZeuscraftCommonProxy proxy;

//ZEUSCRAFT CREATIVE TAB
	public static CreativeTabs tabZeuscraft = new TabZeuscraft(CreativeTabs.getNextID(),"Zeuscraft"); //Our custom creative tab's object

//BLOCKS (LIST)
	public static Block CBronzeBlock;
	public static int CBronzeBlockID;
	public static Block CBronzeOre;
	public static int CBronzeOreID;
	public static Block Column;
	public static int ColumnID;
	public static Block Marble;
	public static int MarbleID;
	public static Block MinotaurHead;
	public static int MinotaurHeadID;
	public static Block OlympusPortal;
	public static int OlympusPortalID;
	
//ITEMS (LIST)
	//public static Item CBronzeAxe = new ItemCBronzeAxe(1407);
	//public static Item CBronzeHoe = new ItemCBronzeHoe(1408);
	public static Item CBronzeIngot = new ItemCBronzeIngot(1400);
	//public static Item CBronzePickaxe = new ItemCBronzePickaxe(1409);
	//public static Item CBronzeSpade = new ItemCBronzeSpade(1410);
	//public static Item CBronzeSword = new ItemCBronzeSword(1411);
	public static Item PegasusSaddle = new ItemPegasusSaddle(1403);
	public static Item PegasusFeather = new ItemPegasusFeather(1404);
	public static Item Thunderbolt = new ItemThunderbolt(1401);
	public static Item ThunderPearl = new ItemThunderPearl(1406);
	public static Item Trident = new ItemTrident(1402);
	public static Item WaterPearl = new ItemWaterPearl(1405);
	
//DIMENSION (LIST)
	public static int Olympus = 20;
	
	
	@PreInit
	public void PreInit(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
	//ZeuscraftBlocksConfig.preLoad(event);
	//ZeuscraftItemsConfig.preLoad(event);
		//ColumnID = config.getBlock("Column", 170).getInt();
		//MarbleID = config.getBlock("Marble", 171).getInt();
		//CBronzeOreID = config.getBlock("CBronzeOre", 172).getInt();
		ZeuscraftConfigSettings.ID_CBRONZEBLOCK = Integer.parseInt(config.getBlock(config.CATEGORY_BLOCK, "ID_CBRONZEBLOCK", ZeuscraftConfigSettings.ID_CBRONZEBLOCK_DEFAULT).value);
		ZeuscraftConfigSettings.ID_CBRONZEORE = Integer.parseInt(config.getBlock(config.CATEGORY_BLOCK, "ID_CBRONZEORE", ZeuscraftConfigSettings.ID_CBRONZEORE_DEFAULT).value);
		ZeuscraftConfigSettings.ID_MINOTAURHEAD = Integer.parseInt(config.getBlock(config.CATEGORY_BLOCK, "ID_MINOTAURHEAD", ZeuscraftConfigSettings.ID_MINOTAURHEAD_DEFAULT).value);
		
		config.save();
	}

	@Init
	public void InitZeuscraft(FMLInitializationEvent event){ //Your main initialization method
		
		CBronzeOre = (new BlockCBronzeOre(ZeuscraftConfigSettings.ID_CBRONZEORE).setBlockName("CBronzeOre"));
		CBronzeBlock = (new BlockCBronzeBlock(ZeuscraftConfigSettings.ID_CBRONZEBLOCK).setBlockName("CBronzeBlock"));
		Column = (new BlockColumn(170).setBlockName("Column"));
		Marble = (new BlockMarble(171).setBlockName("Marble"));
		MinotaurHead = (new BlockMinotaurHead(ZeuscraftConfigSettings.ID_MINOTAURHEAD).setBlockName("MinotaurHead"));
		OlympusPortal = (new BlockOlympusPortal(2400, 1).setBlockName("OlympusPortal"));
		
		
	//MULTIPLAYER ABILITY
		NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data

	//BLOCKS (METHOD)
		proxy.registerBlocks(); //Calls the registerBlocks method
	
	//ITEMS (METHOD)
		proxy.registerItems();
	
	//WORLD GENERATION (METHOD)
		proxy.worldGenerators();
	
	//MOBS
		proxy.registerRenderers();
		
	//DIMENSION
		DimensionManager.registerProviderType(Olympus, WorldProviderOlympus.class, false);
		DimensionManager.registerDimension(Olympus, Olympus);
		
		//Centaur
			EntityRegistry.registerGlobalEntityID(EntityCentaur.class, "Centaur", EntityRegistry.findGlobalUniqueEntityId(), 0x7B6343, 0xE5E5E5);
			LanguageRegistry.instance().addStringLocalization("entity.Centaur.name", "Centaur");
			EntityRegistry.addSpawn(EntityCentaur.class, 10, 3, 10, EnumCreatureType.creature, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.desert, BiomeGenBase.forest);
			
		//Hostile Centaur
			EntityRegistry.registerGlobalEntityID(EntityHostileCentaur.class, "HostileCentaur", EntityRegistry.findGlobalUniqueEntityId(), 0x7B6343, 0xFF0000);
			LanguageRegistry.instance().addStringLocalization("entity.HostileCentaur.name", "Hostile Centaur");
			EntityRegistry.addSpawn(EntityHostileCentaur.class, 2, 2, 3, EnumCreatureType.creature, BiomeGenBase.plains, BiomeGenBase.taiga);
			
		//Wise Centaur
			EntityRegistry.registerGlobalEntityID(EntityWiseCentaur.class, "WiseCentaur", EntityRegistry.findGlobalUniqueEntityId());
			LanguageRegistry.instance().addStringLocalization("entity.WiseCentaur.name", "Wise Centaur");
			EntityRegistry.addSpawn(EntityWiseCentaur.class, 2, 1, 1, EnumCreatureType.creature, BiomeGenBase.taigaHills);

}
}