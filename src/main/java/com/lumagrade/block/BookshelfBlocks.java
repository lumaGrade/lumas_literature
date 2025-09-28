package com.lumagrade.block;

import com.lumagrade.Lumas_literature;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
//import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class BookshelfBlocks {

    // TODO for future
    // Add Chiseled variants?
    // Add Pale oak for 1.21.2 ->
    // Test Villager behaviour?
    // Spawn to somewhere?

    public static final Block BOOKSHELF_SPRUCE = register("bookshelf_spruce",Block::new, AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable(), true);
    public static final Block BOOKSHELF_ACACIA = register("bookshelf_acacia", Block::new, AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable(), true);
    public static final Block BOOKSHELF_BIRCH = register("bookshelf_birch", Block::new, AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable(), true);
    public static final Block BOOKSHELF_CRIMSON = register("bookshelf_crimson", Block::new, AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable(), true);
    public static final Block BOOKSHELF_DARK_OAK = register("bookshelf_dark_oak", Block::new, AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable(), true);
    public static final Block BOOKSHELF_JUNGLE = register("bookshelf_jungle", Block::new, AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable(), true);
    public static final Block BOOKSHELF_WARPED = register("bookshelf_warped", Block::new, AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable(), true);
    public static final Block BOOKSHELF_STONE = register("bookshelf_stone", Block::new, AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.STONE), true);
    public static final Block BOOKSHELF_MANGROVE = register("bookshelf_mangrove", Block::new, AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable(), true);
    public static final Block BOOKSHELF_CHERRY = register("bookshelf_cherry", Block::new, AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable(), true);
    public static final Block BOOKSHELF_BAMBOO = register("bookshelf_bamboo", Block::new, AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable(), true);
    public static final Block BOOKSHELF_MOSSY_STONE = register("bookshelf_mossy_stone", Block::new, AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.STONE), true);


    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> {
            itemGroup.add(BookshelfBlocks.BOOKSHELF_ACACIA.asItem());
            itemGroup.add(BookshelfBlocks.BOOKSHELF_BIRCH.asItem());
            itemGroup.add(BookshelfBlocks.BOOKSHELF_BAMBOO.asItem());
            itemGroup.add(BookshelfBlocks.BOOKSHELF_CHERRY.asItem());
            itemGroup.add(BookshelfBlocks.BOOKSHELF_CRIMSON.asItem());
            itemGroup.add(BookshelfBlocks.BOOKSHELF_SPRUCE.asItem());
            itemGroup.add(BookshelfBlocks.BOOKSHELF_JUNGLE.asItem());
            itemGroup.add(BookshelfBlocks.BOOKSHELF_STONE.asItem());
            itemGroup.add(BookshelfBlocks.BOOKSHELF_MANGROVE.asItem());
            itemGroup.add(BookshelfBlocks.BOOKSHELF_WARPED.asItem());
            itemGroup.add(BookshelfBlocks.BOOKSHELF_DARK_OAK.asItem());
            itemGroup.add(BookshelfBlocks.BOOKSHELF_MOSSY_STONE.asItem());
        });

        registerBlocksAsFlammable();
        registerBlocksAsFuels();
    }


    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        // Create a registry key for the block
        RegistryKey<Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Lumas_literature.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Lumas_literature.MOD_ID, name));
    }


    public static void registerBlocksAsFlammable(){
        FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_SPRUCE, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_ACACIA, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_BIRCH, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_CRIMSON, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_DARK_OAK, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_JUNGLE, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_WARPED, 30, 20);
    }


    public static void registerBlocksAsFuels() {
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(BOOKSHELF_SPRUCE, 300);
            builder.add(BOOKSHELF_ACACIA, 300);
            builder.add(BOOKSHELF_BIRCH, 300);
            builder.add(BOOKSHELF_CRIMSON, 300);
            builder.add(BOOKSHELF_DARK_OAK, 300);
            builder.add(BOOKSHELF_WARPED, 300);
        });
    }

}
