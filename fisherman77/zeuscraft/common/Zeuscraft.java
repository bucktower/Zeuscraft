
package fisherman77.zeuscraft.common; //The package your mod is in

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
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
import fisherman77.zeuscraft.common.blocks.BlockAltar;
import fisherman77.zeuscraft.common.blocks.BlockGrapeLeaves;
import fisherman77.zeuscraft.common.blocks.BlockGrapeLog;
import fisherman77.zeuscraft.common.blocks.BlockMarble;
import fisherman77.zeuscraft.common.blocks.BlockMarbleSmooth;
import fisherman77.zeuscraft.common.handlers.ZeuscraftEventHandler;
import fisherman77.zeuscraft.common.handlers.ZeuscraftServerPacketHandler;
import fisherman77.zeuscraft.common.handlers.ZeuscraftClientPacketHandler;
import fisherman77.zeuscraft.common.handlers.ZeuscraftSoundHandler;
import fisherman77.zeuscraft.common.items.ItemGoblet;
import fisherman77.zeuscraft.common.items.ItemGrapes;
import fisherman77.zeuscraft.common.items.ItemNectar;
import fisherman77.zeuscraft.common.items.ItemPearlNether;
import fisherman77.zeuscraft.common.items.ItemPearlThunder;
import fisherman77.zeuscraft.common.items.ItemPearlWater;
import fisherman77.zeuscraft.common.items.ItemReedPipes;
import fisherman77.zeuscraft.common.items.ItemScepter;
import fisherman77.zeuscraft.common.items.ItemThunderbolt;
import fisherman77.zeuscraft.common.items.ItemTrident;
import fisherman77.zeuscraft.common.items.ItemWine;
import fisherman77.zeuscraft.common.mobs.*;
import fisherman77.zeuscraft.common.mobs.heroes.EntityAchilles;
import fisherman77.zeuscraft.common.mobs.heroes.EntityTheseus;
import fisherman77.zeuscraft.common.mobs.olympus.EntityAphrodite;
import fisherman77.zeuscraft.common.mobs.olympus.EntityApollo;
import fisherman77.zeuscraft.common.mobs.olympus.EntityAres;
import fisherman77.zeuscraft.common.mobs.olympus.EntityArtemis;
import fisherman77.zeuscraft.common.mobs.olympus.EntityAthena;
import fisherman77.zeuscraft.common.mobs.olympus.EntityDemeter;
import fisherman77.zeuscraft.common.mobs.olympus.EntityDionysus;
import fisherman77.zeuscraft.common.mobs.olympus.EntityHades;
import fisherman77.zeuscraft.common.mobs.olympus.EntityHelios;
import fisherman77.zeuscraft.common.mobs.olympus.EntityHera;
import fisherman77.zeuscraft.common.mobs.olympus.EntityHermes;
import fisherman77.zeuscraft.common.mobs.olympus.EntityHestia;
import fisherman77.zeuscraft.common.mobs.olympus.EntityPoseidon;
import fisherman77.zeuscraft.common.mobs.olympus.EntityZeus;
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
		//public static Block GrapeSapling;
		public static Block Marble;
		public static Block MarbleSmooth;
		
	//ITEMS
		//public static Item Club;
		public static Item Goblet;
		public static Item Grapes;
		public static Item PearlNether;
		public static Item PearlThunder;
		public static Item PearlWater;
		public static Item ReedPipes;
		public static Item Scepter;
		public static Item Thunderbolt;
		public static Item Trident;
		public static Item Wine;
		public static Item Nectar;
		
	//CELESTIAL BRONZE
		public static Item BootsCBronze;
		public static Item ChestCBronze;
		public static Item HelmetCBronze;
		public static Item IngotCBronze;
		public static Item LeggingsCBronze;
		
	//IMPERIAL GOLD
		
	//STYGIAN IRON
		
	//TABS
		public static CreativeTabs tabZeuscraft = new TabZeuscraft(CreativeTabs.getNextID(),"Zeuscraft");

@PreInit
public void PreInit(FMLPreInitializationEvent e){
	
	/**
	* Registering Paleocraft sounds...
	**/
	MinecraftForge.EVENT_BUS.register(new ZeuscraftSoundHandler());
	
	//BLOCKS
		Altar = new BlockAltar(3978).setUnlocalizedName("Altar");
		GrapeLeaves = new BlockGrapeLeaves(3976).setUnlocalizedName("GrapeLeaves");
		GrapeLog = new BlockGrapeLog(3977).setUnlocalizedName("GrapeLog");
		//Grape Sapling ID 3979
		Marble = new BlockMarble(3974).setUnlocalizedName("Marble");
		MarbleSmooth = new BlockMarbleSmooth(3975).setUnlocalizedName("Marble Smooth");
		
	//ITEMS
		//Club = new ItemClub(4254).setUnlocalizedName("Club");
		Goblet = new ItemGoblet(4246).setUnlocalizedName("Goblet");
		Grapes = new ItemGrapes(4247).setUnlocalizedName("Grapes");
		PearlNether = new ItemPearlNether(4250).setUnlocalizedName("PearlNether");
		PearlThunder = new ItemPearlThunder(4251).setUnlocalizedName("PearlThunder");
		PearlWater = new ItemPearlWater(4252).setUnlocalizedName("PearlWater");
		ReedPipes = new ItemReedPipes(4253).setUnlocalizedName("ReedPipes");
		Scepter = new ItemScepter(4249).setUnlocalizedName("Scepter");
		Thunderbolt = new ItemThunderbolt(4244).setUnlocalizedName("Thunderbolt");
		Trident = new ItemTrident(4245).setUnlocalizedName("Trident");
		Wine = new ItemWine(4248).setUnlocalizedName("Wine");
		Nectar = new ItemNectar(4260).setUnlocalizedName("Nectar");
		
	//CELESTIAL BRONZE
		BootsCBronze = new ItemGoblet(4255).setUnlocalizedName("BootsCBronze");
		ChestCBronze = new ItemGoblet(4256).setUnlocalizedName("ChestCBronze");
		HelmetCBronze = new ItemGoblet(4257).setUnlocalizedName("HelmetCBronze");
		IngotCBronze = new ItemGoblet(4258).setUnlocalizedName("IngotCBronze");
		LeggingsCBronze = new ItemGoblet(4259).setUnlocalizedName("LeggingsCBronze");

		
	//IMPERIAL GOLD
		
		
	//STYGIAN IRON
		
	}

@Init
public void InitZeuscraft(FMLInitializationEvent event){ //Your main initialization method
	//BLOCKS (METHOD)
		proxy.registerBlocks();
		
	//ITEMS (METHOD)
		proxy.registerItems();
		
	//MOBS
		proxy.registerRenderers();
		//MONSTERS
		
		
		//ANIMALS
			//Cyclops
				registerEntity(EntityCyclops.class, "Cyclops",  0x882e20, 0xa67e56);
				LanguageRegistry.instance().addStringLocalization("entity.Cyclops.name", "Cyclops");
			//Minotaur
				registerEntity(EntityMinotaur.class, "Minotaur",  0x49251b, 0xe39f77);
				LanguageRegistry.instance().addStringLocalization("entity.Minotaur.name", "Minotaur");
			//Pegasus
				registerEntity(EntityPegasus.class, "Pegasus",  0xf4f4f4, 0xb8a63c);
				LanguageRegistry.instance().addStringLocalization("entity.Pegasus.name", "Pegasus");
			//Satyr
				registerEntity(EntitySatyr.class, "Satyr",  0xc46f41, 0x2e2000);
				LanguageRegistry.instance().addStringLocalization("entity.Satyr.name", "Satyr");
			
		//HEROES
			//Theseus
				registerEntity(EntityTheseus.class, "Theseus",  0x882e20, 0xa67e56);
				LanguageRegistry.instance().addStringLocalization("entity.Theseus.name", "Theseus");
			//Achilles
				registerEntity(EntityAchilles.class, "Achilles",  0x22262b, 0xcca300);
				LanguageRegistry.instance().addStringLocalization("entity.Achilles.name", "Achilles");
		
		//OLYMPUS
			//Aphrodite
				registerEntity(EntityAphrodite.class, "Aphrodite",  0xf50027, 0xffd36b);
				LanguageRegistry.instance().addStringLocalization("entity.Aphrodite.name", "Aphrodite");
			//Apollo
				registerEntity(EntityApollo.class, "Apollo",  0xb7b7b7, 0xfcc532);
				LanguageRegistry.instance().addStringLocalization("entity.Apollo.name", "Apollo");
			//Ares
				registerEntity(EntityAres.class, "Ares",  0x988b7f, 0xf70810);
				LanguageRegistry.instance().addStringLocalization("entity.Ares.name", "Ares");
			//Artemis
				registerEntity(EntityArtemis.class, "Artemis",  0x2e9e21, 0x5ef763);
				LanguageRegistry.instance().addStringLocalization("entity.Artemis.name", "Artemis");
			//Athena
				registerEntity(EntityAthena.class, "Athena",  0xf1af0f, 0x900f00);
				LanguageRegistry.instance().addStringLocalization("entity.Athena.name", "Athena");
			//Demeter
				registerEntity(EntityDemeter.class, "Demeter",  0x67b946, 0xff2e4f);
				LanguageRegistry.instance().addStringLocalization("entity.Demeter.name", "Demeter");
			//Dionysus
				registerEntity(EntityDionysus.class, "Dionysus",  0xdedede, 0xa926eb);
				LanguageRegistry.instance().addStringLocalization("entity.Dionysus.name", "Dionysus");
			//Hades
				registerEntity(EntityHades.class, "Hades",  0xc58711, 0xa80b0b);
				LanguageRegistry.instance().addStringLocalization("entity.Hades.name", "Hades");
			//Helios
				registerEntity(EntityHelios.class, "Helios",  0xff970c, 0xfff980);
				LanguageRegistry.instance().addStringLocalization("entity.Helios.name", "Helios");
			//Hera
				registerEntity(EntityHera.class, "Hera",  0xe6a625, 0x82f1d6);
				LanguageRegistry.instance().addStringLocalization("entity.Hera.name", "Hera");
			//Hermes
				registerEntity(EntityHermes.class, "Hermes",  0x424242, 0xb51212);
				LanguageRegistry.instance().addStringLocalization("entity.Hermes.name", "Hermes");
			//Hestia
				registerEntity(EntityHestia.class, "Hestia",  0xff0020, 0xff9c00);
				LanguageRegistry.instance().addStringLocalization("entity.Hestia.name", "Hestia");
			//Poseidon
				registerEntity(EntityPoseidon.class, "Poseidon",  0x57c8d7, 0xbffeff);
				LanguageRegistry.instance().addStringLocalization("entity.Poseidon.name", "Poseidon");
			//Zeus
				registerEntity(EntityZeus.class, "Zeus",  0xeaeae9, 0xc99a03);
				LanguageRegistry.instance().addStringLocalization("entity.Zeus.name", "Zeus");
			
	//WORLD GEN
		//Grape Tree
			//GameRegistry.registerWorldGenerator(new WorldGenGrapeTree(false));
			
	//EVENTS
		MinecraftForge.EVENT_BUS.register(new ZeuscraftEventHandler());
	
	//MULTIPLAYER ABILITY
		NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data

}

public void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
	int id = EntityRegistry.findGlobalUniqueEntityId();

	EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
	EntityList.entityEggs.put(Integer.valueOf(id), new EntityEggInfo(id, bkEggColor, fgEggColor));
}

public void addSpawn(Class<? extends EntityLiving> entityClass, int spawnProb, int min, int max, BiomeGenBase[] biomes) {
	if (spawnProb > 0) {
		EntityRegistry.addSpawn(entityClass, spawnProb, min, max, EnumCreatureType.creature, biomes);
	}
}
}