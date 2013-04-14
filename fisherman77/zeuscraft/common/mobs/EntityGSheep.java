package fisherman.zeuscraft.common.mobs;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.Entity;
import net.ninecraft.entity.EnumCreatureAttribute;
import net.minecraft.world.World;

public class EntityGSheep extends EntityMob
{
  public EntityGSheep(World par1World)
  {
    super(par1World);
    this.texture = "Zeuscraft/mobs/GSheep/GSheep.png";
    /**This is not in yet.*/
    this.moveSpeed =  0.30f;
    this.yOffset *= 1.25f;
    this.setSize(this.width * 0.625f,this.height * 1.25*);
  }
  
  public int getAttackStrength(Entity par1Entity)
  {
    return 6;
  
  }
  public int getMaxHealth()
  {
   return 10;
  }
  public EnumCreatureAttribute getCreatureAttribute()
  {
    return EnumCreatureAttribute.UNDEAD;
  }
}
/**Please check.*/
