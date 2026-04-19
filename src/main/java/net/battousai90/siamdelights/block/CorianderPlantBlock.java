package net.battousai90.siamdelights.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CorianderPlantBlock extends BushBlock {

    @SuppressWarnings("unchecked")
    public static final MapCodec<CorianderPlantBlock> CODEC =
            (MapCodec<CorianderPlantBlock>) (MapCodec<?>) simpleCodec(CorianderPlantBlock::new);

    public CorianderPlantBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public MapCodec<BushBlock> codec() {
        return BushBlock.CODEC;
    }
}
