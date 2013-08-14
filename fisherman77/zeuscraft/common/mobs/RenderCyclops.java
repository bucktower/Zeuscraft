package fisherman77.zeuscraft.common.mobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderCyclops extends RenderLiving
{
    /** Scale of the model to use */
    private float scale;
    
	private static final ResourceLocation skin = new ResourceLocation("zeuscraft", "textures/entities/monsters/cyclops.png");

	public RenderCyclops(ModelBase par1ModelBase, float par2, float par3)
    {
        super(par1ModelBase, par2 * par3);
        this.scale = par3;
    }
	
    /**
     * Applies the scale to the transform matrix
     */
    protected void preRenderScale(EntityCyclops par1EntityCyclops, float par2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.preRenderScale((EntityCyclops)par1EntityLivingBase, par2);
    }

	@Override
	protected ResourceLocation func_110775_a(Entity entity) {
		return skin;
	}
}