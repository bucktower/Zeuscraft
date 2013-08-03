package fisherman77.zeuscraft.common.mobs;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentThorns;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class EntityPegasus extends EntityHorse
{

	
 public EntityPegasus(World world) 
 {
	 super(world);

	 this.setSize(1.0F, 3.0F);
  
  this.getNavigator().setAvoidsWater(true);
  
  this.tasks.addTask(0, new EntityAIPanic(this, 1.25D));
  this.tasks.addTask(1, new EntityAITempt(this, 1.25D, Item.appleRed.itemID, false));
  this.tasks.addTask(2, new EntityAIWander(this, 0.4D));
  this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
 }
 
	@Override
	protected void func_110147_ax() {
	    super.func_110147_ax();
	    
	    func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.4); //moveSpeed
	    func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(9); //maxHealth
	}
 
 public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }

protected boolean isAIEnabled()
{
    return true;
}

/**
 * Returns the sound this mob makes while it's alive.
 */
protected String getLivingSound()
{
    return "zeuscraft:pegasusliving";
}

/**
 * Returns the sound this mob makes when it is hurt.
 */
protected String getHurtSound()
{
    return "zeuscraft:pegasushurt";
}

/**
 * Returns the sound this mob makes on death.
 */
protected String getDeathSound()
{
    return "zeuscraft:pegasushurt";
}

protected boolean canDespawn()
{
	return false;
}

@Override
public EntityAgeable createChild(EntityAgeable entityageable) {
	// TODO Auto-generated method stub
	return null;
}

}