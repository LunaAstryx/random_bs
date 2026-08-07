package lunaastryx.random_bs.item;

import lunaastryx.random_bs.RandomBS;
import lunaastryx.random_bs.datagen.misc.musicDisc.ModJukeBoxSong;
import lunaastryx.random_bs.sounds.ModSounds;
import lunaastryx.random_bs.util.BaguetteItem;
import lunaastryx.random_bs.util.PufferTemplateItem;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.trim.TrimMaterial;

import java.awt.*;
import java.util.function.Function;

public class ModItems {

    public static final Item GOLDEN_NETHER_STAR = registerItem("golden_nether_star",
            Item::new, new Item.Properties().fireResistant());

    public static final Item POMMES_ROT_WEISS_DISC = registerItem("pommes_rot_weiss_music_disc",
            Item::new, new Item.Properties().jukeboxPlayable(ModJukeBoxSong.POMMES_ROT_WEISS_KEY).stacksTo(1));

    public static final Item PUFFER_ARMOR_TRIM = registerItem("puffer_armor_trim_smithing_template",
            SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));

    public static final Item ELECTRIC_GUITAR = registerItem("electric_guitar",
            Item::new, new Item.Properties().fireResistant()
                    .axe(ModToolMaterials.ELECTRIC_GUITAR_TOOL_MATERIAL,
                            0f, -2.67f));

    public static final Item STAFF_OF_HOMA = registerItem("staff_of_homa",
            Item::new,new Item.Properties().fireResistant().spear(ModToolMaterials.STAFF_OF_HOMA,
                    1.3F, 1.5F, 0.3F, 3F, 9.0F,
                    5.5F, 5.1F, 9F, 4.6F));

    public static final Item BAGUETTE = registerItem("baguette",
            BaguetteItem::new, new Item.Properties().fireResistant()
                    .sword(ModToolMaterials.BAGUETTE, 0, -2.4f));

    /*public static final Item LACE = registerItem("lace",
            MaceItem::new, new Item.Properties()
                    .rarity(Rarity.EPIC).durability(6769).fireproof()
                    .component(DataComponents.TOOL, MaceItem.createToolProperties())
                    .repairable(ModItems.GOLDEN_NETHER_STAR)
                    .attributes(MaceItem.createAttributes()).enchantable(24)
                    .component(DataComponents.WEAPON, new Weapon(1)));
*/
    public static <T extends Item> T registerItem(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings, Component... tooltip) {
        // Create the item key.
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM,
                Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, name));

        // Create the item instance.
        T item = itemFactory.apply(settings.setId(itemKey));

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }
    public static void registerModItems() {
        RandomBS.LOGGER.info("Registering Mod Items for" + RandomBS.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(ModItems.GOLDEN_NETHER_STAR);
            output.accept(ModItems.PUFFER_ARMOR_TRIM);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(output -> {
            output.accept(ModItems.BAGUETTE);
            output.accept(ModItems.ELECTRIC_GUITAR);
            output.accept(ModItems.STAFF_OF_HOMA);
        });
    }
}
