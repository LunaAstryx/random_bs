package lunaastryx.random_bs.datagen.langProvider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class RandomBSGermanLangProvider extends FabricLanguageProvider {
    public RandomBSGermanLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "de_de", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {

        translationBuilder.add("item.random_bs.golden_nether_star", "Goldener Nether Stern");
        translationBuilder.add("item.random_bs.puffer_armor_trim_smithing_template","Kugelfisch-Rüstungbesatz");
        translationBuilder.add("itemTooltip.random_bs.puffer_trim.tooltip", "Schmiedevorlage");

        translationBuilder.add("item.random_bs.staff_of_homa", "Homa-Stab");
        translationBuilder.add("item.random_bs.electric_guitar", "Elektrische Gitarre");
        translationBuilder.add("item.random_bs.baguette", "Baguette");

        translationBuilder.add("block.random_bs.yellow_tulip", "Gelbe Tulpe");
        translationBuilder.add("block.random_bs.purple_tulip", "Lila Tulpe");

        translationBuilder.add("creativetab.random_bs", "Zufälliger Krimkram");
    }
}
