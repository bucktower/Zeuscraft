package fisherman77.zeuscraft.common.handlers;

import java.beans.EventHandler;

import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;

public class ZeuscraftSoundHandler
{
    @ForgeSubscribe
    public void onSound(SoundLoadEvent event)
    {
        try 
        {
        //ITEMS
        	//Reed Pipes
        		event.manager.addSound("zeuscraft:reedpipes.ogg");
        //MOBS
	        //Pegasus
	            event.manager.addSound("zeuscraft:pegasusliving.ogg");          
	            event.manager.addSound("zeuscraft:pegasushurt.ogg");
        } 
        catch (Exception e)
        {
            System.err.println("[Paleocraft] Failed to register one or more sounds.");
        }
    }
}
