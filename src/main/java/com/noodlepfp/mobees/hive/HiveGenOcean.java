package com.noodlepfp.mobees.hive;

import forestry.api.apiculture.hives.IHiveGen;
import forestry.apiculture.hives.HiveGenGround;
import net.minecraft.core.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;

import javax.annotation.Nullable;

public class HiveGenOcean
		extends HiveGenGround
{
	protected final TagKey<Block> blocks;
	
	public HiveGenOcean(TagKey<Block> blocks)
	{
		super();
		this.blocks = blocks;
	}
	
	@Override
	public boolean isValidLocation(WorldGenLevel world, BlockPos pos)
	{
		return world.getBlockState(pos.below()).is(blocks);
	}
	
	@Override
	public boolean canReplace(BlockState blockState, WorldGenLevel world, BlockPos pos)
	{
		return blockState.getBlock() == Blocks.WATER;
	}
	
	@Override
	@Nullable
	public BlockPos getPosForHive(WorldGenLevel level, int posX, int posZ)
	{
		int groundY = level.getHeight(Heightmap.Types.OCEAN_FLOOR_WG, posX, posZ);
		int minBuildHeight = level.getMinBuildHeight();
		if(groundY == minBuildHeight)
		{
			return null;
		} else
		{
			BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos(posX, groundY, posZ);
			
			for(BlockState blockState = level.getBlockState(pos); IHiveGen.isTreeBlock(blockState) || this.canReplace(blockState, level, pos); blockState = level.getBlockState(pos))
			{
				pos.move(Direction.DOWN);
				if(pos.getY() <= minBuildHeight)
				{
					return null;
				}
			}
			
			return pos.above();
		}
	}
}