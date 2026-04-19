package net.battousai90.siamdelights.block;

import com.mojang.serialization.MapCodec;
import net.battousai90.siamdelights.registry.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class GalangalCropBlock extends CropBlock {

    public static final MapCodec<GalangalCropBlock> CODEC = simpleCodec(GalangalCropBlock::new);

    public GalangalCropBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public MapCodec<? extends CropBlock> codec() {
        return CODEC;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.GALANGAL;
    }

    // Allow planting on farmland AND on dirt/grass (for natural world spawn)
    
    public int getMaxAge() { return 3; }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return super.mayPlaceOn(state, level, pos)
                || state.is(BlockTags.DIRT)
                || state.is(BlockTags.GRASS_BLOCKS);
    }
}
