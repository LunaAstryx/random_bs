package lunaastryx.random_bs.datagen.langProvider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class RandomBSEnglishLangProvider extends FabricLanguageProvider {
    public RandomBSEnglishLangProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        // Specifying en_us is optional, as it's the default language code
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {

        translationBuilder.add("item.random_bs.golden_nether_star", "Golden Nether Star");
        translationBuilder.add("item.random_bs.puffer_armor_trim_smithing_template","Puffer Armor Trim");
        translationBuilder.add("itemTooltip.random_bs.puffer_trim.tooltip", "Smithing Template");

        translationBuilder.add("item.random_bs.staff_of_homa", "Staff of Homer");
        translationBuilder.add("item.random_bs.electric_guitar", "Electric Guitar");
        translationBuilder.add("item.random_bs.baguette", "Baguette");

        translationBuilder.add("block.random_bs.yellow_tulip", "Yellow Tulip");
        translationBuilder.add("block.random_bs.purple_tulip", "Purple Tulip");

        translationBuilder.add("creativetab.random_bs", "Random BS");

    }
}
