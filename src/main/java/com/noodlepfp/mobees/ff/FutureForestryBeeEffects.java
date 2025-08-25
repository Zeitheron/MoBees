package com.noodlepfp.mobees.ff;

import com.noodlepfp.mobees.ff.effects.*;
import forestry.api.plugin.IApicultureRegistration;
import net.minecraft.resources.ResourceLocation;

import static com.noodlepfp.mobees.MoBeesModule.mobees;

public class FutureForestryBeeEffects
{
	public static final ResourceLocation GLOW_BERRY_GROW = mobees("bee_effect_glow_berry_grow");
	public static final ResourceLocation REJUVENATION = mobees("bee_effect_rejuvenation");
	public static final ResourceLocation CHRONOPHAGE = mobees("bee_effect_chronophage");
	public static final ResourceLocation GUARDIAN = mobees("bee_effect_guardian");
	public static final ResourceLocation PHASING = mobees("bee_effect_phasing");
	public static final ResourceLocation ASCENSION = mobees("bee_effect_ascension");
	public static final ResourceLocation SCULK = mobees("bee_effect_sculk");
	
	public static void register(IApicultureRegistration apiculture)
	{
		apiculture.registerBeeEffect(GLOW_BERRY_GROW, new GlowBerryGrowEffect());
		apiculture.registerBeeEffect(REJUVENATION, new AgingBeeEffect(false, false));
		apiculture.registerBeeEffect(CHRONOPHAGE, new AgingBeeEffect(false, true));
		apiculture.registerBeeEffect(GUARDIAN, new GuardianBeeEffect());
		apiculture.registerBeeEffect(PHASING, new PhasingBeeEffect());
		apiculture.registerBeeEffect(ASCENSION, new AscensionBeeEffect());
		apiculture.registerBeeEffect(SCULK, new SculkSpreadBeeEffect());
	}
}