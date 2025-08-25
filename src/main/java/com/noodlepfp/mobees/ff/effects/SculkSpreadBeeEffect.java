package com.noodlepfp.mobees.ff.effects;

import com.noodlepfp.mobees.genetics.effect.ThrottledBeeEffect;
import forestry.api.apiculture.IBeeHousing;
import forestry.api.genetics.*;
import forestry.apiculture.genetics.Bee;
import forestry.core.utils.VecUtil;
import net.minecraft.core.*;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;

public class SculkSpreadBeeEffect
		extends ThrottledBeeEffect
{
	public SculkSpreadBeeEffect()
	{
		super(false, 200, true, true);
	}
	
	@Override
	public IEffectData doEffectThrottled(IGenome genome, IEffectData storedData, IBeeHousing housing)
	{
		Level level = housing.getWorldObj();
		if(level.isClientSide)
		{
			return storedData;
		}
		RandomSource random = level.random;
		Vec3i area = Bee.getModifiedArea(genome, housing);
		
		BlockPos randomPos = VecUtil.getRandomPositionInArea(random, area);
		
		BlockPos posBlock = randomPos.offset(housing.getCoordinates()).offset(NonStackingBeeEffect.center(area));
		
		if(level.hasChunkAt(posBlock))
		{
			BlockState state = level.getBlockState(posBlock);
			
			if(state.isAir() && !level.getBlockState(posBlock.below()).isAir())
			{
				SculkSpreader spreader = SculkSpreader.createLevelSpreader();
				spreader.addCursors(posBlock, random.nextInt(5) + 1);
				spreader.updateCursors(level, housing.getCoordinates(), random, true);
				spreader.updateCursors(level, housing.getCoordinates(), random, true);
				spreader.updateCursors(level, housing.getCoordinates(), random, true);
				spreader.updateCursors(level, housing.getCoordinates(), random, true);
				spreader.updateCursors(level, housing.getCoordinates(), random, true);
			} else if(state.getBlock() == Blocks.SCULK_SHRIEKER)
			{
				level.setBlockAndUpdate(posBlock.above(), Blocks.SCULK_SHRIEKER.defaultBlockState().setValue(SculkShriekerBlock.CAN_SUMMON, true));
			}
		}
		
		return storedData;
	}
}