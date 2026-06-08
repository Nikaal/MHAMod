package net.nikaal.mhamod.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.nikaal.mhamod.MHAMod;
import net.nikaal.mhamod.entity.ModEntities;

import java.util.List;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> SPAWN_AELWYN_ENTITY = registerKey("spawn_aelwyn_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_CONJONCTIVIX_ENTITY = registerKey("spawn_conjonctivix_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_DEEZ_ENTITY = registerKey("spawn_deez_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_HEAVENLORD_ENTITY = registerKey("spawn_heavenlord_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_IPLAY4YOU_ENTITY = registerKey("spawn_iplay4you_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_JOLIROUGE_ENTITY = registerKey("spawn_jolirouge_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_LUDOLIK_ENTITY = registerKey("spawn_ludolik_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_MAESTROMM_ENTITY = registerKey("spawn_maestromm_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_MIKEFRAISE_ENTITY = registerKey("spawn_mikefraise_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_MISTERX_ENTITY = registerKey("spawn_misterx_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_NICODELPRA_ENTITY = registerKey("spawn_nicodelpra_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_PETLEFEU_ENTITY = registerKey("spawn_petlefeu_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_PIMPRY_ENTITY = registerKey("spawn_pimpry_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_RORSHAK_ENTITY = registerKey("spawn_rorshak_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_SORAX_ENTITY = registerKey("spawn_sorax_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_SYMETRIX_ENTITY = registerKey("spawn_symetrix_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_TOADY_ENTITY = registerKey("spawn_toady_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_VAYLE_ENTITY = registerKey("spawn_vayle_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_NIKAAL_ENTITY = registerKey("spawn_nikaal_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_COCOLYNE_ENTITY = registerKey("spawn_cocolyne_entity");
    public static final ResourceKey<BiomeModifier> SPAWN_LAAKIN_ENTITY = registerKey("spawn_laakin_entity");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var biomes = context.lookup(Registries.BIOME);
        var overworld = context.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD);

        context.register(SPAWN_AELWYN_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.AELWYN_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_CONJONCTIVIX_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.CONJONCTIVIX_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_DEEZ_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.DEEZ_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_HEAVENLORD_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.HEAVENLORD_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_IPLAY4YOU_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.IPLAY4YOU_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_JOLIROUGE_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.JOLIROUGE_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_LUDOLIK_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.LUDOLIK_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_MAESTROMM_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.MAESTROMM_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_MIKEFRAISE_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.MIKEFRAISE_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_MISTERX_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.MISTERX_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_NICODELPRA_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.NICODELPRA_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_PETLEFEU_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.PETLEFEU_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_PIMPRY_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.PIMPRY_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_RORSHAK_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.RORSHAK_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_SORAX_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.SORAX_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_SYMETRIX_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.SYMETRIX_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_TOADY_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.TOADY_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_VAYLE_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.VAYLE_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_NIKAAL_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.NIKAAL_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_COCOLYNE_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.COCOLYNE_ENTITY.get(), 10, 1, 1))
        ));
        context.register(SPAWN_LAAKIN_ENTITY, new BiomeModifiers.AddSpawnsBiomeModifier(
                overworld,
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.LAAKIN_ENTITY.get(), 10, 1, 1))
        ));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(MHAMod.MOD_ID, name));
    }
}
