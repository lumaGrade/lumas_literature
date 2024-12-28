package com.lumagrade.block;

import com.lumagrade.Lumas_literature;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BookshelfBlocks {

    public static final Block BOOKSHELF_SPRUCE = registerBlock("bookshelf_spruce", new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BOOKSHELF_ACACIA = registerBlock("bookshelf_acacia", new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BOOKSHELF_BIRCH = registerBlock("bookshelf_birch", new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BOOKSHELF_CRIMSON = registerBlock("bookshelf_crimson", new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BOOKSHELF_DARK_OAK = registerBlock("bookshelf_dark_oak", new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BOOKSHELF_JUNGLE = registerBlock("bookshelf_jungle", new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BOOKSHELF_WARPED = registerBlock("bookshelf_warped", new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BOOKSHELF_STONE = registerBlock("bookshelf_stone", new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.STONE)));
    public static final Block BOOKSHELF_MANGROVE = registerBlock("bookshelf_mangrove", new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BOOKSHELF_CHERRY = registerBlock("bookshelf_cherry", new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BOOKSHELF_BAMBOO = registerBlock("bookshelf_bamboo", new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BOOKSHELF_MOSSY_STONE = registerBlock("bookshelf_mossy_stone", new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.STONE)));

    // Add Chiseled variants?
    // Add Pale oak for 1.21.2 ->
    // Test Villager behaviour?
    // Spawn to somewhere?


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Lumas_literature.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Lumas_literature.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks() {
        Lumas_literature.LOGGER.info("Registering ModBlocks for " + Lumas_literature.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(BookshelfBlocks.BOOKSHELF_SPRUCE);
            entries.add(BookshelfBlocks.BOOKSHELF_ACACIA);
            entries.add(BookshelfBlocks.BOOKSHELF_BIRCH);
            entries.add(BookshelfBlocks.BOOKSHELF_CRIMSON);
            entries.add(BookshelfBlocks.BOOKSHELF_DARK_OAK);
            entries.add(BookshelfBlocks.BOOKSHELF_JUNGLE);
            entries.add(BookshelfBlocks.BOOKSHELF_WARPED);
            entries.add(BookshelfBlocks.BOOKSHELF_STONE);
            entries.add(BookshelfBlocks.BOOKSHELF_MANGROVE);
            entries.add(BookshelfBlocks.BOOKSHELF_CHERRY);
            entries.add(BookshelfBlocks.BOOKSHELF_BAMBOO);
            entries.add(BookshelfBlocks.BOOKSHELF_MOSSY_STONE);
        });
    }





















    // Bookshelves can be used as a fuel in furnaces, smelting 1.5 items per block.
    // TEST
    public static void registerBlocksAsFuel(Block block){
        FuelRegistry.INSTANCE.add(block, 300);
        //LumasLiterature.LOGGER.info("Registering as fuel: " + block);

       /*
        FuelRegistry.INSTANCE.add(BOOKSHELF_SPRUCE, 300);
        FuelRegistry.INSTANCE.add(BOOKSHELF_ACACIA, 300);
        FuelRegistry.INSTANCE.add(BOOKSHELF_BIRCH, 300);
        FuelRegistry.INSTANCE.add(BOOKSHELF_CRIMSON, 300);
        FuelRegistry.INSTANCE.add(BOOKSHELF_DARK_OAK, 300);
        FuelRegistry.INSTANCE.add(BOOKSHELF_JUNGLE, 300);
        FuelRegistry.INSTANCE.add(BOOKSHELF_STONE, 300);
        FuelRegistry.INSTANCE.add(BOOKSHELF_WARPED, 300);
        */
    }


    public static void registerBlocksAsFlammable(){
        FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_SPRUCE, 30, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_ACACIA, 30, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_BIRCH, 30, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_CRIMSON, 30, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_DARK_OAK, 30, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_JUNGLE, 30, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_STONE, 30, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_WARPED, 30, 20);
    }

}
