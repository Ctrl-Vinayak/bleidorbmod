package net.fabricmc.bleidorb;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.bleidorb.registry.ModBlock;
import net.fabricmc.bleidorb.registry.ModItems;

public class Main implements ModInitializer {

	public static final String MOD_ID = "bleidorbmod";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");
		ModItems.registerItems();
		ModBlock.registerBlocks();
	}

//	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
//			new Identifier("bleidorb", "general"), () -> new ItemStack(Items.COBBLESTONE));

}
