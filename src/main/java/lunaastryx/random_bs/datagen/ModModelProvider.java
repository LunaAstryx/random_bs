package lunaastryx.random_bs.datagen;

import lunaastryx.random_bs.block.ModBlocks;
import lunaastryx.random_bs.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createPlant(ModBlocks.PURPLE_TULIP, ModBlocks.POTTED_PURPLE_TULIP, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createPlant(ModBlocks.YELLOW_TULIP, ModBlocks.POTTED_YELLOW_TULIP, BlockModelGenerators.PlantType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.GOLDEN_NETHER_STAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PUFFER_ARMOR_TRIM, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.declareCustomModelItem(ModItems.ELECTRIC_GUITAR);
        itemModelGenerators.declareCustomModelItem(ModItems.BAGUETTE);
        itemModelGenerators.generateSpear(ModItems.STAFF_OF_HOMA);
    }
}
