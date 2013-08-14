package fisherman77.zeuscraft.common.handlers;

import java.awt.Event;
import java.util.ArrayList;
import java.util.Random;

import fisherman77.zeuscraft.common.Zeuscraft;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class ZeuscraftEventHandler
{
	private int BlockID;
	/** Used to make the sapling grow the tree **/
	@ForgeSubscribe
	public void bonemealUsed(BonemealEvent event)
	{
	}
}