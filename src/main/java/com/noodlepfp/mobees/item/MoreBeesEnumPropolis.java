package com.noodlepfp.mobees.item;

import forestry.core.items.ItemOverlay;

import java.awt.*;
import java.util.Locale;

public enum MoreBeesEnumPropolis
		implements ItemOverlay.IOverlayInfo
{
	VOLCANIC(new Color(0xE84528));
	
	private final String name;
	private final int primaryColor;
	
	MoreBeesEnumPropolis(Color color)
	{
		this.name = toString().toLowerCase(Locale.ENGLISH);
		this.primaryColor = color.getRGB();
	}
	
	public static final MoreBeesEnumPropolis[] VALUES = values();
	
	@Override
	public int getPrimaryColor()
	{
		return primaryColor;
	}
	
	@Override
	public int getSecondaryColor()
	{
		return 0;
	}
	
	@Override
	public String getSerializedName()
	{
		return this.name;
	}
}