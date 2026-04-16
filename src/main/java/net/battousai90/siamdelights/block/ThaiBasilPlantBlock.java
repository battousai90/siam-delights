package net.battousai90.siamdelights.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ThaiBasilPlantBlock extends BushBlock {

    @SuppressWarnings("unchecked")
    public static final MapCodec<ThaiBasilPlantBlock> CODEC =
            (MapCodec<ThaiBasilPlantBlock>) (MapCodec<?>) simpleCodec(ThaiBasilPlantBlock::new);

    public ThaiBasilPlantBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public MapCodec<BushBlock> codec() {
        return BushBlock.CODEC;
    }
}
