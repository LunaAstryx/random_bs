package lunaastryx.random_bs.datagen.misc.musicDisc;

import lunaastryx.random_bs.RandomBS;
import lunaastryx.random_bs.sounds.ModSounds;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Util;
import net.minecraft.world.item.JukeboxSong;

public class ModJukeBoxSong {
    public static final ResourceKey<JukeboxSong> POMMES_ROT_WEISS_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, "pommes_rot_weiss"));

    public static void bootstrap(BootstrapContext<JukeboxSong> context) {
        register(context, POMMES_ROT_WEISS_KEY, ModSounds.POMMES_ROT_WEISS, 61, 7);
    }

    private static void register(BootstrapContext<JukeboxSong> context, ResourceKey<JukeboxSong> key,
                                 Holder.Reference<SoundEvent> soundEvent, int lenghtInSeconds, int comparatorOutput) {
        context.register(key, new JukeboxSong(soundEvent,
                Component.translatable(Util.makeDescriptionId("jukebox_song", key.identifier())), lenghtInSeconds, comparatorOutput));
    }
}
