package com.lumagrade.datagen;

import com.lumagrade.block.BookshelfBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
//import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BookshelfBlocks.BOOKSHELF_ACACIA, multipleDrops(BookshelfBlocks.BOOKSHELF_ACACIA, Items.BOOK, 3, 3));
        addDrop(BookshelfBlocks.BOOKSHELF_BAMBOO, multipleDrops(BookshelfBlocks.BOOKSHELF_BAMBOO, Items.BOOK, 3, 3));
        addDrop(BookshelfBlocks.BOOKSHELF_BIRCH, multipleDrops(BookshelfBlocks.BOOKSHELF_BIRCH, Items.BOOK, 3, 3));
        addDrop(BookshelfBlocks.BOOKSHELF_CHERRY, multipleDrops(BookshelfBlocks.BOOKSHELF_CHERRY, Items.BOOK, 3, 3));
        addDrop(BookshelfBlocks.BOOKSHELF_CRIMSON, multipleDrops(BookshelfBlocks.BOOKSHELF_CRIMSON, Items.BOOK, 3, 3));
        addDrop(BookshelfBlocks.BOOKSHELF_DARK_OAK, multipleDrops(BookshelfBlocks.BOOKSHELF_DARK_OAK, Items.BOOK, 3, 3));
        addDrop(BookshelfBlocks.BOOKSHELF_JUNGLE, multipleDrops(BookshelfBlocks.BOOKSHELF_JUNGLE, Items.BOOK, 3, 3));
        addDrop(BookshelfBlocks.BOOKSHELF_MANGROVE, multipleDrops(BookshelfBlocks.BOOKSHELF_MANGROVE, Items.BOOK, 3, 3));
        addDrop(BookshelfBlocks.BOOKSHELF_MOSSY_STONE, multipleDrops(BookshelfBlocks.BOOKSHELF_MOSSY_STONE, Items.BOOK, 3, 3));
        addDrop(BookshelfBlocks.BOOKSHELF_SPRUCE, multipleDrops(BookshelfBlocks.BOOKSHELF_SPRUCE, Items.BOOK, 3, 3));
        addDrop(BookshelfBlocks.BOOKSHELF_STONE, multipleDrops(BookshelfBlocks.BOOKSHELF_STONE, Items.BOOK, 3, 3));
        addDrop(BookshelfBlocks.BOOKSHELF_WARPED, multipleDrops(BookshelfBlocks.BOOKSHELF_WARPED, Items.BOOK, 3, 3));
    }



    public LootTable.Builder multipleDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }

}
