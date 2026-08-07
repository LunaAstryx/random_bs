package lunaastryx.random_bs.villager;

import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import lunaastryx.random_bs.RandomBS;
import lunaastryx.random_bs.datagen.misc.villager.ModTradeSets;
import lunaastryx.random_bs.sounds.ModSounds;
import lunaastryx.random_bs.tags.ModTags;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PoiHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.villager.VillagerProfession;
import net.minecraft.world.item.trading.TradeSet;
import net.minecraft.world.level.block.Blocks;

public class ModVillagers {
    public static final ResourceKey<PoiType> GUY_POI_KEY = ResourceKey.create(Registries.POINT_OF_INTEREST_TYPE,
            Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, "guy_poi"));
    public static final PoiType GUY_POI = PoiHelper.register(Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, "guy_poi"),
            1, 1, Blocks.TERRACOTTA);
    public static final VillagerProfession GUY = createVillagerProfession("guy", "Guy", GUY_POI_KEY,
            ModSounds.YUMMY, Int2ObjectMap.ofEntries(
                    Int2ObjectMap.entry(1, ModTradeSets.GUY_LEVEL_1),
                    Int2ObjectMap.entry(2, ModTradeSets.GUY_LEVEL_2),
                    Int2ObjectMap.entry(3, ModTradeSets.GUY_LEVEL_3),
                    Int2ObjectMap.entry(4, ModTradeSets.GUY_LEVEL_4)
            ));

    public static final ResourceKey<PoiType> FLORIST_POI_KEY = ResourceKey.create(Registries.POINT_OF_INTEREST_TYPE,
            Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, "florist_poi"));
    public static final PoiType FLORIST_POI = PoiHelper.register(Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, "florist_poi"),
            1, 1, Blocks.DECORATED_POT);
    public static final VillagerProfession FLORIST = createVillagerProfession("florist", "Florist", FLORIST_POI_KEY,
            ModSounds.NOMNOMNOM, Int2ObjectMap.ofEntries(
                    Int2ObjectMap.entry(1, ModTradeSets.FLORIST_LEVEL_1)
            ));


    private static VillagerProfession createVillagerProfession(String name, String title, ResourceKey<PoiType> poi,
                                                               SoundEvent sound, Int2ObjectMap<ResourceKey<TradeSet>> map) {
        return Registry.register(BuiltInRegistries.VILLAGER_PROFESSION, Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, name), new VillagerProfession(
                Component.literal(title), holder -> holder.is(poi), holder -> holder.is(poi),
                ImmutableSet.of(), ImmutableSet.of(), sound, map));
    }

    public static void registerModVillagers() {
        RandomBS.LOGGER.info("Registering Mod Villagers for " + RandomBS.MOD_ID);
    }
}
