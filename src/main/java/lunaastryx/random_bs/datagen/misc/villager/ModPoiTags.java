package lunaastryx.random_bs.datagen.misc.villager;

import lunaastryx.random_bs.villager.ModVillagers;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.PoiTypeTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.world.entity.ai.village.poi.PoiType;

import java.util.concurrent.CompletableFuture;

public class ModPoiTags extends FabricTagsProvider<PoiType> {



    public ModPoiTags(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, Registries.POINT_OF_INTEREST_TYPE, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        getOrCreateRawBuilder(PoiTypeTags.ACQUIRABLE_JOB_SITE)
                .add(TagEntry.element(ModVillagers.FLORIST_POI_KEY.identifier()))
                .add(TagEntry.element(ModVillagers.GUY_POI_KEY.identifier()));

    }
}
