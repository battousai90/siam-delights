package net.battousai90.siamdelights.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CoconutLeavesBlock extends LeavesBlock {

    public static final MapCodec<CoconutLeavesBlock> CODEC = simpleCodec(CoconutLeavesBlock::new);

    public CoconutLeavesBlock(BlockBehaviour.Properties properties) {
        super(0.05f, properties);
    }

    @Override
    public MapCodec<? extends LeavesBlock> codec() {
        return CODEC;
    }

    @Override
    protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {
        // no custom falling particles for coconut leaves
    }
}
