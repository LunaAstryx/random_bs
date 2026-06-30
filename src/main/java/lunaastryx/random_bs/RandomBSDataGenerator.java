package lunaastryx.random_bs;

import lunaastryx.random_bs.datagen.*;
import lunaastryx.random_bs.datagen.langProvider.RandomBSEnglishLangProvider;
import lunaastryx.random_bs.datagen.langProvider.RandomBSGermanLangProvider;
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
		pack.addProvider(ModRecipeProvider::new);

		pack.addProvider(RandomBSEnglishLangProvider::new);
		pack.addProvider(RandomBSGermanLangProvider::new);
	}
}
