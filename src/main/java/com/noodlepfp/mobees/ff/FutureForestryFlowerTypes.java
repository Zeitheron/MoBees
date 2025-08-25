package com.noodlepfp.mobees.ff;

import com.noodlepfp.mobees.core.data.tag.MoreBeesTags;
import com.noodlepfp.mobees.ff.flowers.*;
import forestry.api.plugin.IApicultureRegistration;
import forestry.apiculture.FlowerType;
import net.minecraft.resources.ResourceLocation;

import static com.noodlepfp.mobees.MoBeesModule.mobees;

public class FutureForestryFlowerTypes
{
	public static final ResourceLocation CAVE = mobees("flower_type_cave");
	public static final ResourceLocation PHOTOSYNTHESIS = mobees("flower_type_photosynthesis");
	public static final ResourceLocation ANCIENT = mobees("flower_type_ancient");
	public static final ResourceLocation SEA = mobees("flower_type_sea");
	public static final ResourceLocation CORAL = mobees("flower_type_coral");
	public static final ResourceLocation SCULK = mobees("flower_type_sculk");
	
	public static void register(IApicultureRegistration apiculture)
	{
		apiculture.registerFlowerType(CAVE, new FlowerType(MoreBeesTags.Blocks.CAVE_FLOWERS, true));
		apiculture.registerFlowerType(PHOTOSYNTHESIS, new PhotosynthesisFlowerType());
		apiculture.registerFlowerType(ANCIENT, new FlowerType(MoreBeesTags.Blocks.ANCIENT_FLOWERS, true));
		apiculture.registerFlowerType(SEA, new WaterFlowerType(MoreBeesTags.Blocks.SEA_FLOWERS, false));
		apiculture.registerFlowerType(CORAL, new WaterFlowerType(MoreBeesTags.Blocks.CORAL_FLOWERS, false));
		apiculture.registerFlowerType(SCULK, new FlowerType(MoreBeesTags.Blocks.SCULK_FLOWERS, false));
	}
}