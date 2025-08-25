package com.noodlepfp.mobees.ff;

import com.noodlepfp.mobees.core.data.tag.MoreBeesTags;
import com.noodlepfp.mobees.feature.MoreBeesApicultureItems;
import com.noodlepfp.mobees.item.*;
import forestry.api.apiculture.ForestryBeeSpecies;
import forestry.api.core.*;
import forestry.api.genetics.alleles.*;
import forestry.api.plugin.IApicultureRegistration;
import forestry.apiculture.features.ApicultureItems;
import forestry.apiculture.items.*;
import forestry.core.features.CoreItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.awt.*;

import static com.noodlepfp.mobees.MoBeesModule.mobees;
import static forestry.api.genetics.ForestryTaxa.GENUS_END;
import static forestry.apiculture.features.ApicultureItems.*;

public class FutureForestryBeeSpecies
{
	public static final ResourceLocation LUSH = mobees("bee_lush");
	public static final ResourceLocation VERDANT = mobees("bee_verdant");
	public static final ResourceLocation LUXURIANT = mobees("bee_luxuriant");
	public static final ResourceLocation KLEPTOPLASTIC = mobees("bee_kleptoplastic");
	public static final ResourceLocation PHOTOSYNTHETIC = mobees("bee_photosynthetic");
	public static final ResourceLocation AUTOTROPHIC = mobees("bee_autotrophic");
	public static final ResourceLocation PRIMEVAL = mobees("bee_primeval");
	public static final ResourceLocation ANACHRONE = mobees("bee_anachrone");
	public static final ResourceLocation RELIC = mobees("bee_relic");
	public static final ResourceLocation AQUATIC = mobees("bee_aquatic");
	public static final ResourceLocation PIRATE = mobees("bee_pirate");
	public static final ResourceLocation PRISMATIC = mobees("bee_prismatic");
	public static final ResourceLocation ABYSSAL = mobees("bee_abyssal");
	public static final ResourceLocation SHULKING = mobees("bee_shulking");
	public static final ResourceLocation EMBITTERED = mobees("bee_embittered");
	public static final ResourceLocation SPITEFUL = mobees("bee_spiteful");
	public static final ResourceLocation SEETHING = mobees("bee_seething");
	public static final ResourceLocation WARPED = mobees("bee_warped");
	public static final ResourceLocation ZOMBIFIED = mobees("bee_zombified");
	public static final ResourceLocation SCULK = mobees("bee_sculk");
	
	public static final String SPECIES_LUSH = "atvatabari";
	public static final String SPECIES_VERDANT = "lidenbrocki";
	public static final String SPECIES_LUXURIANT = "verni";
	public static final String SPECIES_KLEPTOPLASTIC = "vitaraptor";
	public static final String SPECIES_PHOTOSYNTHETIC = "phytomimus";
	public static final String SPECIES_AUTOTROPHIC = "solaris";
	public static final String SPECIES_PRIMEVAL = "antiqua";
	public static final String SPECIES_ANACHRONE = "tempuraptor";
	public static final String SPECIES_RELIC = "elizabethii";
	public static final String SPECIES_AQUATIC = "squarepantsii";//a real species name
	public static final String SPECIES_PIRATE = "pirata";
	public static final String SPECIES_PRISMATIC = "orichalcus";
	public static final String SPECIES_ABYSSAL = "stygii";
	public static final String SPECIES_EMBITTERED = "irata";
	public static final String SPECIES_SPITEFUL = "invida";
	public static final String SPECIES_SEETHING = "sulphuri";
	public static final String SPECIES_WARPED = "corrumpata";
	public static final String SPECIES_SHULKING = "shurukui";
	public static final String SPECIES_ZOMBIFIED = "inmortui";
	public static final String SPECIES_SCULK = "alieni";
	public static final String SPECIES_VANILLA = "dinnerbonei";
	
	public static final String GENUS_LUSH = "troglobites";
	public static final String GENUS_KLEPTOPLASTIC = "phytapis";
	public static final String GENUS_RELIC = "reliquia";
	public static final String GENUS_AQUATIC = "spongiforma";
	public static final String GENUS_EMBITTERED = "irata";
	public static final String GENUS_ABOMINATION = "abominatio";
	public static final String GENUS_VANILLA = "bombus";
	
	public static void defineNewBees(IApicultureRegistration apiculture)
	{
		// Lush
		apiculture.registerSpecies(LUSH, GENUS_LUSH, SPECIES_LUSH, true, new Color(0x70922D))
				  .setTemperature(TemperatureType.WARM)
				  .setHumidity(HumidityType.DAMP)
				  .addProduct(BEE_COMBS.stack(EnumHoneyComb.HONEY), 0.35F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_NORMAL);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWEST);
					  genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
				  })
				  .setAuthority("EnderiumSmith");
		
		// Verdant
		apiculture.registerSpecies(VERDANT, GENUS_LUSH, SPECIES_VERDANT, true, new Color(0x1C5B3A))
				  .setTemperature(TemperatureType.WARM)
				  .setHumidity(HumidityType.DAMP)
				  .addProduct(BEE_COMBS.stack(EnumHoneyComb.HONEY), 0.45F)
				  .addSpecialty(new ItemStack(Items.SMALL_DRIPLEAF), 0.15F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONG);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOW);
					  genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
				  })
				  .addMutations(mutations ->
				  {
					  mutations.add(LUSH, ForestryBeeSpecies.VALIANT, 10).addMutationCondition(new CaveMutationCondition());
				  })
				  .setAuthority("EnderiumSmith");
		
		// LUXURIANT
		apiculture.registerSpecies(LUXURIANT, GENUS_LUSH, SPECIES_LUXURIANT, false, new Color(0xEB8931))
				  .setTemperature(TemperatureType.WARM)
				  .setHumidity(HumidityType.DAMP)
				  .addProduct(BEE_COMBS.stack(EnumHoneyComb.HONEY), 0.55F)
				  .addProduct(CoreItems.PHOSPHOR.stack(), 0.40f)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONG);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWEST);
					  genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_FAST);
					  genome.set(BeeChromosomes.EFFECT, FutureForestryAlleles.EFFECT_GLOW_BERRY_GROW);
				  })
				  .addMutations(mutations ->
				  {
					  mutations.add(LUSH, VERDANT, 8).addMutationCondition(new CaveMutationCondition());
				  })
				  .setAuthority("EnderiumSmith")
				  .setGlint(true);
		
		// KLEPTOPLASTIC
		apiculture.registerSpecies(KLEPTOPLASTIC, GENUS_KLEPTOPLASTIC, SPECIES_KLEPTOPLASTIC, false, new Color(0xffc987))
				  .setBody(new Color(0x64E986))
				  .addProduct(BEE_COMBS.stack(EnumHoneyComb.HONEY), 0.30F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONGER);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_NORMAL);
				  })
				  .addMutations(mutations ->
				  {
					  mutations.add(LUXURIANT, ForestryBeeSpecies.MONASTIC, 12);
				  })
				  .setAuthority("EnderiumSmith");
		
		// PHOTOSYNTHETIC
		apiculture.registerSpecies(PHOTOSYNTHETIC, GENUS_KLEPTOPLASTIC, SPECIES_PHOTOSYNTHETIC, true, new Color(0xB6C9FF))
				  .setBody(new Color(0x64E986))
				  .addProduct(BEE_COMBS.stack(EnumHoneyComb.HONEY), 0.40F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONGER);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_FAST);
				  })
				  .addMutations(mutations ->
				  {
					  mutations.add(KLEPTOPLASTIC, LUXURIANT, 8);
					  mutations.add(KLEPTOPLASTIC, ForestryBeeSpecies.MONASTIC, 8);
				  })
				  .setAuthority("EnderiumSmith");
		
		// AUTOTROPHIC
		apiculture.registerSpecies(AUTOTROPHIC, GENUS_KLEPTOPLASTIC, SPECIES_AUTOTROPHIC, false, new Color(0xFFF5EC))
				  .setBody(new Color(0x64E986))
				  .addProduct(BEE_COMBS.stack(EnumHoneyComb.HONEY), 0.30F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONGEST);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_FASTER);
				  })
				  .addMutations(mutations ->
				  {
					  mutations.add(KLEPTOPLASTIC, PHOTOSYNTHETIC, 4);
				  })
				  .setGlint(true)
				  .setAuthority("EnderiumSmith");
		
		// AQUATIC
		apiculture.registerSpecies(AQUATIC, GENUS_AQUATIC, SPECIES_AQUATIC, true, new Color(0x3F76E4))
				  .setTemperature(TemperatureType.WARM)
				  .addProduct(MoreBeesApicultureItems.BEE_COMBS.stack(MoreBeesEnumHoneyComb.SPONGE), 0.30F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTEST);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOW);
					  genome.set(BeeChromosomes.FLOWER_TYPE, FutureForestryAlleles.FLOWER_TYPE_CORAL);
					  genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_4);
					  genome.set(BeeChromosomes.EFFECT, ForestryAlleles.EFFECT_MIASMIC);
				  })
				  .setAuthority("EnderiumSmith");
		
		// PIRATE
		apiculture.registerSpecies(PIRATE, GENUS_AQUATIC, SPECIES_PIRATE, true, new Color(0x3F605B))
				  .addProduct(MoreBeesApicultureItems.BEE_COMBS.stack(MoreBeesEnumHoneyComb.SPONGE), 0.20F)
				  .addSpecialty(new ItemStack(Items.GOLD_NUGGET), 0.15F)
				  .addSpecialty(new ItemStack(Items.LAPIS_LAZULI), 0.02F)
				  .addSpecialty(new ItemStack(Items.EMERALD), 0.005F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTER);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWER);
					  genome.set(BeeChromosomes.FLOWER_TYPE, FutureForestryAlleles.FLOWER_TYPE_SEA);
					  genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
					  genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
				  })
				  .setAuthority("EnderiumSmith");
		
		// PRISMATIC
		apiculture.registerSpecies(PRISMATIC, GENUS_AQUATIC, SPECIES_PRISMATIC, false, new Color(0x539882))
				  .setTemperature(TemperatureType.WARM)
				  .addProduct(MoreBeesApicultureItems.BEE_COMBS.stack(MoreBeesEnumHoneyComb.SPONGE), 0.20F)
				  .addSpecialty(new ItemStack(Items.PRISMARINE_SHARD), 0.40F)
				  .addSpecialty(new ItemStack(Items.PRISMARINE_CRYSTALS), 0.05F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORT);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWER);
					  genome.set(BeeChromosomes.FLOWER_TYPE, FutureForestryAlleles.FLOWER_TYPE_CORAL);
					  genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
					  genome.set(BeeChromosomes.EFFECT, FutureForestryAlleles.EFFECT_GUARDIAN);
					  genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
				  })
				  .addMutations(mutations ->
				  {
					  mutations.add(AQUATIC, PIRATE, 8);
				  })
				  .setGlint(true)
				  .setAuthority("EnderiumSmith");
		
		// ABYSSAL
		apiculture.registerSpecies(ABYSSAL, GENUS_AQUATIC, SPECIES_ABYSSAL, false, new Color(0x050533))
				  .setTemperature(TemperatureType.COLD)
				  .addProduct(MoreBeesApicultureItems.BEE_COMBS.stack(MoreBeesEnumHoneyComb.SPONGE), 0.20F)
				  .addSpecialty(new ItemStack(Items.GLOW_INK_SAC), 0.15F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONGER);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWEST);
					  genome.set(BeeChromosomes.FLOWER_TYPE, FutureForestryAlleles.FLOWER_TYPE_SEA);
					  genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
					  genome.set(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
					  genome.set(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
				  })
				  .addMutations(mutations ->
				  {
					  mutations.add(PIRATE, ForestryBeeSpecies.ENDED, 40).addMutationCondition(new CaveMutationCondition());
					  mutations.add(AQUATIC, ForestryBeeSpecies.ENDED, 40).addMutationCondition(new CaveMutationCondition());
					  mutations.add(PIRATE, SHULKING, 60).addMutationCondition(new CaveMutationCondition());
					  mutations.add(AQUATIC, SHULKING, 60).addMutationCondition(new CaveMutationCondition());
				  })
				  .setGlint(true)
				  .setAuthority("EnderiumSmith");
		
		// EMBITTERED
		apiculture.registerSpecies(EMBITTERED, GENUS_EMBITTERED, SPECIES_EMBITTERED, true, new Color(0x894344))
				  .setBody(new Color(0x9a2323))
				  .setTemperature(TemperatureType.HELLISH)
				  .setHumidity(HumidityType.ARID)
				  .addProduct(BEE_COMBS.stack(EnumHoneyComb.SIMMERING), 0.45F)
				  .addProduct(MoreBeesApicultureItems.PROPOLIS.stack(MoreBeesEnumPropolis.VOLCANIC), 0.15F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_NORMAL);
					  genome.set(BeeChromosomes.EFFECT, ForestryAlleles.EFFECT_AGGRESSIVE);
				  })
				  .setAuthority("EnderiumSmith");
		
		// SPITEFUL
		apiculture.registerSpecies(SPITEFUL, GENUS_EMBITTERED, SPECIES_SPITEFUL, false, new Color(0xFEAC6D))
				  .setBody(new Color(0x9a2323))
				  .setTemperature(TemperatureType.HELLISH)
				  .setHumidity(HumidityType.ARID)
				  .addProduct(BEE_COMBS.stack(EnumHoneyComb.SIMMERING), 0.55F)
				  .addSpecialty(POLLEN_CLUSTER.stack(EnumPollenCluster.NORMAL), 0.05F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_FAST);
					  genome.set(BeeChromosomes.EFFECT, ForestryAlleles.EFFECT_AGGRESSIVE);
				  })
				  .addMutations(mutations ->
				  {
					  mutations.add(EMBITTERED, ForestryBeeSpecies.FIENDISH, 12);
				  })
				  .setAuthority("EnderiumSmith");
		
		// SEETHING
		apiculture.registerSpecies(SEETHING, GENUS_EMBITTERED, SPECIES_SEETHING, false, new Color(0xff8f00))
				  .setBody(new Color(0x9a2323))
				  .setTemperature(TemperatureType.HELLISH)
				  .setHumidity(HumidityType.ARID)
				  .addProduct(BEE_COMBS.stack(EnumHoneyComb.SIMMERING), 0.45F)
				  .addProduct(new ItemStack(Items.BLAZE_POWDER), 0.15F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_NORMAL);
					  genome.set(BeeChromosomes.EFFECT, ForestryAlleles.EFFECT_IGNITION);
				  })
				  .addMutations(mutations ->
				  {
					  mutations.add(SPITEFUL, EMBITTERED, 8);
				  })
				  .setGlint(true)
				  .setAuthority("EnderiumSmith");
		
		// WARPED
		apiculture.registerSpecies(WARPED, GENUS_EMBITTERED, SPECIES_WARPED, true, new Color(0x14B485))
				  .setBody(new Color(0x9a2323))
				  .setTemperature(TemperatureType.HELLISH)
				  .setHumidity(HumidityType.ARID)
				  .addProduct(BEE_COMBS.stack(EnumHoneyComb.SIMMERING), 0.15F)
				  .addSpecialty(BEE_COMBS.stack(EnumHoneyComb.MYSTERIOUS), 0.35F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOW);
					  genome.set(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_ELONGATED);
					  genome.set(BeeChromosomes.EFFECT, FutureForestryAlleles.EFFECT_PHASING);
				  })
				  .addMutations(mutations ->
				  {
					  mutations.add(EMBITTERED, ForestryBeeSpecies.ENDED, 40).restrictBiomeType(MoreBeesTags.Biomes.WARPED_FOREST);
					  mutations.add(SPITEFUL, ForestryBeeSpecies.ENDED, 40).restrictBiomeType(MoreBeesTags.Biomes.WARPED_FOREST);
					  mutations.add(EMBITTERED, SHULKING, 40).restrictBiomeType(MoreBeesTags.Biomes.WARPED_FOREST);
					  mutations.add(SPITEFUL, SHULKING, 40).restrictBiomeType(MoreBeesTags.Biomes.WARPED_FOREST);
				  })
				  .setAuthority("EnderiumSmith");
		
		// ZOMBIFIED
		apiculture.registerSpecies(ZOMBIFIED, GENUS_ABOMINATION, SPECIES_ZOMBIFIED, true, new Color(0x698E45))
				  .setBody(new Color(0xE4686A))
				  .setTemperature(TemperatureType.HELLISH)
				  .setHumidity(HumidityType.ARID)
				  .addProduct(BEE_COMBS.stack(EnumHoneyComb.SIMMERING), 0.20F)
				  .addProduct(new ItemStack(Items.GOLD_NUGGET), 0.15F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.LIFESPAN, FutureForestryAlleles.LIFESPAN_IMMORTAL);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_NORMAL);
					  genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWEST);
					  genome.set(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_NETHER);
					  genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
					  genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_3);
					  genome.set(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_UP_1);
					  genome.set(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
					  genome.set(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
				  })
				  .setAuthority("EnderiumSmith");
		
		// SCULK
		apiculture.registerSpecies(SCULK, GENUS_ABOMINATION, SPECIES_SCULK, true, new Color(0xD1D6B6))
				  .setBody(new Color(0x05625D))//0x034150//0x111B21
				  .addProduct(MoreBeesApicultureItems.BEE_COMBS.stack(MoreBeesEnumHoneyComb.SCULKEN), 0.30F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONGER);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_NORMAL);
					  genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWEST);
					  genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
					  genome.set(BeeChromosomes.FLOWER_TYPE, FutureForestryAlleles.FLOWER_TYPE_SCULK);
					  genome.set(BeeChromosomes.EFFECT, FutureForestryAlleles.EFFECT_SCULK);
					  genome.set(BeeChromosomes.TERRITORY, ForestryAlleles.TERRITORY_LARGER);
					  genome.set(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
					  genome.set(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
					  genome.set(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
					  genome.set(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
				  })
				  .addMutations(mutations ->
				  {
					  mutations.add(ABYSSAL, ForestryBeeSpecies.PHANTASMAL, 4).restrictBiomeType(MoreBeesTags.Biomes.DEEP_DARK);
				  })
				  .setGlint(true)
				  .setAuthority("EnderiumSmith");
		
		// SHULKING
		apiculture.registerSpecies(SHULKING, GENUS_END, SPECIES_SHULKING, false, new Color(0x896D74))
				  .setBody(new Color(0xd9de9e))
				  .setTemperature(TemperatureType.COLD)
				  .setHumidity(HumidityType.ARID)
				  .addProduct(BEE_COMBS.stack(EnumHoneyComb.MYSTERIOUS), 0.20f)
				  .addSpecialty(new ItemStack(Items.SHULKER_SHELL), 0.015F)
				  .setGenome(genome ->
				  {
					  genome.set(BeeChromosomes.EFFECT, FutureForestryAlleles.EFFECT_ASCENSION);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOW);
				  })
				  .setAuthority("EnderiumSmith");
		
		// PRIMEVAL
		apiculture.registerSpecies(PRIMEVAL, GENUS_RELIC, SPECIES_PRIMEVAL, true, new Color(0x653F33))
				  .setTemperature(TemperatureType.WARM)
				  .addProduct(MoreBeesApicultureItems.BEE_COMBS.stack(MoreBeesEnumHoneyComb.VINTAGE), 0.30F)
				  .setGenome(genome -> {
					  genome.set(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONG);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOW);
					  genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_AVERAGE);
					  genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
				  })
				  .addMutations(mutations -> {
					  mutations.add(ANACHRONE, ForestryBeeSpecies.STEADFAST, 15);
				  })
				  .setAuthority("EnderiumSmith");
		
		// ANACHRONE
		apiculture.registerSpecies(ANACHRONE, GENUS_RELIC, SPECIES_ANACHRONE, false, new Color(5636095))
				  .setTemperature(TemperatureType.WARM)
				  .addProduct(MoreBeesApicultureItems.BEE_COMBS.stack(MoreBeesEnumHoneyComb.VINTAGE), 0.20F)
				  .setGenome(genome -> {
					  genome.set(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONGEST);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWEST);
					  genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWEST);
					  genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
					  genome.set(BeeChromosomes.EFFECT, FutureForestryAlleles.EFFECT_CHRONOPHAGE);
				  })
				  .addMutations(mutations -> {
					  mutations.add(RELIC, ForestryBeeSpecies.STEADFAST, 10);
				  })
				  .setGlint(true)
				  .setAuthority("EnderiumSmith");
		
		// RELIC
		apiculture.registerSpecies(RELIC, GENUS_RELIC, SPECIES_RELIC, false, new Color(16733695))
				  .setTemperature(TemperatureType.WARM)
				  .addProduct(MoreBeesApicultureItems.BEE_COMBS.stack(MoreBeesEnumHoneyComb.VINTAGE), 0.20F)
				  .addSpecialty(ApicultureItems.ROYAL_JELLY.stack(), 0.15F)
				  .setGenome(genome -> {
					  genome.set(BeeChromosomes.LIFESPAN, FutureForestryAlleles.LIFESPAN_IMMORTAL);
					  genome.set(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWEST);
					  genome.set(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWEST);
					  genome.set(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
					  genome.set(BeeChromosomes.EFFECT, FutureForestryAlleles.EFFECT_REJUVENATION);
				  })
				  .setGlint(true)
				  .setAuthority("EnderiumSmith");
	}
}