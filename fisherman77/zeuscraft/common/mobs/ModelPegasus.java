package fisherman77.zeuscraft.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelPegasus extends ModelBase
{
  ModelRenderer leg4;
  ModelRenderer leg3;
  ModelRenderer leg2;
  ModelRenderer leg1;
  ModelRenderer body;
  ModelRenderer neck;
  ModelRenderer head;
  ModelRenderer ear2;
  ModelRenderer ear1;
  ModelRenderer wingbase;
  ModelRenderer wingbase2;
  ModelRenderer wingtip;
  ModelRenderer wingtip2;
  ModelRenderer wingleft;
  ModelRenderer wingright;
  ModelRenderer wingleft2;
  ModelRenderer wingright2;
  ModelRenderer wingleft3;
  ModelRenderer wingright3;
  ModelRenderer Shape1;
  ModelRenderer Shape2;

  public ModelPegasus()
  {
    textureWidth = 128;
    textureHeight = 64;

    this.leg4 = new ModelRenderer(this, 83, 0);
    this.leg4.addBox(-2.0F, 0.0F, -2.0F, 5, 21, 5);
    this.leg4.setRotationPoint(5.0F, 3.0F, -6.0F);
    this.leg4.setTextureSize(128, 64);
    this.leg4.mirror = true;
    setRotation(this.leg4, 0.0F, 0.0F, 0.0F);
    this.leg3 = new ModelRenderer(this, 83, 0);
    this.leg3.addBox(-2.0F, 0.0F, -2.0F, 5, 21, 5);
    this.leg3.setRotationPoint(-6.0F, 3.0F, -6.0F);
    this.leg3.setTextureSize(128, 64);
    this.leg3.mirror = true;
    setRotation(this.leg3, 0.0F, 0.0F, 0.0F);
    this.leg2 = new ModelRenderer(this, 83, 0);
    this.leg2.addBox(-2.0F, 0.0F, -2.0F, 5, 21, 5);
    this.leg2.setRotationPoint(5.0F, 3.0F, 9.0F);
    this.leg2.setTextureSize(128, 64);
    this.leg2.mirror = true;
    setRotation(this.leg2, 0.0F, 0.0F, 0.0F);
    this.leg1 = new ModelRenderer(this, 83, 0);
    this.leg1.addBox(-2.0F, 0.0F, -2.0F, 5, 21, 5);
    this.leg1.setRotationPoint(-6.0F, 3.0F, 9.0F);
    this.leg1.setTextureSize(128, 64);
    this.leg1.mirror = true;
    setRotation(this.leg1, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 0, 20);
    this.body.addBox(0.0F, 0.0F, 0.0F, 14, 12, 23);
    this.body.setRotationPoint(-7.0F, -9.0F, -10.0F);
    this.body.setTextureSize(128, 64);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.neck = new ModelRenderer(this, 100, 40);
    this.neck.addBox(0.0F, 0.0F, 0.0F, 6, 16, 8);
    this.neck.setRotationPoint(-3.0F, -21.0F, -16.0F);
    this.neck.setTextureSize(128, 64);
    this.neck.mirror = true;
    setRotation(this.neck, 0.4089647F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-4.0F, -2.0F, -12.0F, 8, 8, 12);
    this.head.setRotationPoint(0.0F, -22.0F, -13.0F);
    this.head.setTextureSize(128, 64);
    this.head.mirror = true;
    setRotation(this.head, 0.6889411F, 0.0F, 0.0F);
    this.ear2 = new ModelRenderer(this, 40, 0);
    this.ear2.addBox(2.0F, -5.0F, -1.0F, 2, 3, 1);
    this.ear2.setRotationPoint(0.0F, -22.0F, -13.0F);
    this.ear2.setTextureSize(128, 64);
    this.ear2.mirror = true;
    setRotation(this.ear2, 0.6889338F, 0.0F, 0.0F);
    this.ear1 = new ModelRenderer(this, 40, 0);
    this.ear1.addBox(-4.0F, -5.0F, -1.0F, 2, 3, 1);
    this.ear1.setRotationPoint(0.0F, -22.0F, -13.0F);
    this.ear1.setTextureSize(128, 64);
    this.ear1.mirror = true;
    setRotation(this.ear1, 0.6889338F, 0.0F, 0.0F);
    this.wingbase = new ModelRenderer(this, 0, 55);
    this.wingbase.addBox(0.0F, 0.0F, 0.0F, 14, 3, 3);
    this.wingbase.setRotationPoint(7.0F, -9.0F, -5.0F);
    this.wingbase.setTextureSize(128, 64);
    this.wingbase.mirror = true;
    setRotation(this.wingbase, 0.0F, -0.520501F, 0.0F);
    this.wingbase2 = new ModelRenderer(this, 0, 55);
    this.wingbase2.addBox(-14.0F, 0.0F, 0.0F, 14, 3, 3);
    this.wingbase2.setRotationPoint(-7.0F, -9.0F, -5.0F);
    this.wingbase2.setTextureSize(128, 64);
    this.wingbase2.mirror = true;
    setRotation(this.wingbase2, 0.0F, 0.520501F, 0.0F);
    this.wingtip = new ModelRenderer(this, 34, 55);
    this.wingtip.addBox(14.0F, 0.5F, 0.0F, 26, 2, 2);
    this.wingtip.setRotationPoint(7.0F, -9.0F, -5.0F);
    this.wingtip.setTextureSize(128, 64);
    this.wingtip.mirror = true;
    setRotation(this.wingtip, 0.0F, -0.520501F, 0.0F);
    this.wingtip2 = new ModelRenderer(this, 34, 55);
    this.wingtip2.addBox(-40.0F, 0.5F, 0.5F, 26, 2, 2);
    this.wingtip2.setRotationPoint(-7.0F, -9.0F, -5.0F);
    this.wingtip2.setTextureSize(128, 64);
    this.wingtip2.mirror = true;
    setRotation(this.wingtip2, 0.0F, 0.520501F, 0.0F);
    this.wingleft = new ModelRenderer(this, 35, 59);
    this.wingleft.addBox(11.0F, 0.5F, -3.0F, 22, 2, 3);
    this.wingleft.setRotationPoint(7.0F, -9.0F, -5.0F);
    this.wingleft.setTextureSize(128, 64);
    this.wingleft.mirror = true;
    setRotation(this.wingleft, 0.0F, -0.8170389F, 0.0F);
    this.wingright = new ModelRenderer(this, 35, 59);
    this.wingright.addBox(-31.0F, 0.5F, -3.0F, 22, 2, 3);
    this.wingright.setRotationPoint(-7.0F, -9.0F, -5.0F);
    this.wingright.setTextureSize(128, 64);
    this.wingright.mirror = true;
    setRotation(this.wingright, 0.0F, 0.8542247F, 0.0F);
    this.wingleft2 = new ModelRenderer(this, 41, 59);
    this.wingleft2.addBox(6.0F, 0.5F, -3.5F, 19, 2, 3);
    this.wingleft2.setRotationPoint(7.0F, -9.0F, -5.0F);
    this.wingleft2.setTextureSize(128, 64);
    this.wingleft2.mirror = true;
    setRotation(this.wingleft2, 0.0F, -1.116694F, 0.0F);
    this.wingright2 = new ModelRenderer(this, 41, 59);
    this.wingright2.addBox(-25.0F, 0.5F, -3.0F, 19, 2, 3);
    this.wingright2.setRotationPoint(-7.0F, -9.0F, -5.0F);
    this.wingright2.setTextureSize(128, 64);
    this.wingright2.mirror = true;
    setRotation(this.wingright2, 0.0F, 1.116702F, 0.0F);
    this.wingleft3 = new ModelRenderer(this, 49, 59);
    this.wingleft3.addBox(3.5F, 0.5F, -2.0F, 15, 2, 3);
    this.wingleft3.setRotationPoint(7.0F, -9.0F, -5.0F);
    this.wingleft3.setTextureSize(128, 64);
    this.wingleft3.mirror = true;
    setRotation(this.wingleft3, 0.0F, -1.347725F, 0.0F);
    this.wingright3 = new ModelRenderer(this, 49, 59);
    this.wingright3.addBox(-18.0F, 0.5F, -2.0F, 15, 2, 3);
    this.wingright3.setRotationPoint(-7.0F, -9.0F, -5.0F);
    this.wingright3.setTextureSize(128, 64);
    this.wingright3.mirror = true;
    setRotation(this.wingright3, 0.0F, 1.347725F, 0.0F);
    this.Shape1 = new ModelRenderer(this, 108, 0);
    this.Shape1.addBox(-2.5F, -3.0F, 0.0F, 5, 20, 3);
    this.Shape1.setRotationPoint(0.0F, -10.0F, 15.0F);
    this.Shape1.setTextureSize(128, 64);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.1487144F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 9, 47);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 4, 3, 5);
    this.Shape2.setRotationPoint(-2.0F, -9.0F, 11.0F);
    this.Shape2.setTextureSize(128, 64);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.6320364F, 0.0F, 0.0F);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    leg4.render(f5);
    leg3.render(f5);
    leg2.render(f5);
    leg1.render(f5);
    body.render(f5);
    neck.render(f5);
    head.render(f5);
    ear2.render(f5);
    ear1.render(f5);
    wingbase.render(f5);
    wingbase2.render(f5);
    wingtip.render(f5);
    wingtip2.render(f5);
    wingleft.render(f5);
    wingright.render(f5);
    wingleft2.render(f5);
    wingright2.render(f5);
    wingleft3.render(f5);
    wingright3.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
  }

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;

    this.wingbase2.rotateAngleZ = MathHelper.sin(f2 * 1.041593F * -0.4F) * -0.8F - -6.5F;
    this.wingtip2.rotateAngleZ = MathHelper.sin(f2 * 1.041593F * -0.4F) * -0.8F - -6.5F;
    this.wingright.rotateAngleZ = MathHelper.sin(f2 * 1.041593F * -0.4F) * -0.8F - -6.5F;
    this.wingright2.rotateAngleZ = MathHelper.sin(f2 * 1.041593F * -0.4F) * -0.8F - -6.5F;
    this.wingright3.rotateAngleZ = MathHelper.sin(f2 * 1.041593F * -0.4F) * -0.8F - -6.5F;
    this.wingbase.rotateAngleZ = MathHelper.sin(f2 * 1.041593F * 0.4F) * -0.8F + -6.5F;
    this.wingtip.rotateAngleZ = MathHelper.sin(f2 * 1.041593F * 0.4F) * -0.8F + -6.5F;
    this.wingleft.rotateAngleZ = MathHelper.sin(f2 * 1.041593F * 0.4F) * -0.8F + -6.5F;
    this.wingleft2.rotateAngleZ = MathHelper.sin(f2 * 1.041593F * 0.4F) * -0.8F + -6.5F;
    this.wingleft3.rotateAngleZ = MathHelper.sin(f2 * 1.041593F * 0.4F) * -0.8F + -6.5F;
    this.Shape1.rotateAngleY = MathHelper.cos(f * 0.6F) * 0.3F * f1;
    this.Shape1.rotateAngleZ = MathHelper.cos(f * 0.5F) * 1.5F * f1;
  }
}