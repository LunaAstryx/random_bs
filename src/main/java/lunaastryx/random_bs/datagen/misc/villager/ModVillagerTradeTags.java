package lunaastryx.random_bs.datagen.misc.villager;

import lunaastryx.random_bs.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.VillagerTradeTags;
import net.minecraft.world.item.trading.VillagerTrade;

import java.util.concurrent.CompletableFuture;

public class ModVillagerTradeTags extends FabricTagsProvider<VillagerTrade> {

    public ModVillagerTradeTags(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, Registries.VILLAGER_TRADE, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        getOrCreateRawBuilder(VillagerTradeTags.WANDERING_TRADER_UNCOMMON)
                .add(TagEntry.element(ModVillagerTrades.WANDERING_TRADER_EMERALD_PUFFER_TRIM.identifier()));

        getOrCreateRawBuilder(ModTags.Trades.FLORIST_LEVEL_1)
                .add(TagEntry.element(ModVillagerTrades.FLORIST_1_EMERALD_WHITE_TULIP.identifier()))
                .add(TagEntry.element(ModVillagerTrades.FLORIST_1_EMERALD_YELLOW_TULIP.identifier()))
                .add(TagEntry.element(ModVillagerTrades.FLORIST_1_EMERALD_PINK_TULIP.identifier()))
                .add(TagEntry.element(ModVillagerTrades.FLORIST_1_EMERALD_PURPLE_TULIP.identifier()))
                .add(TagEntry.element(ModVillagerTrades.FLORIST_1_EMERALD_ORANGE_TULIP.identifier()))
                .add(TagEntry.element(ModVillagerTrades.FLORIST_1_EMERALD_RED_TULIP.identifier()));

        getOrCreateRawBuilder(ModTags.Trades.GUY_LEVEL_1)
                .add(TagEntry.element(ModVillagerTrades.GUY_1_EMERALD_TERRACOTTA.identifier()))
                .add(TagEntry.element(ModVillagerTrades.GUY_1_EMERALD_YELLOW_TERRACOTTA.identifier()))
                .add(TagEntry.element(ModVillagerTrades.GUY_1_EMERALD_GREEN_TERRACOTTA.identifier()))
                .add(TagEntry.element(ModVillagerTrades.GUY_1_EMERALD_RED_TERRACOTTA.identifier()))
                .add(TagEntry.element(ModVillagerTrades.GUY_1_EMERALD_BLUE_TERRACOTTA.identifier()))
                .add(TagEntry.element(ModVillagerTrades.GUY_1_EMERALD_LIGHT_BLUE_TERRACOTTA.identifier()));

        getOrCreateRawBuilder(ModTags.Trades.GUY_LEVEL_2)
                .add(TagEntry.element(ModVillagerTrades.GUY_2_EMERALD_BRICKS.identifier()))
                .add(TagEntry.element(ModVillagerTrades.GUY_2_EMERALD_TUFF.identifier()));

        getOrCreateRawBuilder(ModTags.Trades.GUY_LEVEL_3)
                .add(TagEntry.element(ModVillagerTrades.GUY_3_EMERALD_COBBLED_DEEPSLATE.identifier()))
                .add(TagEntry.element(ModVillagerTrades.GUY_3_EMERALD_STONE.identifier()));

        getOrCreateRawBuilder(ModTags.Trades.GUY_LEVEL_4).add(TagEntry.element(ModVillagerTrades.GUY_4_EMERALD_GOOFY_DISC.identifier()));
    }
}
