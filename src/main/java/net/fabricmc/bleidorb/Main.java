package net.fabricmc.bleidorb;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.bleidorb.registry.ModBlock;
import net.fabricmc.bleidorb.registry.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

	public static final String MOD_ID = "bleidorbmod";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "general"),
			() -> new ItemStack(ModItems.CHEESE_ITEM)
	);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");
		ModItems.registerItems();
		ModBlock.registerBlocks();
	}
}
