package lunaastryx.random_bs.datagen;

import lunaastryx.random_bs.item.ModItems;
import lunaastryx.random_bs.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(Items.COPPER_INGOT);

        valueLookupBuilder(ItemTags.SWORDS)
                .add(ModItems.ELECTRIC_GUITAR)
                .add(ModItems.BAGUETTE);

        valueLookupBuilder(ItemTags.AXES)
                .add(ModItems.ELECTRIC_GUITAR);

        valueLookupBuilder(ItemTags.SPEARS)
                .add(ModItems.STAFF_OF_HOMA);

        valueLookupBuilder(ModTags.Items.REPAIRS_BAGUETTE)
                .add(Items.BREAD);

        valueLookupBuilder(ModTags.Items.REPAIRS_STAFF_OF_HOMA)
                .add(Items.REDSTONE);
    }
}
