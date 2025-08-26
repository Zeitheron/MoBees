package org.zeith.mobees.mixins;

import forestry.api.mail.IMailAddress;
import forestry.mail.*;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.storage.DimensionDataStorage;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

import java.util.function.*;

@Mixin(value = PostRegistry.class, remap = false)
public class PostRegistryMixin
{
	@Redirect(
			method = "getTradeStation(Lnet/minecraft/server/level/ServerLevel;Lforestry/api/mail/IMailAddress;)Lforestry/mail/TradeStation;",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/world/level/storage/DimensionDataStorage;computeIfAbsent(Ljava/util/function/Function;Ljava/util/function/Supplier;Ljava/lang/String;)Lnet/minecraft/world/level/saveddata/SavedData;"
			)
	)
	private <T extends SavedData> T createInvalidNewTradeStation(DimensionDataStorage instance, Function<CompoundTag, T> loadFunc, Supplier<T> newInstFunc, String name, ServerLevel world, IMailAddress address)
	{
		var val = instance.get(loadFunc, name);
		if(val == null)
		{
			TradeStation nts = new TradeStation(null, address);
			nts.invalidate();
			val = (T) nts;
		}
		return val;
	}
}