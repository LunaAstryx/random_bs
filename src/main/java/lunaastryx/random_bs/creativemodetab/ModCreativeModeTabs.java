package lunaastryx.random_bs.creativemodetab;

import lunaastryx.random_bs.RandomBS;
import lunaastryx.random_bs.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static final CreativeModeTab RANDOM_BS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, "random_bs"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOLDEN_NETHER_STAR))
                    .title(Component.translatable("creativetab.random_bs"))
                    .displayItems((parameters, output) -> {

                        output.accept(ModItems.GOLDEN_NETHER_STAR);
                        output.accept(ModItems.ELECTRIC_GUITAR);
                        output.accept(ModItems.BAGUETTE);

                    }).build());

    public static void registerCreativeModeTabs() {
        RandomBS.LOGGER.info("Registering Creative Mode Tabs for " + RandomBS.MOD_ID);
    }
}
