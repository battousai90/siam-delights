package net.battousai90.siamdelights.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class SiamFoodItem extends Item {

    private final String tooltipKey;

    public SiamFoodItem(Properties properties, String tooltipKey) {
        super(properties);
        this.tooltipKey = tooltipKey;
    }

    public SiamFoodItem(Properties properties) {
        this(properties, null);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display,
                                Consumer<Component> consumer, TooltipFlag flag) {
        if (tooltipKey != null) {
            consumer.accept(Component.translatable(tooltipKey));
        }
        super.appendHoverText(stack, context, display, consumer, flag);
    }
}
