package com.noodlepfp.mobees.hive;

import com.noodlepfp.mobees.bee.MoreBeesSpecies;
import com.noodlepfp.mobees.ff.FutureForestryBeeSpecies;
import forestry.api.core.IBlockSubtype;
import net.minecraft.resources.ResourceLocation;

import java.util.Locale;

public enum MoreBeesBlockHiveType implements IBlockSubtype {
    
    LUSH(FutureForestryBeeSpecies.LUSH),
    AQUATIC(FutureForestryBeeSpecies.AQUATIC),
    NETHER(FutureForestryBeeSpecies.EMBITTERED),
    ROCKY(MoreBeesSpecies.ROCKY),
    ALPINE(MoreBeesSpecies.ALPINE);

    private final ResourceLocation speciesUid;

    MoreBeesBlockHiveType(ResourceLocation speciesUid) {
        this.speciesUid = speciesUid;
    }

    public ResourceLocation getSpeciesId() {
        return this.speciesUid;
    }

    @Override
    public String getSerializedName() {
        return name().toLowerCase(Locale.ENGLISH);
    }

}
