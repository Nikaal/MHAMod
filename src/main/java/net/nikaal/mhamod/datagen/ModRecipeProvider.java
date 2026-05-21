package net.nikaal.mhamod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.nikaal.mhamod.item.ModItems;
import net.nikaal.mhamod.util.ModTags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BEARING.get())
                .pattern("III")
                .pattern("IGI")
                .pattern("III")
                .define('I', Items.IRON_NUGGET)
                .define('G', Items.GOLD_NUGGET)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CASING.get())
                .pattern(" I ")
                .pattern("I I")
                .pattern(" I ")
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CELL.get())
                .pattern("IRI")
                .pattern("IRI")
                .pattern("IRI")
                .define('I', Items.IRON_NUGGET)
                .define('R', Items.REDSTONE)
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAL.get())
                .pattern(" I ")
                .pattern("SSS")
                .define('I', Items.IRON_NUGGET)
                .define('S', ItemTags.WOODEN_SLABS)
                .unlockedBy("has_wooden_slab", has(ItemTags.WOODEN_SLABS))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GEAR.get())
                .pattern(" I ")
                .pattern("ISI")
                .pattern(" I ")
                .define('I', Items.IRON_NUGGET)
                .define('S', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LENS.get())
                .pattern("GGG")
                .define('G', Items.GLASS_PANE)
                .unlockedBy("has_glass", has(Items.GLASS))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NEEDLE.get())
                .pattern("G")
                .pattern("S")
                .pattern("G")
                .define('G', Items.GOLD_NUGGET)
                .define('S', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PIVOT.get())
                .pattern("I")
                .pattern("S")
                .pattern("I")
                .define('I', Items.IRON_NUGGET)
                .define('S', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SCREW.get())
                .pattern("I")
                .pattern("I")
                .define('I', Items.IRON_NUGGET)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ADVENTURER_COMPASS.get())
                .pattern("ELS")
                .pattern("DNP")
                .pattern("GCB")
                .define('B', ModItems.BEARING.get())
                .define('C', ModItems.CASING.get())
                .define('D', ModItems.DIAL.get())
                .define('E', ModItems.CELL.get())
                .define('G', ModItems.GEAR.get())
                .define('L', ModItems.LENS.get())
                .define('N', ModItems.NEEDLE.get())
                .define('P', ModItems.PIVOT.get())
                .define('S', ModItems.SCREW.get())
                .unlockedBy("has_compass_pieces", has(ModTags.Items.POTC_COMPASS_PIECES))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ENCODED_TREASURE_MAP.get())
                .pattern("CHA")
                .pattern("BIF")
                .pattern("GDE")
                .define('A', ModItems.MAP_PIECE_1.get())
                .define('B', ModItems.MAP_PIECE_2.get())
                .define('C', ModItems.MAP_PIECE_3.get())
                .define('D', ModItems.MAP_PIECE_4.get())
                .define('E', ModItems.MAP_PIECE_5.get())
                .define('F', ModItems.MAP_PIECE_6.get())
                .define('G', ModItems.MAP_PIECE_7.get())
                .define('H', ModItems.MAP_PIECE_8.get())
                .define('I', ModItems.MAP_PIECE_9.get())
                .unlockedBy("has_map_piece", has(ModTags.Items.POTC_MAP_PIECES))
                .save(recipeOutput);
    }
}
