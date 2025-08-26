package org.zeith.mobees.mixins.client;

import forestry.core.gui.GuiForestry;
import forestry.mail.gui.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.components.*;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import org.lwjgl.glfw.GLFW;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiTradeName.class)
public abstract class GuiTradeNameMixin
		extends GuiForestry<ContainerTradeName>
{
	@Shadow(remap = false)
	private EditBox addressNameField;
	
	@Shadow(remap = false)
	protected abstract void setAddress();
	
	protected GuiTradeNameMixin(String texture, ContainerTradeName menu, Inventory inv, net.minecraft.network.chat.Component title)
	{
		super(texture, menu, inv, title);
	}
	
	@Redirect(
			method = "<init>",
			at = @At(
					value = "FIELD",
					opcode = Opcodes.GETFIELD,
					target = "Lnet/minecraft/client/Minecraft;font:Lnet/minecraft/client/gui/Font;"
			)
	)
	private Font accessMinecraftFont(Minecraft instance)
	{
		return Minecraft.getInstance().font;
	}
	
	@Inject(method = "init", at = @At("TAIL"))
	private void forestry$fixAddressField(CallbackInfo ci)
	{
		addRenderableWidget(addressNameField);
		
		addRenderableWidget(new Button(addressNameField.x, addressNameField.y + addressNameField.getHeight() + 4, addressNameField.getWidth(), 20, Component.translatable(""), btn ->
		{
			this.setAddress();
		}
		));
	}
	
	/**
	 * @author Zeith
	 * @reason fix enter key
	 */
	@Overwrite
	public boolean keyPressed(int key, int scanCode, int modifiers)
	{
		if(key == GLFW.GLFW_KEY_ENTER || key == GLFW.GLFW_KEY_KP_ENTER)
		{
			this.setAddress();
			return true;
		} else if(this.addressNameField.isFocused())
		{
			this.addressNameField.keyPressed(key, scanCode, modifiers);
			return true;
		} else
		{
			return super.keyPressed(key, scanCode, modifiers);
		}
	}
}