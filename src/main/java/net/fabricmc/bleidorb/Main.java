package net.fabricmc.bleidorb;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.bleidorb.entity.CubeEntity;
import net.fabricmc.bleidorb.registry.ModBlock;
import net.fabricmc.bleidorb.registry.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	public static final String MOD_ID = "bleidorbmod";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "general"),
			() -> new ItemStack(ModItems.CHEESE_ITEM)
	);

	public static final EntityType<CubeEntity> CUBE = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID, "cube"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CubeEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
	);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");
		ModItems.registerItems();
		ModBlock.registerBlocks();

		FabricDefaultAttributeRegistry.register(CUBE, CubeEntity.createMobAttributes());
	}
}
