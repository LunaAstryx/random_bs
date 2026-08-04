package lunaastryx.random_bs.datagen.misc.villager;

import lunaastryx.random_bs.RandomBS;
import lunaastryx.random_bs.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeCost;
import net.minecraft.world.item.trading.VillagerTrade;

import java.util.List;
import java.util.Optional;

public class ModVillagerTrades {

    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_PUFFER_TRIM = createKey("wandering_trader/emerald_puffer_trim");

    public static void bootstrap(BootstrapContext<VillagerTrade> context) {
        context.register(WANDERING_TRADER_EMERALD_PUFFER_TRIM, new VillagerTrade(
                new TradeCost(Items.EMERALD, 16),
                new ItemStackTemplate(ModItems.PUFFER_ARMOR_TRIM),
                1, 67, 0.075f,
                Optional.empty(), List.of()));

    }

    private static ResourceKey<VillagerTrade> createKey(String name) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, name));
    }
}
