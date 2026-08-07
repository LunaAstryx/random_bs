package lunaastryx.random_bs.datagen.misc.villager;

import lunaastryx.random_bs.RandomBS;
import lunaastryx.random_bs.tags.ModTags;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.trading.TradeSet;
import net.minecraft.world.item.trading.VillagerTrade;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;

import java.util.Optional;

public class ModTradeSets {

    public static final ResourceKey<TradeSet> GUY_LEVEL_1 = create("guy/level_1");
    public static final ResourceKey<TradeSet> GUY_LEVEL_2 = create("guy/level_2");
    public static final ResourceKey<TradeSet> GUY_LEVEL_3 = create("guy/level_3");
    public static final ResourceKey<TradeSet> GUY_LEVEL_4 = create("guy/level_4");

    public static final ResourceKey<TradeSet> FLORIST_LEVEL_1 = create("florist/level_1");

    public static void bootstrap(BootstrapContext<TradeSet> context) {
        register(context, GUY_LEVEL_1, ModTags.Trades.GUY_LEVEL_1);
        register(context, GUY_LEVEL_2, ModTags.Trades.GUY_LEVEL_2);
        register(context, GUY_LEVEL_3, ModTags.Trades.GUY_LEVEL_3);
        register(context, GUY_LEVEL_4, ModTags.Trades.GUY_LEVEL_4);

        register(context, FLORIST_LEVEL_1, ModTags.Trades.FLORIST_LEVEL_1);
    }

    private static ResourceKey<TradeSet> create(final String id) {
        return ResourceKey.create(Registries.TRADE_SET, Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, id));
    }

    public static Holder.Reference<TradeSet> register(final BootstrapContext<TradeSet> context,
                                                      final ResourceKey<TradeSet> resourceKey, final TagKey<VillagerTrade> tradeTag) {
        return register(context, resourceKey, tradeTag, ConstantValue.exactly(2.0f));
    }

    public static Holder.Reference<TradeSet> register(final BootstrapContext<TradeSet> context, final ResourceKey<TradeSet> resourceKey,
                                                      final TagKey<VillagerTrade> tradeTag, final NumberProvider numberProvider) {
        return context.register(resourceKey, new TradeSet(context.lookup(Registries.VILLAGER_TRADE).getOrThrow(tradeTag),
                numberProvider, false, Optional.of(resourceKey.identifier().withPrefix("trade_set/"))));
    }
}
