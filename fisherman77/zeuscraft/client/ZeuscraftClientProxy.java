package fisherman77.zeuscraft.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import fisherman77.zeuscraft.common.ZeuscraftCommonProxy;
import fisherman77.zeuscraft.common.mobs.EntityPegasus;
import fisherman77.zeuscraft.common.mobs.EntityTheseus;
import fisherman77.zeuscraft.common.mobs.ModelPegasus;
import fisherman77.zeuscraft.common.mobs.RenderPegasus;
import fisherman77.zeuscraft.common.mobs.RenderTheseus;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraftforge.client.MinecraftForgeClient;

public class ZeuscraftClientProxy extends ZeuscraftCommonProxy {
        
	public void registerRenderInformation(){
		
	}
	
	public void registerRenderers(){
		float shadowSize = 0.5F;
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPegasus.class, new RenderPegasus(new ModelPegasus(), shadowSize));
		RenderingRegistry.registerEntityRenderingHandler(EntityTheseus.class, new RenderTheseus(new ModelBiped(), shadowSize));
	}

}