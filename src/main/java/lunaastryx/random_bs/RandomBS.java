package lunaastryx.random_bs;

import lunaastryx.random_bs.block.ModBlocks;
import lunaastryx.random_bs.item.ModCreativeModeTabs;
import lunaastryx.random_bs.item.ModItems;
import lunaastryx.random_bs.sounds.ModSounds;
import lunaastryx.random_bs.tags.ModTags;
import lunaastryx.random_bs.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomBS implements ModInitializer {
	public static final String MOD_ID = "random_bs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModCreativeModeTabs.registerCreativeModeTabs();
		ModItems.registerModItems();

		ModBlocks.RegisterModBlocks();

		ModTags.registerModTags();

		ModSounds.registerModSounds();
		ModVillagers.registerModVillagers();
	}
}