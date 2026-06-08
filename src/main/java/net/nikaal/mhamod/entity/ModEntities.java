package net.nikaal.mhamod.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nikaal.mhamod.MHAMod;
import net.nikaal.mhamod.entity.client.SymetrixEntityRenderer;
import net.nikaal.mhamod.entity.custom.*;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, MHAMod.MOD_ID);

    public static final Supplier<EntityType<AelwynEntity>> AELWYN_ENTITY =
            ENTITY_TYPES.register("aelwyn_entity", () -> EntityType.Builder.of(AelwynEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("aelwyn_entity"));

    public static final Supplier<EntityType<ConjonctivixEntity>> CONJONCTIVIX_ENTITY =
            ENTITY_TYPES.register("conjonctivix_entity", () -> EntityType.Builder.of(ConjonctivixEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("conjonctivix_entity"));

    public static final Supplier<EntityType<DeezEntity>> DEEZ_ENTITY =
            ENTITY_TYPES.register("deez_entity", () -> EntityType.Builder.of(DeezEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("deez_entity"));

    public static final Supplier<EntityType<HeavenlordEntity>> HEAVENLORD_ENTITY =
            ENTITY_TYPES.register("heavenlord_entity", () -> EntityType.Builder.of(HeavenlordEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("heavenlord_entity"));

    public static final Supplier<EntityType<Iplay4youEntity>> IPLAY4YOU_ENTITY =
            ENTITY_TYPES.register("iplay4you_entity", () -> EntityType.Builder.of(Iplay4youEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("iplay4you_entity"));

    public static final Supplier<EntityType<JolirougeEntity>> JOLIROUGE_ENTITY =
            ENTITY_TYPES.register("jolirouge_entity", () -> EntityType.Builder.of(JolirougeEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("jolirouge_entity"));

    public static final Supplier<EntityType<LudolikEntity>> LUDOLIK_ENTITY =
            ENTITY_TYPES.register("ludolik_entity", () -> EntityType.Builder.of(LudolikEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("ludolik_entity"));

    public static final Supplier<EntityType<MaestrommEntity>> MAESTROMM_ENTITY =
            ENTITY_TYPES.register("maestromm_entity", () -> EntityType.Builder.of(MaestrommEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("maestromm_entity"));

    public static final Supplier<EntityType<MikefraiseEntity>> MIKEFRAISE_ENTITY =
            ENTITY_TYPES.register("mikefraise_entity", () -> EntityType.Builder.of(MikefraiseEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("mikefraise_entity"));

    public static final Supplier<EntityType<MisterxEntity>> MISTERX_ENTITY =
            ENTITY_TYPES.register("misterx_entity", () -> EntityType.Builder.of(MisterxEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("misterx_entity"));

    public static final Supplier<EntityType<NicodelpraEntity>> NICODELPRA_ENTITY =
            ENTITY_TYPES.register("nicodelpra_entity", () -> EntityType.Builder.of(NicodelpraEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("nicodelpra_entity"));

    public static final Supplier<EntityType<PetlefeuEntity>> PETLEFEU_ENTITY =
            ENTITY_TYPES.register("petlefeu_entity", () -> EntityType.Builder.of(PetlefeuEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("petlefeu_entity"));

    public static final Supplier<EntityType<PimpryEntity>> PIMPRY_ENTITY =
            ENTITY_TYPES.register("pimpry_entity", () -> EntityType.Builder.of(PimpryEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("pimpry_entity"));

    public static final Supplier<EntityType<RorshakEntity>> RORSHAK_ENTITY =
            ENTITY_TYPES.register("rorshak_entity", () -> EntityType.Builder.of(RorshakEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("rorshak_entity"));

    public static final Supplier<EntityType<SoraxEntity>> SORAX_ENTITY =
            ENTITY_TYPES.register("sorax_entity", () -> EntityType.Builder.of(SoraxEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("sorax_entity"));

    public static final Supplier<EntityType<SymetrixEntity>> SYMETRIX_ENTITY =
            ENTITY_TYPES.register("symetrix_entity", () -> EntityType.Builder.of(SymetrixEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("symetrix_entity"));

    public static final Supplier<EntityType<ToadyEntity>> TOADY_ENTITY =
            ENTITY_TYPES.register("toady_entity", () -> EntityType.Builder.of(ToadyEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("toady_entity"));

    public static final Supplier<EntityType<VayleEntity>> VAYLE_ENTITY =
            ENTITY_TYPES.register("vayle_entity", () -> EntityType.Builder.of(VayleEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("vayle_entity"));

    public static final Supplier<EntityType<NikaalEntity>> NIKAAL_ENTITY =
            ENTITY_TYPES.register("nikaal_entity", () -> EntityType.Builder.of(NikaalEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("nikaal_entity"));

    public static final Supplier<EntityType<CocolyneEntity>> COCOLYNE_ENTITY =
            ENTITY_TYPES.register("cocolyne_entity", () -> EntityType.Builder.of(CocolyneEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("cocolyne_entity"));

    public static final Supplier<EntityType<LaakinEntity>> LAAKIN_ENTITY =
            ENTITY_TYPES.register("laakin_entity", () -> EntityType.Builder.of(LaakinEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.8F).build("laakin_entity"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
