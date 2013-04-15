//taken right out of RenderSheep (copy + paste) and then changed to fit
package fisherman77.zeuscraft.common.mobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderGSheep extends RenderLiving
{
    public RenderGSheep(ModelBase par1ModelBase, ModelBase par2ModelBase, float par3)
    {
        super(par1ModelBase, par3);
        this.setRenderPassModel(par2ModelBase);
    }

    protected int setWoolColorAndRender(EntityGSheep par1EntityGSheep, int par2, float par3)
    {
        if (par2 == 0 && !par1EntityGSheep.getSheared()) //some changes are gonna have to be made to EntityGSheep to mimic EntitySheep
        {
            this.loadTexture("/Zeuscraft/Mobs/GSheep/GSheep_fur.png");
            
            return 1;
        }
        else
        {
            return -1;
        }
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLiving par1EntityLiving, int par2, float par3)
    {
        return this.setWoolColorAndRender((EntityGSheep)par1EntityLiving, par2, par3);
    }
}


 
 /**
  * REPORT:
  * Lots of errors.
  * Sheep have an especially unique way of being rendered
  * because of their fur, so I would just copied and pasted
  * RenderSheep.java.
  * 
  * Also, sheep use multiple textures for them with and without wool, so will we.
  * Lots of the action is in EntitySheep, though. Looks like you got lucky and picked
  * a mob that's a lot more copy-paste and then change, change, change, and remove
  * unnecessary parts.
  */
