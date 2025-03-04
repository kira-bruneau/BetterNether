package org.betterx.betternether.mixin.common;


import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.flat.FlatLayerInfo;
import net.minecraft.world.level.levelgen.flat.FlatLevelGeneratorPreset;
import net.minecraft.world.level.levelgen.flat.FlatLevelGeneratorPresets;
import net.minecraft.world.level.levelgen.structure.StructureSet;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Set;


//see also FlatLevelGeneratorPresetTagsProviderMixin
@Mixin(FlatLevelGeneratorPresets.Bootstrap.class)
public abstract class FlatLevelGeneratorPresetsMixin {
    @Shadow
    protected abstract void register(
            ResourceKey<FlatLevelGeneratorPreset> resourceKey,
            ItemLike itemLike,
            ResourceKey<Biome> resourceKey2,
            Set<ResourceKey<StructureSet>> set,
            boolean bl,
            boolean bl2,
            FlatLayerInfo... flatLayerInfos
    );

    @Inject(method = "run", at = @At(value = "HEAD"))
    void bcl_run(CallbackInfo ci) {
//        this.register(
//                FlatLevelPresetsDataProvider.BN_FLAT,
//                Blocks.NETHERRACK,
//                Biomes.NETHER_WASTES,
//                Collections.emptySet(),
//                false, false,
//                new FlatLayerInfo(63, Blocks.NETHERRACK),
//                new FlatLayerInfo(1, Blocks.BEDROCK)
//        );

    }
}
