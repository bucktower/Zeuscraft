package fisherman77.zeuscraft.client;
import cpw.mods.fml.client.registry.RenderingRegistry;
import fisherman77.zeuscraft.common.ZeuscraftCommonProxy;
import fisherman77.zeuscraft.common.mobs.EntityCentaur;
import fisherman77.zeuscraft.common.mobs.EntityHostileCentaur;
import fisherman77.zeuscraft.common.mobs.EntityWiseCentaur;
import fisherman77.zeuscraft.common.mobs.ModelCentaur;
import fisherman77.zeuscraft.common.mobs.RenderCentaur;
import fisherman77.zeuscraft.common.mobs.RenderHostileCentaur;
import fisherman77.zeuscraft.common.mobs.RenderWiseCentaur;
import net.minecraftforge.client.MinecraftForgeClient;

public class ZeuscraftClientProxy extends ZeuscraftCommonProxy {
        
public void registerRenderInformation(){
	MinecraftForgeClient.preloadTexture(ITEMS_PNG);
	MinecraftForgeClient.preloadTexture(BLOCK_PNG);
}

public void registerRenderers(){
	float shadowSize = 0.5F;
	RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class, new RenderCentaur(new ModelCentaur(), shadowSize));
	RenderingRegistry.registerEntityRenderingHandler(EntityWiseCentaur.class, new RenderWiseCentaur(new ModelCentaur(), shadowSize));   
	RenderingRegistry.registerEntityRenderingHandler(EntityHostileCentaur.class, new RenderHostileCentaur(new ModelCentaur(), shadowSize));   

}

}