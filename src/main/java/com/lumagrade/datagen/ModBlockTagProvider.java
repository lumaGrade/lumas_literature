package com.lumagrade.datagen;

import com.lumagrade.Lumas_literature;
import com.lumagrade.block.BookshelfBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.AXE_MINEABLE)
                .add(BookshelfBlocks.BOOKSHELF_SPRUCE)
                .add(BookshelfBlocks.BOOKSHELF_ACACIA)
                .add(BookshelfBlocks.BOOKSHELF_BIRCH)
                .add(BookshelfBlocks.BOOKSHELF_CRIMSON)
                .add(BookshelfBlocks.BOOKSHELF_DARK_OAK)
                .add(BookshelfBlocks.BOOKSHELF_JUNGLE)
                .add(BookshelfBlocks.BOOKSHELF_WARPED)
                .add(BookshelfBlocks.BOOKSHELF_STONE)
                .add(BookshelfBlocks.BOOKSHELF_MANGROVE)
                .add(BookshelfBlocks.BOOKSHELF_CHERRY)
                .add(BookshelfBlocks.BOOKSHELF_BAMBOO)
                .add(BookshelfBlocks.BOOKSHELF_MOSSY_STONE);

        valueLookupBuilder(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(BookshelfBlocks.BOOKSHELF_SPRUCE)
                .add(BookshelfBlocks.BOOKSHELF_ACACIA)
                .add(BookshelfBlocks.BOOKSHELF_BIRCH)
                .add(BookshelfBlocks.BOOKSHELF_CRIMSON)
                .add(BookshelfBlocks.BOOKSHELF_DARK_OAK)
                .add(BookshelfBlocks.BOOKSHELF_JUNGLE)
                .add(BookshelfBlocks.BOOKSHELF_WARPED)
                .add(BookshelfBlocks.BOOKSHELF_STONE)
                .add(BookshelfBlocks.BOOKSHELF_MANGROVE)
                .add(BookshelfBlocks.BOOKSHELF_CHERRY)
                .add(BookshelfBlocks.BOOKSHELF_BAMBOO)
                .add(BookshelfBlocks.BOOKSHELF_MOSSY_STONE);

        valueLookupBuilder(ConventionalBlockTags.BOOKSHELVES)
                .add(BookshelfBlocks.BOOKSHELF_SPRUCE)
                .add(BookshelfBlocks.BOOKSHELF_ACACIA)
                .add(BookshelfBlocks.BOOKSHELF_BIRCH)
                .add(BookshelfBlocks.BOOKSHELF_CRIMSON)
                .add(BookshelfBlocks.BOOKSHELF_DARK_OAK)
                .add(BookshelfBlocks.BOOKSHELF_JUNGLE)
                .add(BookshelfBlocks.BOOKSHELF_WARPED)
                .add(BookshelfBlocks.BOOKSHELF_STONE)
                .add(BookshelfBlocks.BOOKSHELF_MANGROVE)
                .add(BookshelfBlocks.BOOKSHELF_CHERRY)
                .add(BookshelfBlocks.BOOKSHELF_BAMBOO)
                .add(BookshelfBlocks.BOOKSHELF_MOSSY_STONE);
    }
}
