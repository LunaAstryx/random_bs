package lunaastryx.random_bs.datagen.misc.musicDisc;

import lunaastryx.random_bs.RandomBS;
import lunaastryx.random_bs.sounds.ModSounds;
import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricSoundsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModSoundsProvider extends FabricSoundsProvider {
    public ModSoundsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registryLookup, SoundExporter exporter) {
        exporter.add(ModSounds.NOMNOMNOM, SoundTypeBuilder.of(ModSounds.NOMNOMNOM).sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, "nomnomnom"))));
        exporter.add(ModSounds.YUMMY, SoundTypeBuilder.of(ModSounds.YUMMY).sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, "yummy"))));

        exporter.add(ModSounds.POMMES_ROT_WEISS, SoundTypeBuilder.of(ModSounds.POMMES_ROT_WEISS.value())
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(RandomBS.MOD_ID, "pommes_rot_weiss")).stream(true)));
    }

    @Override
    public String getName() {
        return "lol";
    }
}
