package lunaastryx.random_bs.tags;

import lunaastryx.random_bs.RandomBS;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.trading.VillagerTrade;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {


        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> REPAIRS_BAGUETTE = createTag("repairs_baguette");

        public static final TagKey<Item> REPAIRS_STAFF_OF_HOMA = createTag("repairs_staff_of_homa");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, name));
        }
    }

    public static class Trades {
        public static final TagKey<VillagerTrade> GUY_LEVEL_1 = createTag("guy/level_1");
        public static final TagKey<VillagerTrade> GUY_LEVEL_2 = createTag("guy/level_2");
        public static final TagKey<VillagerTrade> GUY_LEVEL_3 = createTag("guy/level_3");
        public static final TagKey<VillagerTrade> GUY_LEVEL_4 = createTag("guy/level_4");

        public static final TagKey<VillagerTrade> FLORIST_LEVEL_1 = createTag("florist/level_1");

        private static TagKey<VillagerTrade> createTag(String name) {
            return TagKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, name));
        }
    }

    public static void registerModTags() {
        RandomBS.LOGGER.info("Registering custom Tags for " + RandomBS.MOD_ID);
    }
}
