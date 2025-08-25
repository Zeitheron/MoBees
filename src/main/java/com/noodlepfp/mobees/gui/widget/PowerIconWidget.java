package com.noodlepfp.mobees.gui.widget;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.noodlepfp.mobees.alveary.block.TileAlvearyMutator;
import forestry.api.core.tooltips.ToolTip;
import forestry.core.gui.widgets.*;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.*;

import static net.minecraft.client.gui.GuiComponent.blit;

public class PowerIconWidget
		extends Widget
{
	
	private final TileAlvearyMutator tile;
	
	public PowerIconWidget(WidgetManager manager, int xPos, int yPos, TileAlvearyMutator tile)
	{
		super(manager, xPos, yPos);
		this.tile = tile;
		this.width = 6;
		this.height = 6;
	}
	
	@Override
	public void draw(PoseStack poseStack, int i, int i1)
	{
		if(this.tile.isActive())
		{
			RenderSystem.setShaderTexture(0, manager.gui.textureFile);
			blit(poseStack, 77, 34, 0, 176, 20, 6, 6, 256, 256);
		}
	}
	
	@OnlyIn(Dist.CLIENT)
	@Override
	public ToolTip getToolTip(int mouseX, int mouseY)
	{
		return toolTip;
	}
	
	private final ToolTip toolTip = new ToolTip()
	{
		@Override
		@OnlyIn(Dist.CLIENT)
		public void refresh()
		{
			toolTip.clear();
			if(tile.isActive())
			{
				toolTip.add(Component.translatable("gui.widget.power.on").withStyle(ChatFormatting.YELLOW));
			} else
			{
				toolTip.add(Component.translatable("gui.widget.power.off").withStyle(ChatFormatting.GRAY));
			}
			int stored = tile.getEnergyStorage().getEnergyStored();
			int cap = tile.getEnergyStorage().getMaxEnergyStored();
			toolTip.add(Component.translatable("gui.widget.power.stored").append(":").withStyle(ChatFormatting.WHITE));
			toolTip.add(Component.literal(stored + "/" + cap + " RF").withStyle(ChatFormatting.GRAY));
		}
	};
}
