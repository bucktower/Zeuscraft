package fisherman77.zeuscraft.common.mobs;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;


public class EntitySatyr extends EntityMob
{

public EntitySatyr(World par1World) 
 {
  super(par1World);
  
  this.setSize(0.8F, 1.4F);
  
  this.tasks.addTask(0, new EntityAISwimming(this));
  this.tasks.addTask(1, new EntityAIWander(this, 0.6));
  this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
  this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true)); 
  }

	@Override
	protected void func_110147_ax() {
	    super.func_110147_ax();
	    
	    func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.6); //moveSpeed
	    func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(20); //maxHealth
	    func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(10); //attackStrength
	}
	 
	 public EnumCreatureAttribute getCreatureAttribute()
	    {
	        return EnumCreatureAttribute.UNDEAD;
	    }
	
	protected boolean isAIEnabled()
	{
	    return true;
	}
}