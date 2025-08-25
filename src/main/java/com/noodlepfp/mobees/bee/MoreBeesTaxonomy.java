package com.noodlepfp.mobees.bee;

import com.noodlepfp.mobees.ff.*;
import com.noodlepfp.mobees.genetics.allele.MoreBeesAlleles;
import forestry.api.genetics.ForestryTaxa;
import forestry.api.genetics.alleles.BeeChromosomes;
import forestry.api.genetics.alleles.ForestryAlleles;
import forestry.api.plugin.IGeneticRegistration;

public class MoreBeesTaxonomy {

    public static void defineTaxa(IGeneticRegistration genetics) {
        FutureForestryBeeTaxonomy.defineTaxa(genetics);
        genetics.defineTaxon(ForestryTaxa.CLASS_INSECTS, ForestryTaxa.ORDER_HYMNOPTERA, order -> {
            order.defineSubTaxon(ForestryTaxa.FAMILY_BEES, family -> {
                // ROCKY LINE
                family.defineSubTaxon(MoreBeesTaxa.GENUS_ROCKY, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONG);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_UP_2);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, MoreBeesAlleles.FLOWER_TYPE_ROCK);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_MINERAL, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONG);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
                    genus.setDefaultChromosome(BeeChromosomes.TOLERATES_RAIN, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, MoreBeesAlleles.FLOWER_TYPE_ROCK);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_METALLIC, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONGER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_PRECIOUSMETALLIC, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONGER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_REDSTONE, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_FAST);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_NORMAL);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTENED);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_UP_1);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_UP_1);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_BUDDING, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                    genus.setDefaultChromosome(BeeChromosomes.EFFECT, MoreBeesAlleles.EFFECT_MELODIC_CHIME);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_CRYSTALLINE, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONGER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_1);
                    genus.setDefaultChromosome(BeeChromosomes.EFFECT, MoreBeesAlleles.EFFECT_MELODIC_CHIME);
                });

                // MARBLE LINE
                family.defineSubTaxon(MoreBeesTaxa.GENUS_MARBLE, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONGER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.TOLERATES_RAIN, ForestryAlleles.FALSE);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, MoreBeesAlleles.FLOWER_TYPE_ROCK);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_CLASSICAL, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genus.setDefaultChromosome(BeeChromosomes.TOLERATES_RAIN, ForestryAlleles.FALSE);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_VANILLA);
                    genus.setDefaultChromosome(BeeChromosomes.TERRITORY, ForestryAlleles.TERRITORY_LARGE);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_DIVINE, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONGER);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOW);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.TOLERATES_RAIN, ForestryAlleles.FALSE);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, MoreBeesAlleles.FLOWER_TYPE_AMETHYST);
                    genus.setDefaultChromosome(BeeChromosomes.TERRITORY, ForestryAlleles.TERRITORY_LARGER);
                });

                // RGBEE LINE
                family.defineSubTaxon(MoreBeesTaxa.GENUS_CHROMATIC, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_AVERAGE);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTENED);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOW);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
                    genus.setDefaultChromosome(BeeChromosomes.TOLERATES_RAIN, ForestryAlleles.FALSE);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_VANILLA);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_UP_1);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_UP_1);
                });

                // EXCITED LINE
                family.defineSubTaxon(MoreBeesTaxa.GENUS_EXCITED, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_FAST);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_FASTER);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTENED);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_UP_1);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_UP_1);
                });

                // EXTRA NETHER LINE
                family.defineSubTaxon(MoreBeesTaxa.GENUS_CRIMSON, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_NORMAL);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTENED);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_NETHER);
                    genus.setDefaultChromosome(BeeChromosomes.EFFECT, ForestryAlleles.EFFECT_AGGRESSIVE);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_DESOLATE, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_NORMAL);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.EFFECT, ForestryAlleles.EFFECT_AGGRESSIVE);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_SCRAP, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONGER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                });

                // SPORE LINE
                family.defineSubTaxon(MoreBeesTaxa.GENUS_SPORE, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_FASTER);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_NORMAL);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_4);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_MUSHROOMS);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_FUNGAL, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_FAST);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOW);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_MUSHROOMS);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_CURSED, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONGEST);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                });

                // BEE LINE
                family.defineSubTaxon(MoreBeesTaxa.GENUS_CAMOUFLAGED, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORTER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.EFFECT, MoreBeesAlleles.EFFECT_VANISHING);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_BEE, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOW);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_NORMAL);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_SHORT);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_VANILLA);
                });

                // UNUSUAL LINE
                family.defineSubTaxon(MoreBeesTaxa.GENUS_UNUSUAL, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOW);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOW);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_NORMAL);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_2);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_MUSHROOMS);
                });

                // ALPINE LINE
                family.defineSubTaxon(MoreBeesTaxa.GENUS_ALPINE, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_NORMAL);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_SNOW);
                    genus.setDefaultChromosome(BeeChromosomes.TERRITORY, ForestryAlleles.TERRITORY_LARGE);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_UP_1);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_SPIRITED, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_AVERAGE);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_FAST);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONG);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_3);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_MUSHROOMS);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_2);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_FORLORN, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_FAST);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_FASTER);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONGER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, ForestryAlleles.FLOWER_TYPE_VANILLA);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_2);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
                });

                // MOB LINE
                family.defineSubTaxon(MoreBeesTaxa.GENUS_MONSTER, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONG);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.TEMPERATURE_TOLERANCE, ForestryAlleles.TOLERANCE_DOWN_2);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_BOTH_1);
                });

                // EXTRA SCULK LINE
                family.defineSubTaxon(MoreBeesTaxa.GENUS_WARDEN, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_FAST);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_FAST);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONG);
                    genus.setDefaultChromosome(BeeChromosomes.TERRITORY, ForestryAlleles.TERRITORY_LARGER);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_4);
                    genus.setDefaultChromosome(BeeChromosomes.EFFECT, MoreBeesAlleles.EFFECT_DARK);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.NEVER_SLEEPS, ForestryAlleles.TRUE);
                });

                // EXTRA AQUATIC LINE
                family.defineSubTaxon(MoreBeesTaxa.GENUS_SHELLED, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWEST);
                    genus.setDefaultChromosome(BeeChromosomes.TERRITORY, ForestryAlleles.TERRITORY_LARGEST);
                    genus.setDefaultChromosome(BeeChromosomes.TOLERATES_RAIN, ForestryAlleles.TRUE);
                    genus.setDefaultChromosome(BeeChromosomes.FLOWER_TYPE, FutureForestryAlleles.FLOWER_TYPE_SEA);
                    genus.setDefaultChromosome(BeeChromosomes.HUMIDITY_TOLERANCE, ForestryAlleles.TOLERANCE_UP_1);
                });

                // PUPIL LINE
                family.defineSubTaxon(MoreBeesTaxa.GENUS_PUPIL, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_SLOWER);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONG);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_2);
                });

                family.defineSubTaxon(MoreBeesTaxa.GENUS_ERUDITE, genus -> {
                    genus.setDefaultChromosome(BeeChromosomes.POLLINATION, ForestryAlleles.POLLINATION_AVERAGE);
                    genus.setDefaultChromosome(BeeChromosomes.SPEED, ForestryAlleles.SPEED_FAST);
                    genus.setDefaultChromosome(BeeChromosomes.LIFESPAN, ForestryAlleles.LIFESPAN_LONG);
                    genus.setDefaultChromosome(BeeChromosomes.FERTILITY, ForestryAlleles.FERTILITY_1);
                    genus.setDefaultChromosome(BeeChromosomes.CAVE_DWELLING, ForestryAlleles.TRUE);
                });
            });
        });
    }
}
