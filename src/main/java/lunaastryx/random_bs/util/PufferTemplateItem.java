package lunaastryx.random_bs.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class PufferTemplateItem extends Item {
    public PufferTemplateItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
        builder.accept(Component.translatable("itemTooltip.random_bs.puffer_trim.tooltip").withStyle(ChatFormatting.GRAY));

        super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
    }
}
