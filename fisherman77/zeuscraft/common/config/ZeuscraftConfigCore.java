package fisherman77.zeuscraft.common.config;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ZeuscraftConfigCore {

//Items
public static int itemCBronzeIngotID;
public static int itemBowGoldenID;
public static int itemBowSilverID;
public static int itemDragonToothID;
public static int itemGoldenFleeceID;
public static int itemHarpieHeadID;
public static int itemNectarID;
public static int itemPegasusSaddleID;
public static int itemPegasusFeatherID;
public static int itemReedPipesID;
public static int itemThunderboltID;
public static int itemThunderPearlID;
public static int itemTridentID;
public static int itemWaterPearlID;

//Tools
public static int toolCBronzeShovelID;
public static int toolCBronzePickID;
public static int toolCBronzeAxeID;
public static int toolCBronzeSwordID;
public static int toolCBronzeHoeID;

//Blocks
public static int blockCBronzeOreID;
public static int blockCBronzeBlockID;
public static int blockColumnID;
public static int blockMarbleID;
public static int blockMinotaurHeadID;
public static int blockOlympusPortalID;

//General
public static boolean isAwesome;

public static void loadConfig(FMLPreInitializationEvent e){
Configuration config = new Configuration(e.getSuggestedConfigurationFile()); //Gets the file

config.load(); //Loads it

/*Property CBronzeItem; //This is a property, see below
CBronzeItem = config.getItem("Celestial Bronze Ingot ID", 1400); //This gets the property
//CBronzeItem.comment = "The base CBronze item"; //This adds a comment
itemCBronzeIngotID = CBronzeItem.getInt(); //This gets the value*/

//Item ID's (last left off: 1414)
itemCBronzeIngotID = config.getItem("Celestial Bronze Ingot ID", 4500).getInt(4500);
itemBowGoldenID = config.getItem("Golden Bow ID", 4501).getInt(4501);
itemBowSilverID = config.getItem("Silver Bow ID", 4502).getInt(4502);
itemDragonToothID = config.getItem("Dragon Tooth ID", 4503).getInt(4503);
itemGoldenFleeceID = config.getItem("Golden Fleece ID", 4504).getInt(4504);
itemHarpieHeadID = config.getItem("Harpie Head Item ID", 4505).getInt(4505);
itemNectarID = config.getItem("Nectar ID", 4506).getInt(4506);
itemPegasusSaddleID = config.getItem("Pegasus Saddle ID", 4507).getInt(4507);
itemPegasusFeatherID = config.getItem("Pegasus Feather ID", 4508).getInt(4508);
itemReedPipesID = config.getItem("Reed Pipes ID", 4509).getInt(4509);
itemThunderboltID = config.getItem("Thunderbolt ID", 4510).getInt(4510);
itemThunderPearlID = config.getItem("Thunder Pearl ID", 4511).getInt(4511);
itemTridentID = config.getItem("Trident ID", 4512).getInt(4512);
itemWaterPearlID = config.getItem("Water Pearl ID", 4513).getInt(4513);

//Tool ID's
toolCBronzeShovelID = config.getItem("CBronze Shovel", 4514).getInt(4514);
toolCBronzePickID = config.getItem("CBronze Pick", 4515).getInt(4515);
toolCBronzeAxeID = config.getItem("CBronze Axe", 4516).getInt(4516);
toolCBronzeSwordID = config.getItem("CBronze Sword", 4517).getInt(4517);
toolCBronzeHoeID = config.getItem("CBronze Hoe", 4518).getInt(4518);

//Block ID's
blockCBronzeBlockID = config.getBlock("Celestial Bronze Block ID", 1200).getInt(1200);
blockCBronzeOreID = config.getBlock("Celestial Bronze Ore ID", 1201).getInt(1201);
blockColumnID = config.getBlock("Column ID", 1202).getInt(1202);
blockMarbleID = config.getBlock("Marble ID", 1203).getInt(1203);
blockMinotaurHeadID = config.getBlock("Minotaur Head ID", 1204).getInt(1204);
blockOlympusPortalID = config.getBlock("Olympus Portal ID", 1205).getInt(1205);

//General
//isAwesome = config.get(config.CATEGORY_GENERAL, "Is the mod awesome", true).getBoolean(true);

config.save(); //Saves the file

}

}