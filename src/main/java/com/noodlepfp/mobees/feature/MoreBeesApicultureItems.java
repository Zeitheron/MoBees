package com.noodlepfp.mobees.feature;

import com.noodlepfp.mobees.MoBeesModule;
import com.noodlepfp.mobees.item.*;
import forestry.modules.features.*;

@FeatureProvider
public class MoreBeesApicultureItems {
    public static final IFeatureRegistry REGISTRY = ModFeatureRegistry.get(MoBeesModule.mobees("core"));
    
    public static final FeatureItemGroup<MoreBeesItemHoneyComb, MoreBeesEnumHoneyComb> BEE_COMBS = REGISTRY.itemGroup(MoreBeesItemHoneyComb::new, "bee_comb", MoreBeesEnumHoneyComb.VALUES);
    public static final FeatureItemGroup<MoreBeesItemPropolis, MoreBeesEnumPropolis> PROPOLIS = REGISTRY.itemGroup(MoreBeesItemPropolis::new, "propolis", MoreBeesEnumPropolis.VALUES);
    
    public static final FeatureItem<MoreBeesItemHiveFrame> FRAME_PRESERVATION = REGISTRY.item(() -> new MoreBeesItemHiveFrame
            .MoreBeesItemHiveFrameBuilder(256)
            .setAgeMult(0.5f)
            .setDecayMult(0.8f)
            .build(), "frame_preservation");

    public static final FeatureItem<MoreBeesItemHiveFrame> FRAME_DESTRUCTION = REGISTRY.item(() -> new MoreBeesItemHiveFrame
            .MoreBeesItemHiveFrameBuilder(256)
            .setAgeMult(5f)
            .setSpeedMult(0.5f)
            .setMutationMult(1.25f)
            .setDecayMult(1.25f)
            .build(), "frame_destruction");

    public static final FeatureItem<MoreBeesItemHiveFrame> FRAME_MUTATION = REGISTRY.item(() -> new MoreBeesItemHiveFrame
            .MoreBeesItemHiveFrameBuilder(256)
            .setSpeedMult(0.8f)
            .setDecayMult(1.2f)
            .setMutationMult(1.25f)
            .build(), "frame_mutation");

    public static final FeatureItem<MoreBeesItemHiveFrame> FRAME_FERTILE = REGISTRY.item(() -> new MoreBeesItemHiveFrame
            .MoreBeesItemHiveFrameBuilder(256)
            .setSpeedMult(0.8f)
            .setDecayMult(1.2f)
            .setPollinationMult(2.0f)
            .setMutationMult(1.1f)
            .build(), "frame_fertile");

    public static final FeatureItem<MoreBeesItemHiveFrame> FRAME_CRIMSON = REGISTRY.item(() -> new MoreBeesItemHiveFrame
            .MoreBeesItemHiveFrameBuilder(256)
            .setMutationMult(1.25f)
            .setIsHellish(true)
            .build(), "frame_crimson");

    public static final FeatureItem<MoreBeesItemHiveFrame> FRAME_KIND = REGISTRY.item(() -> new MoreBeesItemHiveFrame
            .MoreBeesItemHiveFrameBuilder(512)
            .setSpeedMult(1.5f)
            .setAgeMult(0.75f)
            .setDecayMult(0.05f)
            .setMutationMult(0.5f)
            .build(), "frame_kind");
}
