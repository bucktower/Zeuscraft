package fisherman77.zeuscraft.common.mobs;

import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;

final class EntityPegasusBredSelector implements IEntitySelector
{
    /**
     * Return whether the specified entity is applicable to this filter.
     */
    public boolean isEntityApplicable(Entity par1Entity)
    {
        return par1Entity instanceof EntityPegasus && ((EntityPegasus)par1Entity).func_110205_ce();
    }
}
