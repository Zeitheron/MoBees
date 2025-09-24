package org.zeith.mobees.mixins;

import com.noodlepfp.mobees.api.IAlvearyErrorModifier;
import forestry.api.apiculture.*;
import forestry.api.core.*;
import forestry.apiculture.genetics.Bee;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Set;

@Mixin(value = Bee.class, remap = false)
public class BeeMixin
{
	@Inject(
			method = "getCanWork",
			at = @At("RETURN")
	)
	private void mb$canWorkDuringDay(IBeeHousing housing, CallbackInfoReturnable<Set<IError>> cir)
	{
		var errors = cir.getReturnValue();
		
		if(errors.contains(ForestryError.NOT_NIGHT))
		{
			for(IBeeModifier mod : housing.getBeeModifiers())
				if(mod instanceof IAlvearyErrorModifier m)
				{
					m.removeErrors(errors);
					if(errors.isEmpty()) return;
				}
		}
	}
}