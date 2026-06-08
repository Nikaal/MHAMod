package net.nikaal.mhamod.event;

import net.minecraft.world.entity.SpawnPlacementType;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.nikaal.mhamod.MHAMod;
import net.nikaal.mhamod.entity.ModEntities;
import net.nikaal.mhamod.entity.custom.*;

@EventBusSubscriber(modid = MHAMod.MOD_ID)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.AELWYN_ENTITY.get(), AelwynEntity.createAttributes().build());
        event.put(ModEntities.CONJONCTIVIX_ENTITY.get(), ConjonctivixEntity.createAttributes().build());
        event.put(ModEntities.DEEZ_ENTITY.get(), DeezEntity.createAttributes().build());
        event.put(ModEntities.HEAVENLORD_ENTITY.get(), HeavenlordEntity.createAttributes().build());
        event.put(ModEntities.IPLAY4YOU_ENTITY.get(), Iplay4youEntity.createAttributes().build());
        event.put(ModEntities.JOLIROUGE_ENTITY.get(), JolirougeEntity.createAttributes().build());
        event.put(ModEntities.LUDOLIK_ENTITY.get(), LudolikEntity.createAttributes().build());
        event.put(ModEntities.MAESTROMM_ENTITY.get(), MaestrommEntity.createAttributes().build());
        event.put(ModEntities.MIKEFRAISE_ENTITY.get(), MikefraiseEntity.createAttributes().build());
        event.put(ModEntities.MISTERX_ENTITY.get(), MisterxEntity.createAttributes().build());
        event.put(ModEntities.NICODELPRA_ENTITY.get(), NicodelpraEntity.createAttributes().build());
        event.put(ModEntities.PETLEFEU_ENTITY.get(), PetlefeuEntity.createAttributes().build());
        event.put(ModEntities.PIMPRY_ENTITY.get(), PimpryEntity.createAttributes().build());
        event.put(ModEntities.RORSHAK_ENTITY.get(), RorshakEntity.createAttributes().build());
        event.put(ModEntities.SORAX_ENTITY.get(), SoraxEntity.createAttributes().build());
        event.put(ModEntities.SYMETRIX_ENTITY.get(), SymetrixEntity.createAttributes().build());
        event.put(ModEntities.TOADY_ENTITY.get(), ToadyEntity.createAttributes().build());
        event.put(ModEntities.VAYLE_ENTITY.get(), VayleEntity.createAttributes().build());
        event.put(ModEntities.NIKAAL_ENTITY.get(), NikaalEntity.createAttributes().build());
        event.put(ModEntities.COCOLYNE_ENTITY.get(), CocolyneEntity.createAttributes().build());
        event.put(ModEntities.LAAKIN_ENTITY.get(), LaakinEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(RegisterSpawnPlacementsEvent event) {
        event.register(ModEntities.AELWYN_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.CONJONCTIVIX_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.DEEZ_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.HEAVENLORD_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.IPLAY4YOU_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.JOLIROUGE_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.LUDOLIK_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.MAESTROMM_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.MIKEFRAISE_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.MISTERX_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.NICODELPRA_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.PETLEFEU_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.PIMPRY_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.RORSHAK_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.SORAX_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.SYMETRIX_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.TOADY_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.VAYLE_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.NIKAAL_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.COCOLYNE_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.LAAKIN_ENTITY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ((entityType, serverLevelAccessor, mobSpawnType, blockPos, randomSource) -> true),
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
    }
}
