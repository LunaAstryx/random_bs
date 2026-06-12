package lunaastryx.random_bs.datagen;

import lunaastryx.random_bs.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootSubProvider {
    public ModLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.YELLOW_TULIP);
        dropSelf(ModBlocks.PURPLE_TULIP);

        dropPottedContents(ModBlocks.POTTED_YELLOW_TULIP);
        dropPottedContents(ModBlocks.POTTED_PURPLE_TULIP);
    }
}
