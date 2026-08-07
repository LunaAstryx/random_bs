package lunaastryx.random_bs.datagen.misc.villager;

import lunaastryx.random_bs.RandomBS;
import lunaastryx.random_bs.block.ModBlocks;
import lunaastryx.random_bs.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeCost;
import net.minecraft.world.item.trading.VillagerTrade;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.Optional;

public class ModVillagerTrades {

    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_PUFFER_TRIM = createKey("wandering_trader/emerald_puffer_trim");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_YELLOW_TULIP = createKey("wandering_trader/emerald_yellow_tulip");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_PURPLE_TULIP = createKey("wandering_trader/emerald_purple_tulip");

    public static final ResourceKey<VillagerTrade> GUY_1_EMERALD_TERRACOTTA = createKey("guy/1/emerald_terracotta");
    public static final ResourceKey<VillagerTrade> GUY_1_EMERALD_RED_TERRACOTTA = createKey("guy/1/emerald_red_terracotta");
    public static final ResourceKey<VillagerTrade> GUY_1_EMERALD_YELLOW_TERRACOTTA = createKey("guy/1/emerald_yellow_terracotta");
    public static final ResourceKey<VillagerTrade> GUY_1_EMERALD_GREEN_TERRACOTTA = createKey("guy/1/emerald_green_terracotta");
    public static final ResourceKey<VillagerTrade> GUY_1_EMERALD_BLUE_TERRACOTTA = createKey("guy/1/emerald_blue_terracotta");
    public static final ResourceKey<VillagerTrade> GUY_1_EMERALD_LIGHT_BLUE_TERRACOTTA = createKey("guy/1/emerald_light_blueterracotta");
    public static final ResourceKey<VillagerTrade> GUY_2_EMERALD_BRICKS = createKey("guy/2/emerald_bricks");
    public static final ResourceKey<VillagerTrade> GUY_2_EMERALD_TUFF = createKey("guy/2/emerald_tuff");
    public static final ResourceKey<VillagerTrade> GUY_3_EMERALD_STONE = createKey("guy/3/emerald_stone");
    public static final ResourceKey<VillagerTrade> GUY_3_EMERALD_COBBLED_DEEPSLATE = createKey("guy/3/emerald_cobbled_deepslate");
    public static final ResourceKey<VillagerTrade> GUY_4_EMERALD_GOOFY_DISC = createKey("guy/4/emerald_goofy_disc");

    public static final ResourceKey<VillagerTrade> FLORIST_1_EMERALD_ORANGE_TULIP = createKey("florist/1/emerald_orange_tulip");
    public static final ResourceKey<VillagerTrade> FLORIST_1_EMERALD_YELLOW_TULIP = createKey("florist/1/emerald_yellow_tulip");
    public static final ResourceKey<VillagerTrade> FLORIST_1_EMERALD_PURPLE_TULIP = createKey("florist/1/emerald_purple_tulip");
    public static final ResourceKey<VillagerTrade> FLORIST_1_EMERALD_RED_TULIP = createKey("florist/1/emerald_red_tulip");
    public static final ResourceKey<VillagerTrade> FLORIST_1_EMERALD_WHITE_TULIP = createKey("florist/1/emerald_white_tulip");
    public static final ResourceKey<VillagerTrade> FLORIST_1_EMERALD_PINK_TULIP = createKey("florist/1/emerald_pink_tulip");

    public static void bootstrap(BootstrapContext<VillagerTrade> context) {
        context.register(WANDERING_TRADER_EMERALD_PUFFER_TRIM, new VillagerTrade(
                new TradeCost(Items.EMERALD, 16),
                new ItemStackTemplate(ModItems.PUFFER_ARMOR_TRIM),
                1, 67, 0.075f,
                Optional.empty(), List.of()));
        context.register(WANDERING_TRADER_EMERALD_PURPLE_TULIP, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(Item.byBlock(ModBlocks.PURPLE_TULIP)),
                12, 67, 0.05f,
                Optional.empty(), List.of()));
        context.register(WANDERING_TRADER_EMERALD_YELLOW_TULIP, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(Item.byBlock(ModBlocks.YELLOW_TULIP)),
                12, 67, 0.05f,
                Optional.empty(), List.of()));
//------------------------------------------------------------------------------------------------------------------

        context.register(GUY_1_EMERALD_TERRACOTTA, new VillagerTrade(
                new TradeCost(Items.EMERALD, 3),
                new ItemStackTemplate(Item.byBlock(Blocks.TERRACOTTA), 24),
                5, 3, 0.075f,
                Optional.empty(), List.of()));
        context.register(GUY_1_EMERALD_LIGHT_BLUE_TERRACOTTA, new VillagerTrade(
                new TradeCost(Items.EMERALD, 3),
                new ItemStackTemplate(Item.byBlock(Blocks.LIGHT_BLUE_TERRACOTTA), 24),
                5, 3, 0.075f,
                Optional.empty(), List.of()));
        context.register(GUY_1_EMERALD_BLUE_TERRACOTTA, new VillagerTrade(
                new TradeCost(Items.EMERALD, 3),
                new ItemStackTemplate(Item.byBlock(Blocks.BLUE_TERRACOTTA), 24),
                5, 3, 0.075f,
                Optional.empty(), List.of()));
        context.register(GUY_1_EMERALD_RED_TERRACOTTA, new VillagerTrade(
                new TradeCost(Items.EMERALD, 3),
                new ItemStackTemplate(Item.byBlock(Blocks.RED_TERRACOTTA), 24),
                5, 3, 0.075f,
                Optional.empty(), List.of()));
        context.register(GUY_1_EMERALD_GREEN_TERRACOTTA, new VillagerTrade(
                new TradeCost(Items.EMERALD, 3),
                new ItemStackTemplate(Item.byBlock(Blocks.GREEN_TERRACOTTA), 24),
                5, 3, 0.075f,
                Optional.empty(), List.of()));
        context.register(GUY_1_EMERALD_YELLOW_TERRACOTTA, new VillagerTrade(
                new TradeCost(Items.EMERALD, 3),
                new ItemStackTemplate(Item.byBlock(Blocks.YELLOW_TERRACOTTA), 24),
                5, 3, 0.075f,
                Optional.empty(), List.of()));

        context.register(GUY_2_EMERALD_BRICKS, new VillagerTrade(
                new TradeCost(Items.EMERALD, 3),
                new ItemStackTemplate(Item.byBlock(Blocks.BRICKS), 24),
                6, 8, 0.075f,
                Optional.empty(), List.of()));
        context.register(GUY_2_EMERALD_TUFF, new VillagerTrade(
                new TradeCost(Items.EMERALD, 3),
                new ItemStackTemplate(Item.byBlock(Blocks.TUFF), 24),
                4, 9, 0.075f,
                Optional.empty(), List.of()));

        context.register(GUY_3_EMERALD_STONE, new VillagerTrade(
                new TradeCost(Items.EMERALD, 2),
                new ItemStackTemplate(Item.byBlock(Blocks.STONE), 24),
                7, 13, 0.075f,
                Optional.empty(), List.of()));
        context.register(GUY_3_EMERALD_COBBLED_DEEPSLATE, new VillagerTrade(
                new TradeCost(Items.EMERALD, 4),
                new ItemStackTemplate(Item.byBlock(Blocks.COBBLED_DEEPSLATE), 24),
                5, 13, 0.075f,
                Optional.empty(), List.of()));

        context.register(GUY_4_EMERALD_GOOFY_DISC, new VillagerTrade(
                new TradeCost(Items.EMERALD, 67),
                new ItemStackTemplate(ModItems.POMMES_ROT_WEISS_DISC, 1),
                1, 67, 0.075f,
                Optional.empty(), List.of()));
//--------------------------------------------------------------------------------------------------------
        context.register(FLORIST_1_EMERALD_ORANGE_TULIP, new VillagerTrade(
                new TradeCost(Items.EMERALD, 2),
                new ItemStackTemplate(Item.byBlock(Blocks.ORANGE_TULIP), 8),
                5, 3, 0.075f,
                Optional.empty(), List.of()));
        context.register(FLORIST_1_EMERALD_WHITE_TULIP, new VillagerTrade(
                new TradeCost(Items.EMERALD, 2),
                new ItemStackTemplate(Item.byBlock(Blocks.WHITE_TULIP), 8),
                5, 3, 0.075f,
                Optional.empty(), List.of()));
        context.register(FLORIST_1_EMERALD_RED_TULIP, new VillagerTrade(
                new TradeCost(Items.EMERALD, 2),
                new ItemStackTemplate(Item.byBlock(Blocks.RED_TULIP), 8),
                5, 3, 0.075f,
                Optional.empty(), List.of()));
        context.register(FLORIST_1_EMERALD_PINK_TULIP, new VillagerTrade(
                new TradeCost(Items.EMERALD, 2),
                new ItemStackTemplate(Item.byBlock(Blocks.PINK_TULIP), 8),
                5, 3, 0.075f,
                Optional.empty(), List.of()));
        context.register(FLORIST_1_EMERALD_PURPLE_TULIP, new VillagerTrade(
                new TradeCost(Items.EMERALD, 2),
                new ItemStackTemplate(Item.byBlock(ModBlocks.PURPLE_TULIP), 8),
                5, 3, 0.075f,
                Optional.empty(), List.of()));
        context.register(FLORIST_1_EMERALD_YELLOW_TULIP, new VillagerTrade(
                new TradeCost(Items.EMERALD, 2),
                new ItemStackTemplate(Item.byBlock(ModBlocks.YELLOW_TULIP), 8),
                5, 3, 0.075f,
                Optional.empty(), List.of()));


    }

    private static ResourceKey<VillagerTrade> createKey(String name) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, name));
    }
}
