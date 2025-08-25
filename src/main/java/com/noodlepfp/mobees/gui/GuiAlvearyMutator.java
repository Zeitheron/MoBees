package com.noodlepfp.mobees.gui;

import com.mojang.blaze3d.vertex.PoseStack;
import com.noodlepfp.mobees.MoBeesModule;
import com.noodlepfp.mobees.alveary.block.TileAlvearyMutator;
import com.noodlepfp.mobees.gui.widget.*;
import forestry.core.gui.GuiForestryTitled;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public class GuiAlvearyMutator extends GuiForestryTitled<ContainerAlvearyMutator> {
    private final TileAlvearyMutator tile;

    public GuiAlvearyMutator(ContainerAlvearyMutator container, Inventory inventory, Component title) {
        super(MoBeesModule.mobees("textures/gui/alveary_mutator.png"), container, inventory, title);
        this.tile = container.getTile();

        widgetManager.add(new PowerIconWidget(this.widgetManager, 77, 34, tile));
        widgetManager.add(new MutagenStorageWidget(this.widgetManager, 96, 39, tile));
    }
    
    @Override
    protected void drawWidgets(PoseStack transform)
    {
        int reserveProgress = this.tile.getAttributeScaled(this.tile.getMutagenReserve(), TileAlvearyMutator.getMutagenReserveCap(), 23);
        
        bindTexture(this.textureFile);
        blit(transform, 69 + (23 - reserveProgress), 45, 176 + (23 - reserveProgress), 26, reserveProgress, 4);
        if (this.tile.canConsumeMutagen()) {
            blit(transform, 124, 57, 204, 18, 3, 2);
        }
        
        super.drawWidgets(transform);
    }

    @Override
    protected void addLedgers() {
    }
}
