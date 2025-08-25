package com.noodlepfp.mobees.ff;

import forestry.api.genetics.ForestryTaxa;
import forestry.api.genetics.alleles.*;
import forestry.api.plugin.IGeneticRegistration;

public class FutureForestryBeeTaxonomy
{
	public static void defineTaxa(IGeneticRegistration genetics)
	{
		genetics.defineTaxon(ForestryTaxa.CLASS_INSECTS, ForestryTaxa.ORDER_HYMNOPTERA, order -> {
			order.defineSubTaxon(ForestryTaxa.FAMILY_BEES, family -> {
				family.defineSubTaxon(FutureForestryBeeSpecies.GENUS_LUSH, genus -> {
					genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
					genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, FutureForestryAlleles.FLOWER_TYPE_CAVE);
					genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
					genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
				});
				family.defineSubTaxon(FutureForestryBeeSpecies.GENUS_KLEPTOPLASTIC, genus -> {
					genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
					genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWEST);
					genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
					genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
					genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, FutureForestryAlleles.FLOWER_TYPE_PHOTOSYNTHESIS);
					genus.setDefaultChromosome(BeeChromosomes.EFFECT, ForestryAlleles.EFFECT_IGNITION);
				});
				family.defineSubTaxon(FutureForestryBeeSpecies.GENUS_AQUATIC, genus -> {
					genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, FutureForestryAlleles.FLOWER_TYPE_SEA);
					genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWEST);
					genus.setDefaultChromosome(BeeChromosomes.TERRITORY, ForestryAlleles.TERRITORY_LARGEST);
					genus.setDefaultChromosome(BeeChromosomes.TOLERATES_RAIN, ForestryAlleles.TRUE);
				});
				family.defineSubTaxon(FutureForestryBeeSpecies.GENUS_EMBITTERED, genus -> {
					genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTENED);
					genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWEST);
					genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_NETHER);
					genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_4);
					genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
					genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
				});
				family.defineSubTaxon(FutureForestryBeeSpecies.GENUS_ABOMINATION);
				family.defineSubTaxon(ForestryTaxa.GENUS_AGRARIAN, genus -> {
					genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWER);
					genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTER);
					genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_WHEAT);
					genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_FASTER);
				});
				family.defineSubTaxon(FutureForestryBeeSpecies.GENUS_RELIC, genus -> {
					genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, FutureForestryAlleles.FLOWER_TYPE_ANCIENT);
					genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
				});
				family.defineSubTaxon(FutureForestryBeeSpecies.GENUS_VANILLA, genus -> {
					genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_VANILLA);
					genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_UP_1);
					genus.setDefaultChromosome(BeeChromosomes.EFFECT, ForestryAlleles.EFFECT_MIASMIC);
					genus.setDefaultChromosome(BeeChromosomes.TERRITORY, ForestryAlleles.TERRITORY_LARGE);
				});
			});
		});
	}
}