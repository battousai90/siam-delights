package net.battousai90.siamdelights.block;

import com.mojang.serialization.MapCodec;
import net.battousai90.siamdelights.registry.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class ThaiEggplantCropBlock extends CropBlock {

    public static final MapCodec<ThaiEggplantCropBlock> CODEC = simpleCodec(ThaiEggplantCropBlock::new);

    public ThaiEggplantCropBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public MapCodec<? extends CropBlock> codec() {
        return CODEC;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.THAI_EGGPLANT_SEEDS;
    }

    @Override
    public int getMaxAge() { return 7; }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        if (isMaxAge(state)) {
            if (level instanceof ServerLevel) {
                int count = 1 + level.getRandom().nextInt(3);
                popResource(level, pos, new ItemStack(ModItems.THAI_EGGPLANT, count));
                level.setBlock(pos, state.setValue(getAgeProperty(), 0), 3);
                level.playSound(null, pos, SoundType.CROP.getBreakSound(), net.minecraft.sounds.SoundSource.BLOCKS, 1.0f, 1.0f);
            }
            return InteractionResult.SUCCESS;
        }
        return super.useWithoutItem(state, level, pos, player, hit);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return super.mayPlaceOn(state, level, pos)
                || state.is(BlockTags.DIRT)
                || state.is(BlockTags.GRASS_BLOCKS);
    }
}
