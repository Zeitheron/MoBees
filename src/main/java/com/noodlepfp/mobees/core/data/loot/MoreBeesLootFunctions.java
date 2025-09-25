package com.noodlepfp.mobees.core.data.loot;

import com.noodlepfp.mobees.MoBeesModule;
import forestry.modules.features.*;
import net.minecraft.core.Registry;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctionType;
import net.minecraftforge.registries.*;

@FeatureProvider
public class MoreBeesLootFunctions
{
	private static final IFeatureRegistry REGISTRY = ModFeatureRegistry.get(MoBeesModule.mobees("core"));
	private static final DeferredRegister<LootItemFunctionType> LOOT_FUNCTIONS = REGISTRY.getRegistry(Registry.LOOT_FUNCTION_REGISTRY);
	
	public static final RegistryObject<LootItemFunctionType> NBT_SYNC = LOOT_FUNCTIONS.register("nbt_sync", () -> new LootItemFunctionType(new LootItemNbtSync.Serializer()));
}