package com.lumagrade.datagen;

import com.lumagrade.block.BookshelfBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BookshelfBlocks.BOOKSHELF_SPRUCE)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .input('P', Blocks.SPRUCE_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.SPRUCE_PLANKS), conditionsFromItem(Items.BOOK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BookshelfBlocks.BOOKSHELF_ACACIA)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .input('P', Blocks.ACACIA_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.ACACIA_PLANKS), conditionsFromItem(Items.BOOK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BookshelfBlocks.BOOKSHELF_BIRCH)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .input('P', Blocks.BIRCH_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.BIRCH_PLANKS), conditionsFromItem(Items.BOOK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BookshelfBlocks.BOOKSHELF_CRIMSON)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .input('P', Blocks.CRIMSON_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.CRIMSON_PLANKS), conditionsFromItem(Items.BOOK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BookshelfBlocks.BOOKSHELF_DARK_OAK)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .input('P', Blocks.DARK_OAK_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.DARK_OAK_PLANKS), conditionsFromItem(Items.BOOK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BookshelfBlocks.BOOKSHELF_JUNGLE)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .input('P', Blocks.JUNGLE_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.JUNGLE_PLANKS), conditionsFromItem(Items.BOOK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BookshelfBlocks.BOOKSHELF_WARPED)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .input('P', Blocks.WARPED_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.WARPED_PLANKS), conditionsFromItem(Items.BOOK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BookshelfBlocks.BOOKSHELF_STONE)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .input('P', Blocks.STONE)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Items.BOOK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BookshelfBlocks.BOOKSHELF_MANGROVE)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .input('P', Blocks.MANGROVE_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.MANGROVE_PLANKS), conditionsFromItem(Items.BOOK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BookshelfBlocks.BOOKSHELF_CHERRY)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .input('P', Blocks.CHERRY_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.CHERRY_PLANKS), conditionsFromItem(Items.BOOK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BookshelfBlocks.BOOKSHELF_BAMBOO)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .input('P', Blocks.BAMBOO_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.BAMBOO_PLANKS), conditionsFromItem(Items.BOOK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BookshelfBlocks.BOOKSHELF_MOSSY_STONE)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .input('P', Blocks.MOSSY_COBBLESTONE)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.MOSSY_COBBLESTONE), conditionsFromItem(Items.BOOK))
                .offerTo(exporter);
    }
}
