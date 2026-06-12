package lunaastryx.random_bs.tags;

import lunaastryx.random_bs.RandomBS;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK,
                    Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> REPAIRS_BAGUETTE = createTag("repairs_baguette");

        public static final TagKey<Item> REPAIRS_STAFF_OF_HOMA = createTag("repairs_staff_of_homa");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM,
                    Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, name));
        }
    }

    public static void registerModTags() {
        RandomBS.LOGGER.info("Registering custom Tags for " + RandomBS.MOD_ID);
    }
}
