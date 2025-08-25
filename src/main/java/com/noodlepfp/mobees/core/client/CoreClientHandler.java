package com.noodlepfp.mobees.core.client;

import com.noodlepfp.mobees.feature.*;
import com.noodlepfp.mobees.gui.*;
import forestry.api.apiculture.genetics.*;
import forestry.api.client.*;
import forestry.api.client.apiculture.IBeeClientManager;
import forestry.apiculture.features.ApicultureItems;
import forestry.core.models.ClientManager;
import forestry.core.utils.SpeciesUtil;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.ChunkRenderTypeSet;
import net.minecraftforge.client.event.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.Map;

public class CoreClientHandler implements IClientModuleHandler {

	@Override
	public void registerEvents(IEventBus modBus) {
		modBus.addListener(CoreClientHandler::onClientSetup);
		modBus.addListener(CoreClientHandler::additionalBakedModels);
		modBus.addListener(CoreClientHandler::registerItemColors);
		modBus.addListener(CoreClientHandler::registerBlockColors);
	}

	private static void onClientSetup(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MoreBeesApicultureBlocks.BEE_COMB.getBlocks().forEach((block) -> ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout()));

			MenuScreens.register(MoreBeesApicultureMenuTypes.ALVEARY_MUTATOR.menuType(), GuiAlvearyMutator::new);
			MenuScreens.register(MoreBeesApicultureMenuTypes.ALVEARY_FRAME_HOUSING.menuType(), GuiAlvearyFrameHousing::new);
		});
	}

	private static void additionalBakedModels(ModelEvent.RegisterAdditional event) {
		IBeeClientManager beeManager = IForestryClientApi.INSTANCE.getBeeManager();

		for (BeeLifeStage stage : BeeLifeStage.values()) {
			Map<IBeeSpecies, ResourceLocation> models = beeManager.getBeeModels(stage);

			for (IBeeSpecies species : SpeciesUtil.getAllBeeSpecies()) {
				event.register(models.get(species));
			}
		}
	}

	private static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
		// Apiculture
		event.register(ClientManager.FORESTRY_BLOCK_COLOR, MoreBeesApicultureBlocks.BEE_COMB.blockArray());
	}

	private static void registerItemColors(RegisterColorHandlersEvent.Item event) {
		// Apiculture
		event.register(ClientManager.FORESTRY_ITEM_COLOR,
				ApicultureItems.BEE_QUEEN.item(),
				ApicultureItems.BEE_DRONE.item(),
				ApicultureItems.BEE_PRINCESS.item(),
				ApicultureItems.BEE_LARVAE.item()
		);

		event.register(ClientManager.FORESTRY_ITEM_COLOR, MoreBeesApicultureBlocks.BEE_COMB.blockArray());
		event.register(ClientManager.FORESTRY_ITEM_COLOR, MoreBeesCrateItems.CRATED_BEE_COMBS.itemArray());
		event.register(ClientManager.FORESTRY_ITEM_COLOR, MoreBeesApicultureItems.BEE_COMBS.itemArray());
		event.register(ClientManager.FORESTRY_ITEM_COLOR, MoreBeesApicultureItems.PROPOLIS.itemArray());
	}
}