package lunaastryx.random_bs;

import lunaastryx.random_bs.datagen.ModBlockTagsProvider;
import lunaastryx.random_bs.datagen.ModItemTagsProvider;
import lunaastryx.random_bs.datagen.ModLootTableProvider;
import lunaastryx.random_bs.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class RandomBSDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModLootTableProvider::new);
	}
}
