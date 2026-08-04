package lunaastryx.random_bs;

import lunaastryx.random_bs.datagen.*;
import lunaastryx.random_bs.datagen.langProvider.RandomBSEnglishLangProvider;
import lunaastryx.random_bs.datagen.langProvider.RandomBSGermanLangProvider;
import lunaastryx.random_bs.datagen.misc.musicDisc.ModJukeBoxSong;
import lunaastryx.random_bs.datagen.misc.musicDisc.ModSoundsProvider;
import lunaastryx.random_bs.datagen.misc.painting.ModPaintingTagsProvider;
import lunaastryx.random_bs.datagen.misc.painting.ModPaintings;
import lunaastryx.random_bs.datagen.misc.villager.ModVillagerTradeTags;
import lunaastryx.random_bs.datagen.misc.villager.ModVillagerTrades;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class RandomBSDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModRegistryDataGenerator::new);

		pack.addProvider(ModPaintingTagsProvider::new);
		pack.addProvider(ModSoundsProvider::new);
		pack.addProvider(ModVillagerTradeTags::new);

		pack.addProvider(RandomBSEnglishLangProvider::new);
		pack.addProvider(RandomBSGermanLangProvider::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		registryBuilder.add(Registries.PAINTING_VARIANT,  ModPaintings::bootstrap);
		registryBuilder.add(Registries.JUKEBOX_SONG, ModJukeBoxSong::bootstrap);
		registryBuilder.add(Registries.VILLAGER_TRADE, ModVillagerTrades::bootstrap);

	}
}
