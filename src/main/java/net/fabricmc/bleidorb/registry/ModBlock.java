package net.fabricmc.bleidorb.registry;

import net.fabricmc.bleidorb.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlock {

    public static final Block CHEESE_BLOCK = new Block(FabricBlockSettings.of(Material.CAKE)
        .breakByHand(true)
        .strength(1.0f, 1.0f)
        .sounds(BlockSoundGroup.GRASS));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("bleidorbmod", "cheese_block"), CHEESE_BLOCK);
    }

}
