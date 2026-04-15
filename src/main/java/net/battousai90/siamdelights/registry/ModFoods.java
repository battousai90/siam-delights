package net.battousai90.siamdelights.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoods {

    // ─── RAW ───────────────────────────────────────────────────────────────

    public static final FoodProperties MANGO = simple(5, 0.6f);
    public static final FoodProperties COCONUT = simple(2, 0.2f);
    public static final FoodProperties COCONUT_MEAT = simple(4, 0.4f);

    // ─── TRANSFORMED ───────────────────────────────────────────────────────

    public static final FoodProperties SLICED_MANGO = simple(5, 0.6f);
    public static final FoodProperties STICKY_RICE = simple(6, 0.5f);

    // ─── DISHES ────────────────────────────────────────────────────────────

    public static final FoodProperties MANGO_STICKY_RICE = simple(8, 0.7f);
    public static final FoodProperties TOM_YUM = simple(7, 0.6f);

    // ─── Consumables (animation + effets) ──────────────────────────────────

    public static final Consumable DEFAULT = Consumables.DEFAULT_FOOD;

    public static final Consumable TOM_YUM_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.REGENERATION, 160, 0), 1.0f))
            .build();

    // ─── Helpers ────────────────────────────────────────────────────────────

    private static FoodProperties simple(int nutrition, float saturation) {
        return new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationModifier(saturation)
                .build();
    }
}
