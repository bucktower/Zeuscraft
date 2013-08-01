
package fisherman77.zeuscraft.common; //The package your mod is in

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;
import fisherman77.zeuscraft.common.blocks.BlockAltar;
import fisherman77.zeuscraft.common.blocks.BlockGrapeLeaves;
import fisherman77.zeuscraft.common.blocks.BlockGrapeLog;
import fisherman77.zeuscraft.common.blocks.BlockMarble;
import fisherman77.zeuscraft.common.blocks.BlockMarbleSmooth;
import fisherman77.zeuscraft.common.handlers.ZeuscraftServerPacketHandler;
import fisherman77.zeuscraft.common.handlers.ZeuscraftClientPacketHandler;
import fisherman77.zeuscraft.common.items.ItemGoblet;
import fisherman77.zeuscraft.common.items.ItemGrapes;
import fisherman77.zeuscraft.common.items.ItemPearlNether;
import fisherman77.zeuscraft.common.items.ItemPearlThunder;
import fisherman77.zeuscraft.common.items.ItemPearlWater;
import fisherman77.zeuscraft.common.items.ItemScepter;
import fisherman77.zeuscraft.common.items.ItemThunderbolt;
import fisherman77.zeuscraft.common.items.ItemTrident;
import fisherman77.zeuscraft.common.items.ItemWine;
import fisherman77.zeuscraft.common.tabs.TabZeuscraft;

@NetworkMod(clientSideRequired=true,serverSideRequired=true, //Whether client side and server side are needed
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"Zeuscraft"}, packetHandler = ZeuscraftClientPacketHandler.class), //For clientside packet handling
serverPacketHandlerSpec = @SidedPacketHandler(channels = {"Zeuscraft"}, packetHandler = ZeuscraftServerPacketHandler.class)) //For serverside packet handling

//MOD BASICS
@Mod(modid="Zeuscraft",name="Zeuscraft",version="Dev Build")

public class Zeuscraft {

@Instance("Zeuscraft") //The instance, this is very important later on
public static Zeuscraft instance = new Zeuscraft();

@SidedProxy(clientSide = "fisherman77.zeuscraft.client.ZeuscraftClientProxy", serverSide = "fisherman77.zeuscraft.common.ZeuscraftCommonProxy") //Tells Forge the location of your proxies
public static ZeuscraftCommonProxy proxy;
	
	//BLOCKS
		public static Block Altar;
		public static Block GrapeLeaves;
		public static Block GrapeLog;
		public static Block Marble;
		public static Block MarbleSmooth;
		
	//ITEMS
		public static Item Goblet;
		public static Item Grapes;
		public static Item PearlNether;
		public static Item PearlThunder;
		public static Item PearlWater;
		public static Item Scepter;
		public static Item Thunderbolt;
		public static Item Trident;
		public static Item Wine;
		
	//TABS
		public static CreativeTabs tabZeuscraft = new TabZeuscraft(CreativeTabs.getNextID(),"Zeuscraft");

@PreInit
public void PreInit(FMLPreInitializationEvent e){
	//BLOCKS
		Altar = new BlockAltar(3978).setUnlocalizedName("Altar");
		GrapeLeaves = new BlockGrapeLeaves(3976).setUnlocalizedName("GrapeLeaves");
		GrapeLog = new BlockGrapeLog(3977).setUnlocalizedName("GrapeLog");
		Marble = new BlockMarble(3974).setUnlocalizedName("Marble");
		MarbleSmooth = new BlockMarbleSmooth(3975).setUnlocalizedName("Marble Smooth");
	//ITEMS
		Goblet = new ItemGoblet(4246).setUnlocalizedName("Goblet");
		Grapes = new ItemGrapes(4247).setUnlocalizedName("Grapes");
		PearlNether = new ItemPearlNether(4250).setUnlocalizedName("PearlNether");
		PearlThunder = new ItemPearlThunder(4251).setUnlocalizedName("PearlThunder");
		PearlWater = new ItemPearlWater(4252).setUnlocalizedName("PearlWater");
		Scepter = new ItemScepter(4249).setUnlocalizedName("Scepter");
		Thunderbolt = new ItemThunderbolt(4244).setUnlocalizedName("Thunderbolt");
		Trident = new ItemTrident(4245).setUnlocalizedName("Trident");
		Wine = new ItemWine(4248).setUnlocalizedName("Wine");
	}

@Init
public void InitZeuscraft(FMLInitializationEvent event){ //Your main initialization method
	//BLOCKS (METHOD)
		proxy.registerBlocks();
		
	//ITEMS (METHOD)
		proxy.registerItems();
	
	//MULTIPLAYER ABILITY
		NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data

}
}