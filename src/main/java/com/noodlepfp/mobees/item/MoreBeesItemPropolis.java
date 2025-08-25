package com.noodlepfp.mobees.item;

import com.noodlepfp.mobees.core.client.MoreBeesCreativeTab;
import forestry.core.items.ItemOverlay;

public class MoreBeesItemPropolis
		extends ItemOverlay
{
	private final MoreBeesEnumPropolis type;
	
	public MoreBeesItemPropolis(MoreBeesEnumPropolis type)
	{
		super(MoreBeesCreativeTab.MOBEES, type);
		this.type = type;
	}
	
	public MoreBeesEnumPropolis getType()
	{
		return type;
	}
}