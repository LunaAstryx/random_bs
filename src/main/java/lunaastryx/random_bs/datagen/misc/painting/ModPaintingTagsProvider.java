package lunaastryx.random_bs.datagen.misc.painting;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.PaintingVariantTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;

import java.util.concurrent.CompletableFuture;

public class ModPaintingTagsProvider extends FabricTagsProvider<PaintingVariant> {
    public ModPaintingTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, Registries.PAINTING_VARIANT, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateRawBuilder(PaintingVariantTags.PLACEABLE)
                .add(TagEntry.element(ModPaintings.VICTORY_KEY.identifier()));
    }
}
