package com.noodlepfp.mobees.ff;

import forestry.api.IForestryApi;
import forestry.api.apiculture.IFlowerType;
import forestry.api.apiculture.genetics.IBeeEffect;
import forestry.api.genetics.alleles.*;

public class FutureForestryAlleles
{
	public static final IAlleleManager REGISTRY = IForestryApi.INSTANCE.getAlleleManager();
	
	public static final IIntegerAllele LIFESPAN_IMMORTAL = REGISTRY.intAllele(Integer.MAX_VALUE);
	
	public static final IRegistryAllele<IFlowerType> FLOWER_TYPE_CAVE = REGISTRY.registryAllele(FutureForestryFlowerTypes.CAVE, BeeChromosomes.FLOWER_TYPE);
	public static final IRegistryAllele<IFlowerType> FLOWER_TYPE_PHOTOSYNTHESIS = REGISTRY.registryAllele(FutureForestryFlowerTypes.PHOTOSYNTHESIS, BeeChromosomes.FLOWER_TYPE);
	public static final IRegistryAllele<IFlowerType> FLOWER_TYPE_ANCIENT = REGISTRY.registryAllele(FutureForestryFlowerTypes.ANCIENT, BeeChromosomes.FLOWER_TYPE);
	public static final IRegistryAllele<IFlowerType> FLOWER_TYPE_SEA = REGISTRY.registryAllele(FutureForestryFlowerTypes.SEA, BeeChromosomes.FLOWER_TYPE);
	public static final IRegistryAllele<IFlowerType> FLOWER_TYPE_CORAL = REGISTRY.registryAllele(FutureForestryFlowerTypes.CORAL, BeeChromosomes.FLOWER_TYPE);
	public static final IRegistryAllele<IFlowerType> FLOWER_TYPE_SCULK = REGISTRY.registryAllele(FutureForestryFlowerTypes.SCULK, BeeChromosomes.FLOWER_TYPE);
	
	public static final IRegistryAllele<IBeeEffect> EFFECT_GLOW_BERRY_GROW = REGISTRY.registryAllele(FutureForestryBeeEffects.GLOW_BERRY_GROW, BeeChromosomes.EFFECT);
	public static final IRegistryAllele<IBeeEffect> EFFECT_REJUVENATION = REGISTRY.registryAllele(FutureForestryBeeEffects.REJUVENATION, BeeChromosomes.EFFECT);
	public static final IRegistryAllele<IBeeEffect> EFFECT_CHRONOPHAGE = REGISTRY.registryAllele(FutureForestryBeeEffects.CHRONOPHAGE, BeeChromosomes.EFFECT);
	public static final IRegistryAllele<IBeeEffect> EFFECT_GUARDIAN = REGISTRY.registryAllele(FutureForestryBeeEffects.GUARDIAN, BeeChromosomes.EFFECT);
	public static final IRegistryAllele<IBeeEffect> EFFECT_PHASING = REGISTRY.registryAllele(FutureForestryBeeEffects.PHASING, BeeChromosomes.EFFECT);
	public static final IRegistryAllele<IBeeEffect> EFFECT_ASCENSION = REGISTRY.registryAllele(FutureForestryBeeEffects.ASCENSION, BeeChromosomes.EFFECT);
	public static final IRegistryAllele<IBeeEffect> EFFECT_SCULK = REGISTRY.registryAllele(FutureForestryBeeEffects.SCULK, BeeChromosomes.EFFECT);
}