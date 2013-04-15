package fisherman77.zeuscraft.common.mobs; //<-- changed package name, not "fisherman.*", but "fisherman77.*". It does matter. :)

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
//import net.ninecraft.entity.EnumCreatureAttribute; <-- mispelling
import net.minecraft.world.World;

public class EntityGSheep extends EntityMob
{
  public EntityGSheep(World par1World)
  {
    super(par1World);
    this.texture = "Zeuscraft/Mobs/GSheep/GSheep.png";//<-- (I use capital letters for folders and files starting letter)
    /**This is not in yet.*/
    this.moveSpeed =  0.30f;
    this.yOffset *= 1.25f;
    this.setSize(0.9F, 1.3F); //<-- sheep's
    //this.setSize(this.width * 0.625f,this.height * 1.25); <-- Just use sheep's
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
/**Please check.
 * 
 * REPORT:
 * 1st: You've got a few errors in here that are purely mispellings.
 * Do you have Eclipse installed?
 * If not, everyone needs it, and it will correct all these for you,
 * in addition to underlining most of errors in red.
 * Just Google Eclipse IDE, and it's made by Oracle.
 * Once you have that, open it, and select the "eclipse" folder of MCP as your
 * workspace.
 * 
 * 2nd: You don't necessarily have to code entity files from scratch.
 * Lots of what I do comes from other mobs. For example, hostile centaur
 * comes from skeleton. You just gotta know what parts to keep in and put out.
 * For example, my dromaeosaurus (you can check out the code on GitHub) is based
 * the same code as a wolf, but I had to only use the taming parts, not the
 * tail wagging, etc. This is why MCP is critical, because you have access to
 * Vanilla files.
 * 
 * 3rd What you're gonna need to do: Get EntitySheep and add in elements
 * from EntityZombie. I WOULD RECOMMEND USING THE NEW AI!*/
