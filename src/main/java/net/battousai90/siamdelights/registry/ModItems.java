package net.battousai90.siamdelights.registry;

import net.battousai90.siamdelights.SiamDelights;
import net.battousai90.siamdelights.item.SiamFoodItem;
import net.battousai90.siamdelights.items.MangoItem;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTabOutput;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {

    private static final ResourceKey<CreativeModeTab> FOOD_AND_DRINKS =
            ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.withDefaultNamespace("food_and_drinks"));

    // ─── RAW FRUITS ─────────────────────────────────────────────────────────

    public static final MangoItem MANGO = register("mango",
            props -> new MangoItem(props.food(ModFoods.MANGO)));

    public static final SiamFoodItem COCONUT = register("coconut",
            props -> new SiamFoodItem(props.food(ModFoods.COCONUT)));

    // ─── HERBS & AROMATICS ──────────────────────────────────────────────────

    public static final SiamFoodItem LEMONGRASS = register("lemongrass",
            props -> new SiamFoodItem(props.food(ModFoods.LEMONGRASS)));

    public static final SiamFoodItem GALANGAL = register("galangal",
            props -> new SiamFoodItem(props.food(ModFoods.GALANGAL)));

    public static final SiamFoodItem MAKRUT_LEAF = register("makrut_leaf",
            props -> new SiamFoodItem(props.food(ModFoods.MAKRUT_LEAF)));

    public static final SiamFoodItem MAKRUT = register("makrut",
            props -> new SiamFoodItem(props.food(ModFoods.MAKRUT)));

    public static final SiamFoodItem SLICED_GALANGAL = register("sliced_galangal",
            props -> new SiamFoodItem(props.food(ModFoods.SLICED_GALANGAL)));

    public static final SiamFoodItem SLICED_LEMONGRASS = register("sliced_lemongrass",
            props -> new SiamFoodItem(props.food(ModFoods.SLICED_LEMONGRASS)));

    public static final Item MAKRUT_JUICE = register("makrut_juice",
            props -> new Item(props));

    public static final SiamFoodItem THAI_BASIL = register("thai_basil",
            props -> new SiamFoodItem(props.food(ModFoods.THAI_BASIL)));

    public static final SiamFoodItem GINGER = register("ginger",
            props -> new SiamFoodItem(props.food(ModFoods.GINGER)));

    public static final SiamFoodItem CORIANDER = register("coriander",
            props -> new SiamFoodItem(props.food(ModFoods.CORIANDER)));

    public static final Item CORIANDER_SEEDS = register("coriander_seeds",
            props -> new Item(props));

    public static final SiamFoodItem RED_CHILI = register("red_chili",
            props -> new SiamFoodItem(props.food(ModFoods.RED_CHILI)));

    public static final SiamFoodItem GREEN_CHILI = register("green_chili",
            props -> new SiamFoodItem(props.food(ModFoods.GREEN_CHILI)));

    public static final SiamFoodItem GARLIC = register("garlic",
            props -> new SiamFoodItem(props.food(ModFoods.GARLIC)));

    public static final SiamFoodItem SHALLOT = register("shallot",
            props -> new SiamFoodItem(props.food(ModFoods.SHALLOT)));

    public static final SiamFoodItem THAI_EGGPLANT = register("thai_eggplant",
            props -> new SiamFoodItem(props.food(ModFoods.THAI_EGGPLANT)));

    public static final Item GREEN_CURRY_PASTE = register("green_curry_paste",
            props -> new Item(props));

    public static final Item RED_CURRY_PASTE = register("red_curry_paste",
            props -> new Item(props));

    public static final Item YELLOW_CURRY_PASTE = register("yellow_curry_paste",
            props -> new Item(props));

    // ─── TRANSFORMED ────────────────────────────────────────────────────────

    public static final SiamFoodItem COCONUT_MEAT = register("coconut_meat",
            props -> new SiamFoodItem(props.food(ModFoods.COCONUT_MEAT)));

    public static final Item COCONUT_MILK = register("coconut_milk",
            props -> new Item(props));

    public static final SiamFoodItem SLICED_MANGO = register("sliced_mango",
            props -> new SiamFoodItem(props.food(ModFoods.SLICED_MANGO)));

    public static final SiamFoodItem STICKY_RICE = register("sticky_rice",
            props -> new SiamFoodItem(props.food(ModFoods.STICKY_RICE)));

    // ─── DISHES ─────────────────────────────────────────────────────────────

    public static final SiamFoodItem MANGO_STICKY_RICE = register("mango_sticky_rice",
            props -> new SiamFoodItem(
                    props.food(ModFoods.MANGO_STICKY_RICE),
                    "item.siam_delights.mango_sticky_rice.tooltip"));

    public static final SiamFoodItem TOM_YUM = register("tom_yum",
            props -> new SiamFoodItem(
                    props.food(ModFoods.TOM_YUM, ModFoods.TOM_YUM_CONSUMABLE),
                    "item.siam_delights.tom_yum.tooltip"));

    // ─── BLOCK ITEMS ────────────────────────────────────────────────────────

    public static final BlockItem COCONUT_LOG = register("coconut_log",
            props -> new BlockItem(ModBlocks.COCONUT_LOG, props));

    public static final BlockItem COCONUT_LEAVES = register("coconut_leaves",
            props -> new BlockItem(ModBlocks.COCONUT_LEAVES, props));

    public static final BlockItem COCONUT_SAPLING = register("coconut_sapling",
            props -> new BlockItem(ModBlocks.COCONUT_SAPLING, props));

    public static final BlockItem MANGO_LOG = register("mango_log",
            props -> new BlockItem(ModBlocks.MANGO_LOG, props));

    public static final BlockItem MANGO_LEAVES = register("mango_leaves",
            props -> new BlockItem(ModBlocks.MANGO_LEAVES, props));

    public static final BlockItem MANGO_SAPLING = register("mango_sapling",
            props -> new BlockItem(ModBlocks.MANGO_SAPLING, props));

    public static final BlockItem MAKRUT_LOG = register("makrut_log",
            props -> new BlockItem(ModBlocks.MAKRUT_LOG, props));

    public static final BlockItem MAKRUT_LEAVES = register("makrut_leaves",
            props -> new BlockItem(ModBlocks.MAKRUT_LEAVES, props));

    public static final BlockItem MAKRUT_SAPLING = register("makrut_sapling",
            props -> new BlockItem(ModBlocks.MAKRUT_SAPLING, props));

    public static final BlockItem THAI_BASIL_PLANT = register("thai_basil_plant",
            props -> new BlockItem(ModBlocks.THAI_BASIL_PLANT, props));

    public static final BlockItem GALANGAL_CROP = register("galangal_crop",
            props -> new BlockItem(ModBlocks.GALANGAL_CROP, props));

    public static final BlockItem LEMONGRASS_PLANT = register("lemongrass_plant",
            props -> new BlockItem(ModBlocks.LEMONGRASS_PLANT, props));

    public static final BlockItem CORIANDER_PLANT = register("coriander_plant",
            props -> new BlockItem(ModBlocks.CORIANDER_PLANT, props));

    public static final BlockItem GINGER_CROP = register("ginger_crop",
            props -> new BlockItem(ModBlocks.GINGER_CROP, props));

    public static final BlockItem RED_CHILI_SEEDS = register("red_chili_seeds",
            props -> new BlockItem(ModBlocks.RED_CHILI_CROP, props));

    public static final BlockItem GREEN_CHILI_SEEDS = register("green_chili_seeds",
            props -> new BlockItem(ModBlocks.GREEN_CHILI_CROP, props));

    public static final BlockItem THAI_EGGPLANT_SEEDS = register("thai_eggplant_seeds",
            props -> new BlockItem(ModBlocks.THAI_EGGPLANT_CROP, props));

    public static final BlockItem GARLIC_CROP = register("garlic_crop",
            props -> new BlockItem(ModBlocks.GARLIC_CROP, props));

    public static final BlockItem SHALLOT_CROP = register("shallot_crop",
            props -> new BlockItem(ModBlocks.SHALLOT_CROP, props));

    // ─── Helpers ────────────────────────────────────────────────────────────

    private static <T extends Item> T register(String name, Function<Item.Properties, T> factory) {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM,
                Identifier.fromNamespaceAndPath(SiamDelights.MOD_ID, name));
        T item = factory.apply(new Item.Properties().setId(key));
        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(FOOD_AND_DRINKS).register((FabricCreativeModeTabOutput output) -> {
            // Raw
            output.accept(MANGO);
            output.accept(COCONUT);
            // Herbs & Aromatics
            output.accept(LEMONGRASS);
            output.accept(GALANGAL);
            output.accept(MAKRUT_LEAF);
            output.accept(MAKRUT);
            output.accept(SLICED_GALANGAL);
            output.accept(SLICED_LEMONGRASS);
            output.accept(MAKRUT_JUICE);
            output.accept(THAI_BASIL);
            output.accept(GINGER);
            output.accept(CORIANDER);
            output.accept(CORIANDER_SEEDS);
            output.accept(RED_CHILI);
            output.accept(GREEN_CHILI);
            output.accept(GARLIC);
            output.accept(SHALLOT);
            output.accept(THAI_EGGPLANT);
            output.accept(GREEN_CURRY_PASTE);
            output.accept(RED_CURRY_PASTE);
            output.accept(YELLOW_CURRY_PASTE);
            // Transformed
            output.accept(COCONUT_MEAT);
            output.accept(COCONUT_MILK);
            output.accept(SLICED_MANGO);
            output.accept(STICKY_RICE);
            // Dishes
            output.accept(MANGO_STICKY_RICE);
            output.accept(TOM_YUM);
            // Blocks — Coconut
            output.accept(COCONUT_LOG);
            output.accept(COCONUT_LEAVES);
            output.accept(COCONUT_SAPLING);
            // Blocks — Mango
            output.accept(MANGO_LOG);
            output.accept(MANGO_LEAVES);
            output.accept(MANGO_SAPLING);
            // Blocks — Makrut
            output.accept(MAKRUT_LOG);
            output.accept(MAKRUT_LEAVES);
            output.accept(MAKRUT_SAPLING);
            output.accept(THAI_BASIL_PLANT);
            output.accept(LEMONGRASS_PLANT);
            output.accept(CORIANDER_PLANT);
            output.accept(GINGER_CROP);
            output.accept(RED_CHILI_SEEDS);
            output.accept(GREEN_CHILI_SEEDS);
            output.accept(THAI_EGGPLANT_SEEDS);
            output.accept(GARLIC_CROP);
            output.accept(SHALLOT_CROP);
        });
    }
}
