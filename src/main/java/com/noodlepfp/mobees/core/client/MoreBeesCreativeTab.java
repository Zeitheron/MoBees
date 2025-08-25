package com.noodlepfp.mobees.core.client;

import com.mojang.logging.LogUtils;
import com.noodlepfp.mobees.MoBeesEnumModCompat;
import com.noodlepfp.mobees.bee.MoreBeesSpecies;
import com.noodlepfp.mobees.feature.*;
import com.noodlepfp.mobees.hive.MoreBeesBlockHiveType;
import com.noodlepfp.mobees.item.*;
import forestry.api.apiculture.genetics.*;
import forestry.api.genetics.ILifeStage;
import forestry.core.utils.SpeciesUtil;
import forestry.modules.features.*;
import forestry.storage.items.ItemCrated;
import net.minecraft.core.NonNullList;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.commons.lang3.EnumUtils;
import org.slf4j.Logger;

@FeatureProvider
public class MoreBeesCreativeTab
{
	private static final Logger LOGGER = LogUtils.getLogger();
	
	public static final CreativeModeTab MOBEES = new CreativeModeTab("mobees")
	{
		@Override
		public ItemStack makeIcon()
		{
			return SpeciesUtil.BEE_TYPE.get().createStack(MoreBeesSpecies.CRYSTALLINE, BeeLifeStage.QUEEN);
		}
		
		@Override
		public void fillItemList(NonNullList<ItemStack> pItems)
		{
			addApicultureItems(pItems::add);
			super.fillItemList(pItems);
		}
	};
	
	private static void addApicultureItems(CreativeTabOutput items)
	{
		// Hives
		for(MoreBeesBlockHiveType type : MoreBeesBlockHiveType.values())
		{
			if(type.getSpeciesId().toString().contains("mobees"))
			{
				items.accept(MoreBeesApicultureBlocks.BEEHIVE.get(type));
			}
		}
		
		// Alveary
		MoreBeesApicultureBlocks.ALVEARY.getItems().forEach(items::accept);
		
		// Frames
		items.accept(MoreBeesApicultureItems.FRAME_PRESERVATION);
		items.accept(MoreBeesApicultureItems.FRAME_DESTRUCTION);
		items.accept(MoreBeesApicultureItems.FRAME_MUTATION);
		items.accept(MoreBeesApicultureItems.FRAME_FERTILE);
		items.accept(MoreBeesApicultureItems.FRAME_CRIMSON);
		items.accept(MoreBeesApicultureItems.FRAME_KIND);
		
		MoreBeesItems.CRAFTING_MATERIALS.getItems().forEach(items::accept);
		
		for(MoreBeesItemBeeProduce produce : MoreBeesItems.BEE_PRODUCE_MATERIALS.getItems())
		{
			MoBeesEnumModCompat modCompat = EnumUtils.getEnum(MoBeesEnumModCompat.class, produce.getType().name().toUpperCase().replace("_BIT", ""));
			registerModCompatItem(items, new ItemStack(produce), modCompat, false);
		}
		
		// Misc items
		LOGGER.info("Mo' Bees - Checking for Mod Compatible Resources...");
		for(MoreBeesItemHoneyComb comb : MoreBeesApicultureItems.BEE_COMBS.getItems())
		{
			MoBeesEnumModCompat modCompat = EnumUtils.getEnum(MoBeesEnumModCompat.class, comb.getType().name.toUpperCase());
			registerModCompatItem(items, new ItemStack(comb), modCompat, true);
		}
		
		MoreBeesApicultureItems.PROPOLIS.getItems().forEach(items::accept);
		
		// mod compat checks are redundant here since theyre already made when bees are defined
		for(ILifeStage stage : SpeciesUtil.BEE_TYPE.get().getLifeStages())
		{
			for(IBeeSpecies species : SpeciesUtil.getAllBeeSpecies())
			{
				if(species.id().toString().contains("mobees"))
				{
					items.accept(species.createStack(stage));
				}
			}
		}
		
		for(MoreBeesBlockHoneyComb blockHoneyComb : MoreBeesApicultureBlocks.BEE_COMB.getBlocks())
		{
			MoBeesEnumModCompat modCompat = EnumUtils.getEnum(MoBeesEnumModCompat.class, blockHoneyComb.getMoreBeesType().name.toUpperCase());
			registerModCompatItem(items, new ItemStack(blockHoneyComb), modCompat, false);
		}
		
		for(FeatureItem<ItemCrated> crate : MoreBeesCrateItems.getCrates())
		{
			MoBeesEnumModCompat modCompat = EnumUtils.getEnum(MoBeesEnumModCompat.class, crate.getName().toUpperCase().replace("CRATED_BEE_COMB_", ""));
			registerModCompatItem(items, new ItemStack(crate), modCompat, false);
		}
	}
	
	private static void registerModCompatItem(CreativeTabOutput items, ItemStack item, MoBeesEnumModCompat compatEnum, boolean doLog)
	{
		if(compatEnum == null)
		{
			items.accept(item);
			return;
		}
		TagKey<Item> compatTag = compatEnum.getModCompatTag();
		if(ForgeRegistries.ITEMS.tags().isKnownTagName(compatTag))
		{
			if(doLog)
			{
				LOGGER.info(compatTag.location() + " : FOUND");
			}
			items.accept(item);
		} else if(doLog)
		{
			LOGGER.info(compatTag.location() + " : NOT FOUND");
		}
	}
	
	@FunctionalInterface
	private interface CreativeTabOutput
	{
		void accept(ItemStack stack);
		
		default void accept(ItemLike item)
		{
			accept(new ItemStack(item, 1));
		}
	}
}
