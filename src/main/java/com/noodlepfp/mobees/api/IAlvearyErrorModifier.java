package com.noodlepfp.mobees.api;

import forestry.api.apiculture.IBeeModifier;
import forestry.api.core.IError;

import java.util.Set;

public interface IAlvearyErrorModifier
		extends IBeeModifier
{
	default void removeErrors(Set<IError> workErrors)
	{
	}
}