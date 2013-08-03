package fisherman77.zeuscraft.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

public class ModelHeckhound extends ModelBase
{
  ModelRenderer Mane;
  ModelRenderer Body;
  ModelRenderer Leg1;
  ModelRenderer Leg2;
  ModelRenderer Leg3;
  ModelRenderer Leg4;
  ModelRenderer Tail;
  ModelRenderer Head;

  public ModelHeckhound()
  {
    textureWidth = 64;
    textureHeight = 64;
    
    //a("Head.Head", 0, 0);
    //a("Head.Nose", 0, 12);
    //a("Head.Ear1", 0, 30);
    //a("Head.Ear2", 6, 30);

    this.Mane = new ModelRenderer(this, 24, 0);
    this.Mane.addBox(-4.0F, -3.0F, -3.0F, 10, 7, 9);
    this.Mane.setRotationPoint(-2.0F, 12.0F, -4.0F);
    this.Mane.setTextureSize(64, 64);
    this.Mane.mirror = true;
    setRotation(this.Mane, 1.570796F, 0.0F, 0.0F);
    this.Body = new ModelRenderer(this, 24, 16);
    this.Body.addBox(-4.0F, -2.0F, -3.0F, 8, 10, 8);
    this.Body.setRotationPoint(-1.0F, 12.0F, 2.0F);
    this.Body.setTextureSize(64, 64);
    this.Body.mirror = true;
    setRotation(this.Body, 1.570796F, 0.0F, 0.0F);
    this.Leg1 = new ModelRenderer(this, 0, 35);
    this.Leg1.addBox(-2.0F, 0.0F, -2.0F, 3, 9, 3);
    this.Leg1.setRotationPoint(-3.5F, 15.0F, 7.0F);
    this.Leg1.setTextureSize(64, 64);
    this.Leg1.mirror = true;
    setRotation(this.Leg1, 0.0F, 0.0F, 0.0F);
    this.Leg2 = new ModelRenderer(this, 12, 35);
    this.Leg2.addBox(-1.0F, 0.0F, -2.0F, 3, 9, 3);
    this.Leg2.setRotationPoint(1.5F, 15.0F, 7.0F);
    this.Leg2.setTextureSize(64, 64);
    this.Leg2.mirror = true;
    setRotation(this.Leg2, 0.0F, 0.0F, 0.0F);
    this.Leg3 = new ModelRenderer(this, 24, 35);
    this.Leg3.addBox(-2.0F, 0.0F, -2.0F, 3, 9, 3);
    this.Leg3.setRotationPoint(-3.5F, 15.0F, -5.0F);
    this.Leg3.setTextureSize(64, 64);
    this.Leg3.mirror = true;
    setRotation(this.Leg3, 0.0F, 0.0F, 0.0F);
    this.Leg4 = new ModelRenderer(this, 36, 35);
    this.Leg4.addBox(-1.0F, 0.0F, -2.0F, 3, 9, 3);
    this.Leg4.setRotationPoint(1.5F, 15.0F, -5.0F);
    this.Leg4.setTextureSize(64, 64);
    this.Leg4.mirror = true;
    setRotation(this.Leg4, 0.0F, 0.0F, 0.0F);
    this.Tail = new ModelRenderer(this, 0, 17);
    this.Tail.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2);
    this.Tail.setRotationPoint(-1.0F, 9.0F, 10.0F);
    this.Tail.setTextureSize(64, 64);
    this.Tail.mirror = true;
    setRotation(this.Tail, 1.570796F, 0.0F, 0.0F);
    this.Head = new ModelRenderer(this, "Head");
    this.Head.addBox(-1.0F, 11.0F, -5.0F, 0, 0, 0);
    setRotation(this.Head, 0.0F, 0.0F, 0.0F);
    this.Head.mirror = true;
    this.Head.addBox("Head", -3.0F, -3.0F, -6.0F, 6, 6, 6);
    this.Head.addBox("Nose", -2.0F, 0.0F, -8.0F, 4, 3, 2);
    this.Head.addBox("Ear1", -3.0F, -6.0F, -4.0F, 1, 3, 2);
    this.Head.addBox("Ear2", 2.0F, -6.0F, -4.0F, 1, 3, 2);
  }

  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);

    /*if (this.isTame)
    {
      float f = 2.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 5.0F * par7, 2.0F * par7);
      this.Head.render(par7);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(1.0F / f, 1.0F / f, 1.0F / f);
      GL11.glTranslatef(0.0F, 24.0F * par7, 0.0F);
      this.Body.render(par7);
      this.Leg1.render(par7);
      this.Leg2.render(par7);
      this.Leg3.render(par7);
      this.Leg4.render(par7);
      this.Tail.render(par7);
      this.Mane.render(par7);
      GL11.glPopMatrix();
    }
    else
    {*/
      this.Head.render(par7);
      this.Body.render(par7);
      this.Leg1.render(par7);
      this.Leg2.render(par7);
      this.Leg3.render(par7);
      this.Leg4.render(par7);
      this.Tail.render(par7);
      this.Mane.render(par7);
    //}
  }

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    this.Head.rotateAngleX = f3 / 57.295776F;
    this.Head.rotateAngleX = f4 / 57.295776F;
    this.Leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.Leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1;
    this.Leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1;
    this.Leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  }
}