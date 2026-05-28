package lunaastryx.random_bs.item;

import lunaastryx.random_bs.tags.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {
    public static final ToolMaterial ELECTRIC_GUITAR_TOOL_MATERIAL =
            new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
                    2467, 9f, 8f, 17,
                    ItemTags.PLANKS);

    public static final ToolMaterial BAGUETTE =
            new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
                    6720, 6.7f, 7f, 19,
                    ModTags.Items.REPAIRS_BAGUETTE);
}
