 package fisherman77.zeuscraft.common.mobs;
 
 import cpw.fml.relauncher.Side;
 import cpw.fml.relauncher.SideOnly;
 import net.minecraft.client.model.ModelBase;
 import net.minecraft.client.renderer.enity.RenderLiving;
 import net.minecraft.entity.EnityLiving;
 import org.lwjgl.opengl.GL11;
 
 @SideOnly(Side.CLIENT)
 public class  RenderGSheep extends RenderLiving
 {
 
 private float scale;
 
 public RenderGSheep(ModelBase par1ModelBase, float par2, float par3)
 {
   super(par1ModelBase, par2 * par3);
   this.scale = par3 
 }
 protected void preRenderScale(EntityGSheep par1EnityGSheep, float par2)
 }
 {
   GL11.glScalef(this.scale, this.scale, this.scale)
 }
 protected void preRenderCallBack(EntityLiving par1EntityLiving, float par2)
 {
   this.preRenderScale((EntityGSheep)par1EntityLiving, par2)
 }
 }
