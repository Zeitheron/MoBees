package com.noodlepfp.mobees.core.data;

import com.noodlepfp.mobees.MoBeesModCompat;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.data.loading.DatagenModLoader;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreBeesData
{
	
	static
	{
		if(DatagenModLoader.isRunningDataGen())
		{
			MoBeesModCompat.registerModData();
		}
	}
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event)
	{
	}
}
