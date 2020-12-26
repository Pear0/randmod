package com.example.examplemod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
    public static final Block STONE = new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).setRequiresTool().hardnessAndResistance(1.5F, 6.0F)).setRegistryName("betterstone");


    public static void registerBlocks(IForgeRegistry<Block> registry) {
        registry.register(STONE);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {

        registry.register(new BlockItem(STONE, (new Item.Properties()).group(ItemGroup.TRANSPORTATION)).setRegistryName(STONE.getRegistryName()));

    }

}
