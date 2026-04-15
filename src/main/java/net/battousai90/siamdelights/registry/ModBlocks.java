package net.battousai90.siamdelights.registry;

import net.battousai90.siamdelights.SiamDelights;
import net.battousai90.siamdelights.block.CoconutLeavesBlock;
import net.battousai90.siamdelights.block.MangoLeavesBlock;
import net.battousai90.siamdelights.worldgen.ModConfiguredFeatures;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

import java.util.Optional;
import java.util.function.Function;

public class ModBlocks {

    // ─── Log properties (no requiresCorrectToolForDrops — breakable by hand) ──
    private static BlockBehaviour.Properties logProps() {
        return BlockBehaviour.Properties.of()
                .strength(2.0f)
                .sound(SoundType.WOOD)
                .ignitedByLava();
    }

    // ─── Leaves properties ────────────────────────────────────────────────────
    private static BlockBehaviour.Properties leavesProps() {
        return BlockBehaviour.Properties.of()
                .strength(0.2f)
                .randomTicks()
                .sound(SoundType.GRASS)
                .noOcclusion()
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY);
    }

    // ─── Sapling properties ───────────────────────────────────────────────────
    private static BlockBehaviour.Properties saplingProps() {
        return BlockBehaviour.Properties.of()
                .instabreak()
                .noCollision()
                .randomTicks()
                .sound(SoundType.GRASS)
                .noOcclusion()
                .pushReaction(PushReaction.DESTROY);
    }

    // ─── Tree Growers ────────────────────────────────────────────────────────

    public static final TreeGrower COCONUT_TREE_GROWER = new TreeGrower(
            "coconut",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.COCONUT_TREE),
            Optional.empty()
    );

    public static final TreeGrower MANGO_TREE_GROWER = new TreeGrower(
            "mango",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.MANGO_TREE),
            Optional.empty()
    );

    // ─── Coconut Tree ────────────────────────────────────────────────────────

    public static final RotatedPillarBlock COCONUT_LOG = register("coconut_log",
            props -> new RotatedPillarBlock(props), logProps());

    public static final CoconutLeavesBlock COCONUT_LEAVES = register("coconut_leaves",
            props -> new CoconutLeavesBlock(props), leavesProps());

    public static final SaplingBlock COCONUT_SAPLING = register("coconut_sapling",
            props -> new SaplingBlock(COCONUT_TREE_GROWER, props), saplingProps());

    // ─── Mango Tree ──────────────────────────────────────────────────────────

    public static final RotatedPillarBlock MANGO_LOG = register("mango_log",
            props -> new RotatedPillarBlock(props), logProps());

    public static final MangoLeavesBlock MANGO_LEAVES = register("mango_leaves",
            props -> new MangoLeavesBlock(props), leavesProps());

    public static final SaplingBlock MANGO_SAPLING = register("mango_sapling",
            props -> new SaplingBlock(MANGO_TREE_GROWER, props), saplingProps());

    // ─── Helpers ─────────────────────────────────────────────────────────────

    private static <T extends Block> T register(String name,
                                                 Function<BlockBehaviour.Properties, T> factory,
                                                 BlockBehaviour.Properties baseProps) {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK,
                Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, name));
        T block = factory.apply(baseProps.setId(key));
        return Registry.register(BuiltInRegistries.BLOCK, key, block);
    }

    public static void initialize() {
        SiamDelights.LOGGER.info("Siam Delights blocks registered");
    }
}
