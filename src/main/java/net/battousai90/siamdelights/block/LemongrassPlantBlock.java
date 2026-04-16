package net.battousai90.siamdelights.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class LemongrassPlantBlock extends BushBlock {

    public LemongrassPlantBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public MapCodec<BushBlock> codec() {
        return BushBlock.CODEC;
    }
}
