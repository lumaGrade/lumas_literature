package com.lumagrade.datagen;

import com.lumagrade.Lumas_literature;
import com.lumagrade.block.BookshelfBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

import java.util.function.BiFunction;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //blockStateModelGenerator.registerSimpleCubeAll(BookshelfBlocks.BOOKSHELF_SPRUCE);
        //blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(BookshelfBlocks.BOOKSHELF_SPRUCE, TextureMap.sideFrontEnd(Blocks.ACACIA_PLANKS));
        //blockStateModelGenerator.registerCubeWithCustomTextures(BookshelfBlocks.BOOKSHELF_SPRUCE, Blocks.SPRUCE_PLANKS, TextureMap.sideEnd(TextureMap.sideEnd(Blocks.SPRUCE_PLANKS)));
        //blockStateModelGenerator.registerCubeAllModelTexturePool(BookshelfBlocks.BOOKSHELF_SPRUCE);
        //BiFunction<Block, Block, TextureMap> BiFunction;
        //BiFunction(<Blocks.SPRUCE_PLANKS,BookshelfBlocks.BOOKSHELF_SPRUCE, TextureMap.all(Blocks.SPRUCE_PLANKS>);

        //blockStateModelGenerator.registerLog(Blocks.SPRUCE_PLANKS).wood(BookshelfBlocks.BOOKSHELF_SPRUCE);

        //blockStateModelGenerator.blockStateCollector.accept(MultipartBlockStateSupplier.create(BookshelfBlocks.BOOKSHELF_SPRUCE)
        //        .with(When.create().set(Properties.HORIZONTAL_FACING, Direction.NORTH),
        //                BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R0)));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.ITEM, Models.GENERATED);
    }
}
