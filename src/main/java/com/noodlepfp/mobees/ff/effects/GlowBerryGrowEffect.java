package com.noodlepfp.mobees.ff.effects;

import com.noodlepfp.mobees.genetics.effect.ThrottledBeeEffect;
import forestry.api.apiculture.IBeeHousing;
import forestry.api.genetics.IEffectData;
import forestry.api.genetics.IGenome;
import forestry.apiculture.genetics.Bee;
import forestry.core.utils.VecUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class GlowBerryGrowEffect
		extends ThrottledBeeEffect
{
	public GlowBerryGrowEffect()
	{
		super(false, 200, true, true);
	}
	
	@Override
	public IEffectData doEffectThrottled(IGenome genome, IEffectData storedData, IBeeHousing housing)
	{
		Level level = housing.getWorldObj();
		Vec3i area = Bee.getModifiedArea(genome, housing);
		
		BlockPos randomPos = VecUtil.getRandomPositionInArea(level.random, area);
		
		BlockPos posBlock = randomPos.offset(housing.getCoordinates()).offset(center(area));
		
		if(level.hasChunkAt(posBlock))
		{
			BlockState state = level.getBlockState(posBlock);
			if(state.hasProperty(BlockStateProperties.BERRIES) && !state.getValue(BlockStateProperties.BERRIES))
			{
				level.setBlockAndUpdate(posBlock, state.setValue(BlockStateProperties.BERRIES, true));
			}
		}
		
		return storedData;
	}
	
	public static Vec3i center(Vec3i vec)
	{
		return new Vec3i(-vec.getZ() / 2, -(vec.getY() - 1) / 2, -vec.getZ() / 2);
	}
}