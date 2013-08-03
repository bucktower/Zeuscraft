package fisherman77.zeuscraft.common.worldgen;

import java.util.Random;

import net.minecraft.world.World;

import fisherman77.zeuscraft.common.Zeuscraft;

public class WorldGenGrapeTree extends xy
{
  public boolean a(World world, Random random, int i, int j, int k)
  {
    if ((world.a(i, j, k) != aig.u.ca) || (world.a(i, j + 1, k) != 0))
    {
      return false;
    }

    int l = Zeuscraft.GrapeLog.blockID;
    int i1 = Zeuscraft.GrapeLeaves.blockID;
    world.setBlock(i, j + 1, k, l);
    world.setBlock(i, j + 2, k, l, 1);
    world.setBlock(i - 1, j + 2, k + 1, i1, 1);
    world.setBlock(i, j + 2, k + 1, i1, 1);
    world.setBlock(i + 1, j + 2, k + 1, i1, 1);
    world.setBlock(i - 1, j + 2, k, i1, 1);
    world.setBlock(i + 1, j + 2, k, i1, 1);
    world.setBlock(i - 1, j + 2, k - 1, i1, 1);
    world.setBlock(i, j + 2, k - 1, i1, 1);
    world.setBlock(i + 1, j + 2, k - 1, i1, 1);
    return true;
  }
}