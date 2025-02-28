package org.betterx.betternether.blocks;

import org.betterx.bclib.behaviours.interfaces.BehaviourPlant;
import org.betterx.betternether.blocks.materials.Materials;
import org.betterx.betternether.interfaces.SurvivesOnNetherrack;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

public class BlockHookMushroom extends BaseBlockMold implements SurvivesOnNetherrack, BehaviourPlant {
    public BlockHookMushroom() {
        super(Materials.makeNetherGrass(MapColor.COLOR_PINK)
                       .lightLevel(s -> 13)
                       .sound(SoundType.CROP)
        );
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        return canSurviveOnBottom(world, pos);
    }
}
