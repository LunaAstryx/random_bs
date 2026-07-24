package lunaastryx.random_bs.sounds;

import lunaastryx.random_bs.RandomBS;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class ModSounds {
    private void CustomSounds() {
        // private empty constructor to avoid accidental instantiation
    }

    // YUMMY is the name of the custom sound event
    // and is called in the mod to use the custom sound
    public static final SoundEvent YUMMY = registerSound("yummy");
    public static final SoundEvent NOMNOMNOM = registerSound("nomnomnom");

    public static final Holder.Reference<SoundEvent> POMMES_ROT_WEISS = registerJukeboxSong("pommes_rot_weiss");

    // actual registration of all the custom SoundEvents
    private static SoundEvent registerSound(String id) {
        Identifier identifier = Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, id);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, identifier, SoundEvent.createVariableRangeEvent(identifier));
    }

    private static Holder.Reference<SoundEvent> registerJukeboxSong(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, name);
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerModSounds() {
        RandomBS.LOGGER.info("Registering Mod Sounds for " + RandomBS.MOD_ID);
    }
}
