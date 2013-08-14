package fisherman77.zeuscraft.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import fisherman77.zeuscraft.common.ZeuscraftCommonProxy;
import fisherman77.zeuscraft.common.mobs.EntityCyclops;
import fisherman77.zeuscraft.common.mobs.EntityMinotaur;
import fisherman77.zeuscraft.common.mobs.EntityPegasus;
import fisherman77.zeuscraft.common.mobs.EntitySatyr;
import fisherman77.zeuscraft.common.mobs.ModelPegasus;
import fisherman77.zeuscraft.common.mobs.ModelZBiped;
import fisherman77.zeuscraft.common.mobs.RenderCyclops;
import fisherman77.zeuscraft.common.mobs.RenderMinotaur;
import fisherman77.zeuscraft.common.mobs.RenderPegasus;
import fisherman77.zeuscraft.common.mobs.RenderSatyr;
import fisherman77.zeuscraft.common.mobs.heroes.EntityAchilles;
import fisherman77.zeuscraft.common.mobs.heroes.EntityTheseus;
import fisherman77.zeuscraft.common.mobs.heroes.RenderAchilles;
import fisherman77.zeuscraft.common.mobs.heroes.RenderTheseus;
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
import fisherman77.zeuscraft.common.mobs.olympus.RenderAphrodite;
import fisherman77.zeuscraft.common.mobs.olympus.RenderApollo;
import fisherman77.zeuscraft.common.mobs.olympus.RenderAres;
import fisherman77.zeuscraft.common.mobs.olympus.RenderArtemis;
import fisherman77.zeuscraft.common.mobs.olympus.RenderAthena;
import fisherman77.zeuscraft.common.mobs.olympus.RenderDemeter;
import fisherman77.zeuscraft.common.mobs.olympus.RenderDionysus;
import fisherman77.zeuscraft.common.mobs.olympus.RenderHades;
import fisherman77.zeuscraft.common.mobs.olympus.RenderHelios;
import fisherman77.zeuscraft.common.mobs.olympus.RenderHera;
import fisherman77.zeuscraft.common.mobs.olympus.RenderHermes;
import fisherman77.zeuscraft.common.mobs.olympus.RenderHestia;
import fisherman77.zeuscraft.common.mobs.olympus.RenderPoseidon;
import fisherman77.zeuscraft.common.mobs.olympus.RenderZeus;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraftforge.client.MinecraftForgeClient;

public class ZeuscraftClientProxy extends ZeuscraftCommonProxy {
        
	public void registerRenderInformation(){
		
	}
	
	public void registerRenderers(){
		float shadowSize = 0.5F;
		
			//MOBS
				RenderingRegistry.registerEntityRenderingHandler(EntityCyclops.class, new RenderCyclops(new ModelZBiped(), shadowSize, 2.0F));
				RenderingRegistry.registerEntityRenderingHandler(EntityMinotaur.class, new RenderMinotaur(new ModelZBiped(), shadowSize, 1.5F));
				RenderingRegistry.registerEntityRenderingHandler(EntityPegasus.class, new RenderPegasus(new ModelPegasus(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntitySatyr.class, new RenderSatyr(new ModelZBiped(), shadowSize, 0.8F));
			//HEROES
				RenderingRegistry.registerEntityRenderingHandler(EntityAchilles.class, new RenderAchilles(new ModelBiped(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntityTheseus.class, new RenderTheseus(new ModelBiped(), shadowSize));
			//OLYMPUS
				RenderingRegistry.registerEntityRenderingHandler(EntityAphrodite.class, new RenderAphrodite(new ModelBiped(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntityApollo.class, new RenderApollo(new ModelBiped(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntityAres.class, new RenderAres(new ModelBiped(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntityArtemis.class, new RenderArtemis(new ModelBiped(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntityAthena.class, new RenderAthena(new ModelBiped(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntityDemeter.class, new RenderDemeter(new ModelBiped(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntityDionysus.class, new RenderDionysus(new ModelBiped(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntityHades.class, new RenderHades(new ModelBiped(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntityHelios.class, new RenderHelios(new ModelBiped(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntityHera.class, new RenderHera(new ModelBiped(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntityHermes.class, new RenderHermes(new ModelBiped(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntityHestia.class, new RenderHestia(new ModelBiped(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntityPoseidon.class, new RenderPoseidon(new ModelBiped(), shadowSize));
				RenderingRegistry.registerEntityRenderingHandler(EntityZeus.class, new RenderZeus(new ModelBiped(), shadowSize));

	}

}