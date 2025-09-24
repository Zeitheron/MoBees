package com.noodlepfp.mobees.alveary.block;

import com.noodlepfp.mobees.alveary.MoreBeesBlockAlvearyType;
import com.noodlepfp.mobees.alveary.MoreBeesTilePowerable;
import com.noodlepfp.mobees.api.IAlvearyErrorModifier;
import forestry.api.apiculture.IBeeModifier;
import forestry.api.apiculture.genetics.*;
import forestry.api.core.*;
import forestry.api.genetics.IGenome;
import forestry.api.genetics.IIndividual;
import forestry.api.genetics.alleles.BeeChromosomes;
import forestry.api.genetics.capability.IIndividualHandlerItem;
import forestry.api.multiblock.IAlvearyComponent;
import forestry.apiculture.multiblock.MultiblockLogicAlveary;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Set;

import static com.noodlepfp.mobees.alveary.MoreBeesBlockAlveary.LIGHT_LEVEL;

public class TileAlvearyMoon
		extends MoreBeesTilePowerable
		implements IAlvearyComponent.BeeModifier<MultiblockLogicAlveary>
{
	private final BlockPos pos;
	
	private final IBeeModifier MODIFIER = new IAlvearyErrorModifier()
	{
		@Override
		public void removeErrors(Set<IError> workErrors)
		{
			// if active bee is nocturnal, moon lamp will make bee always active
			if(isActiveBeeNocturnal() && getWorkingTime() > 0)
			{
				workErrors.remove(ForestryError.NOT_NIGHT);
				workErrors.remove(ForestryError.NOT_GLOOMY);
			}
		}
	};
	
	public TileAlvearyMoon(BlockPos pos, BlockState state)
	{
		super(MoreBeesBlockAlvearyType.MOON, pos, state, "Glowing", 1, 100);
		this.pos = pos;
	}
	
	@Override
	public void updateServer(int tickCount)
	{
		super.updateServer(tickCount);
		if(super.isActive())
		{
			if(getLightLevel() == 0)
			{
				this.level.setBlockAndUpdate(pos, getBlockState().setValue(LIGHT_LEVEL, 3));
			}
		} else
		{
			if(getLightLevel() != 0)
			{
				this.level.setBlockAndUpdate(pos, getBlockState().setValue(LIGHT_LEVEL, 0));
			}
		}
	}
	
	public int getLightLevel()
	{
		return getBlockState().getValue(LIGHT_LEVEL);
	}
	
	private boolean isActiveBeeNocturnal()
	{
		IIndividualHandlerItem handler = IIndividualHandlerItem.get(getBeeInventory().getQueen());
		
		if(handler != null && handler.getStage() == BeeLifeStage.QUEEN)
		{
			IIndividual queen = handler.getIndividual();
			IGenome genome = queen.getGenome();
			
			boolean nocturnal = false;
			
			// If the bee never sleeps, we don't need to simulate sun.
			if(queen instanceof IBee && !genome.getActiveValue(BeeChromosomes.NEVER_SLEEPS))
			{
				IBeeSpecies primaryAllele = genome.getActiveValue(BeeChromosomes.SPECIES);
				nocturnal = primaryAllele.isNocturnal();
			}
			
			return nocturnal;
		}
		return false;
	}
	
	@Override
	public IBeeModifier getBeeModifier()
	{
		return MODIFIER;
	}
}