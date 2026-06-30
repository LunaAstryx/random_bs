package lunaastryx.random_bs.block;

import lunaastryx.random_bs.RandomBS;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

public class ModBlocks {

    public static final Block PURPLE_TULIP = registerBlock("purple_tulip",
            properties -> new FlowerBlock(MobEffects.RESISTANCE, 7f , properties.noCollision()
                    .sound(SoundType.GRASS).instabreak().offsetType(BlockBehaviour.OffsetType.XZ)
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block POTTED_PURPLE_TULIP = registerBlock("potted_purple_tulip",
            p -> new FlowerPotBlock(PURPLE_TULIP, p));

    public static final Block YELLOW_TULIP = registerBlock("yellow_tulip",
            properties -> new FlowerBlock(MobEffects.HASTE, 6f , properties.noCollision()
                    .sound(SoundType.GRASS).instabreak().offsetType(BlockBehaviour.OffsetType.XZ)
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block POTTED_YELLOW_TULIP = registerBlock("potted_yellow_tulip",
            p -> new FlowerPotBlock(YELLOW_TULIP, p));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK,
                        Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK,
                Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM,
                                Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, name)))));
    }

    public static void RegisterModBlocks() {
        RandomBS.LOGGER.info("Registering Blocks for " + RandomBS.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(output -> {
            output.accept(ModBlocks.YELLOW_TULIP);
            output.accept(ModBlocks.PURPLE_TULIP);
        });
    }
}
