package com.noodlepfp.mobees.hive;

import com.noodlepfp.mobees.bee.MoreBeesSpecies;
import com.noodlepfp.mobees.core.data.tag.MoreBeesTags;
import com.noodlepfp.mobees.feature.MoreBeesApicultureBlocks;
import com.noodlepfp.mobees.ff.FutureForestryBeeSpecies;
import forestry.api.apiculture.genetics.IBeeSpecies;
import forestry.api.apiculture.hives.*;
import forestry.api.core.*;
import forestry.api.genetics.ClimateHelper;
import forestry.api.genetics.alleles.BeeChromosomes;
import forestry.core.utils.SpeciesUtil;
import net.minecraft.core.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.*;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.*;
import net.minecraftforge.common.Tags;

public enum MoreHiveDefinition implements IHiveDefinition {
    LUSH(MoreBeesApicultureBlocks.BEEHIVE.get(MoreBeesBlockHiveType.LUSH).defaultState(), 6.0F, FutureForestryBeeSpecies.LUSH, new HiveGenCaveCeiling(MoreBeesTags.Blocks.LUSH_BEE_CEILING, MoreBeesTags.Blocks.CAVE_EXTRA_REPLACEABLES)) {
        @Override
        public boolean isGoodBiome(Holder<Biome> biome) {
            return super.isGoodBiome(biome) && biome.is(Tags.Biomes.IS_CAVE);
        }
        
        @Override
        public void postGen(WorldGenLevel level, RandomSource rand, BlockPos pos) {
            if (level.getBlockState(pos.below()).is(Blocks.CAVE_VINES)) {
                level.setBlock(pos.below(), Blocks.CAVE_VINES.defaultBlockState().setValue(BlockStateProperties.BERRIES, rand.nextFloat() < 0.11F), Block.UPDATE_CLIENTS);
            }
        }
        
        @Override
        public boolean isGoodHumidity(HumidityType humidity) {
            return true;
        }
        
        @Override
        public boolean isGoodTemperature(TemperatureType temperature) {
            return true;
        }
    },
    AQUATIC(MoreBeesApicultureBlocks.BEEHIVE.get(MoreBeesBlockHiveType.AQUATIC).defaultState(), 1.0F, FutureForestryBeeSpecies.AQUATIC, new HiveGenOcean(BlockTags.SAND)) {
        @Override
        public boolean isGoodBiome(Holder<Biome> biome) {
            return biome.is(Biomes.WARM_OCEAN);
        }
        
        static final Block[] CORAL_FANS = new Block[]{Blocks.FIRE_CORAL_WALL_FAN, Blocks.BRAIN_CORAL_WALL_FAN, Blocks.BUBBLE_CORAL_WALL_FAN, Blocks.HORN_CORAL_WALL_FAN, Blocks.TUBE_CORAL_WALL_FAN};
        static final Block[] CORAL_PLANTS = new Block[]{Blocks.FIRE_CORAL_FAN, Blocks.BRAIN_CORAL_FAN, Blocks.BUBBLE_CORAL_FAN, Blocks.HORN_CORAL_FAN, Blocks.TUBE_CORAL_FAN};
        
        @Override
        public void postGen(WorldGenLevel level, RandomSource rand, BlockPos pos) {
            for (Direction direction : Direction.values()) {
                BlockPos pos2 = pos.relative(direction);
                if (direction.getAxis().isHorizontal() && level.getBlockState(pos2).getBlock() == Blocks.WATER) {
                    level.setBlock(pos2, CORAL_FANS[rand.nextInt(5)].defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, direction), Block.UPDATE_CLIENTS);
                }
                if (level.getBlockState(pos.above()).getBlock() == Blocks.WATER) {
                    level.setBlock(pos.above(), CORAL_PLANTS[rand.nextInt(5)].defaultBlockState(), Block.UPDATE_CLIENTS);
                }
            }
        }
        
        @Override
        public boolean isGoodHumidity(HumidityType humidity) {
            return true;
        }
        
        @Override
        public boolean isGoodTemperature(TemperatureType temperature) {
            return true;
        }
    },
    NETHER(MoreBeesApicultureBlocks.BEEHIVE.get(MoreBeesBlockHiveType.NETHER).defaultState(), 4.0F, FutureForestryBeeSpecies.EMBITTERED, new HiveGenCaveCeiling(BlockTags.WART_BLOCKS, MoreBeesTags.Blocks.NETHER_EXTRA_REPLACEABLES)) {
        @Override
        public boolean isGoodBiome(Holder<Biome> biome) {
            return biome.is(BiomeTags.IS_NETHER);
        }
        
        @Override
        public boolean isGoodHumidity(HumidityType humidity) {
            return true;
        }
        
        @Override
        public boolean isGoodTemperature(TemperatureType temperature) {
            return true;
        }
    },
    ROCKY(MoreBeesApicultureBlocks.BEEHIVE.get(MoreBeesBlockHiveType.ROCKY).defaultState(), 4.0F, MoreBeesSpecies.ROCKY, new MoreHiveGenCaveWall(MoreBeesTags.Blocks.ROCKY_BEE_WALL, MoreBeesTags.Blocks.ROCKY_CAVE_REPLACEABLE)) {
        @Override
        public boolean isGoodBiome(Holder<Biome> biome) {
            return true;
        }

        @Override
        public boolean isGoodHumidity(HumidityType humidity) {
            return true;
        }

        @Override
        public boolean isGoodTemperature(TemperatureType temperature) {
            return true;
        }
    },
    ALPINE(MoreBeesApicultureBlocks.BEEHIVE.get(MoreBeesBlockHiveType.ALPINE).defaultState(), 3.0F, MoreBeesSpecies.ALPINE, new MoreHiveGenMountain(MoreBeesTags.Blocks.ALPINE_HIVE_GROUNDS)) {
        @Override
        public boolean isGoodBiome(Holder<Biome> biome) {
            return biome.is(BiomeTags.IS_MOUNTAIN);
        }

        @Override
        public boolean isGoodHumidity(HumidityType humidity) {
            return true;
        }

        @Override
        public boolean isGoodTemperature(TemperatureType temperature) {
            return true;
        }
    };

    private final BlockState blockState;
    private final float genChance;
    private final ResourceLocation speciesId;
    private final IHiveGen hiveGen;

    MoreHiveDefinition(BlockState hiveState, float genChance, ResourceLocation beeTemplate, IHiveGen hiveGen) {
        this.blockState = hiveState;
        this.genChance = genChance;
        this.speciesId = beeTemplate;
        this.hiveGen = hiveGen;
    }

    @Override
    public IHiveGen getHiveGen() {
        return hiveGen;
    }

    @Override
    public BlockState getBlockState() {
        return blockState;
    }

    @Override
    public boolean isGoodBiome(Holder<Biome> biome) {
        return !biome.is(BiomeTags.IS_NETHER);
    }

    @Override
    public boolean isGoodHumidity(HumidityType humidity) {
        IBeeSpecies species = SpeciesUtil.getBeeSpecies(this.speciesId);
        HumidityType idealHumidity = species.getHumidity();
        ToleranceType humidityTolerance = species.getDefaultGenome().getActiveValue(BeeChromosomes.HUMIDITY_TOLERANCE);
        return ClimateHelper.isWithinLimits(humidity, idealHumidity, humidityTolerance);
    }

    @Override
    public boolean isGoodTemperature(TemperatureType temperature) {
        IBeeSpecies species = SpeciesUtil.getBeeSpecies(this.speciesId);
        TemperatureType idealTemperature = species.getTemperature();
        ToleranceType temperatureTolerance = species.getDefaultGenome().getActiveValue(BeeChromosomes.TEMPERATURE_TOLERANCE);
        return ClimateHelper.isWithinLimits(temperature, idealTemperature, temperatureTolerance);
    }

    @Override
    public float getGenChance() {
        return genChance;
    }

    @Override
    public void postGen(WorldGenLevel level, RandomSource rand, BlockPos pos) {
    }
}
