package net.battousai90.siamdelights.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoods {

    // ─── RAW FRUITS ────────────────────────────────────────────────────────

    public static final FoodProperties MANGO          = simple(5, 0.6f);
    public static final FoodProperties COCONUT        = simple(2, 0.2f);
    public static final FoodProperties COCONUT_MEAT   = simple(4, 0.4f);
    public static final FoodProperties BANANA         = simple(4, 0.6f);
    public static final FoodProperties PAPAYA         = simple(4, 0.5f);

    // ─── HERBS & AROMATICS ─────────────────────────────────────────────────

    public static final FoodProperties LEMONGRASS     = simple(1, 0.1f);
    public static final FoodProperties GALANGAL       = simple(1, 0.1f);
    public static final FoodProperties GINGER         = simple(1, 0.1f);
    public static final FoodProperties MAKRUT_LEAF    = simple(1, 0.1f);
    public static final FoodProperties MAKRUT         = simple(2, 0.3f);
    public static final FoodProperties THAI_BASIL     = simple(1, 0.2f);
    public static final FoodProperties CORIANDER      = simple(1, 0.2f);
    public static final FoodProperties RED_CHILI      = simple(1, 0.2f);
    public static final FoodProperties GREEN_CHILI    = simple(1, 0.2f);
    public static final FoodProperties GARLIC         = simple(2, 0.2f);
    public static final FoodProperties SHALLOT        = simple(2, 0.2f);
    public static final FoodProperties THAI_EGGPLANT  = simple(3, 0.3f);

    // ─── TRANSFORMED ───────────────────────────────────────────────────────

    public static final FoodProperties SLICED_MANGO       = simple(5, 0.6f);
    public static final FoodProperties SLICED_GALANGAL    = simple(1, 0.1f);
    public static final FoodProperties SLICED_LEMONGRASS  = simple(1, 0.1f);
    public static final FoodProperties SHREDDED_PAPAYA    = simple(3, 0.4f);
    public static final FoodProperties STICKY_RICE        = simple(6, 0.5f);
    public static final FoodProperties DRIED_FISH         = simple(4, 0.5f);

    // ─── DISHES ────────────────────────────────────────────────────────────

    public static final FoodProperties MANGO_STICKY_RICE  = simple(8, 0.7f);
    public static final FoodProperties TOM_YUM            = simple(7, 0.6f);
    public static final FoodProperties GREEN_CURRY        = simple(10, 0.8f);
    public static final FoodProperties SOM_TAM            = simple(6, 0.5f);
    public static final FoodProperties PAD_THAI           = simple(9, 0.7f);
    public static final FoodProperties TOM_KHA_GAI        = simple(8, 0.7f);
    public static final FoodProperties KRAPAO_MOO         = simple(9, 0.7f);
    public static final FoodProperties TOM_SEP_MOO        = simple(7, 0.6f);
    public static final FoodProperties KHAO_MAN_GAI       = simple(10, 0.8f);
    public static final FoodProperties LARB_MOO           = simple(7, 0.6f);
    public static final FoodProperties RED_CURRY          = simple(10, 0.8f);
    public static final FoodProperties MASSAMAN_CURRY     = simple(10, 0.8f);
    public static final FoodProperties YAM_MAMUANG        = simple(5, 0.5f);

    // ─── Consumables (animation + effects) ─────────────────────────────────

    public static final Consumable DEFAULT = Consumables.DEFAULT_FOOD;

    public static final Consumable TOM_YUM_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.REGENERATION, 160, 0), 1.0f))
            .build();

    public static final Consumable GREEN_CURRY_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.SPEED, 160, 0), 1.0f))
            .build();

    public static final Consumable PAD_THAI_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.SATURATION, 160, 0), 1.0f))
            .build();

    public static final Consumable TOM_KHA_GAI_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.RESISTANCE, 200, 0), 1.0f))
            .build();

    public static final Consumable KRAPAO_MOO_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.STRENGTH, 160, 0), 1.0f))
            .build();

    public static final Consumable TOM_SEP_MOO_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200, 0), 1.0f))
            .build();

    public static final Consumable LARB_MOO_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.SPEED, 120, 0), 1.0f))
            .build();

    public static final Consumable RED_CURRY_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.ABSORPTION, 400, 0), 1.0f))
            .build();

    public static final Consumable MASSAMAN_CURRY_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.HEALTH_BOOST, 400, 0), 1.0f))
            .build();

    public static final Consumable YAM_MAMUANG_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.LUCK, 240, 0), 1.0f))
            .build();

    // ─── Helpers ────────────────────────────────────────────────────────────

    private static FoodProperties simple(int nutrition, float saturation) {
        return new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationModifier(saturation)
                .build();
    }
}
