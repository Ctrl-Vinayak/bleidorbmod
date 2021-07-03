package net.fabricmc.bleidorb;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.bleidorb.items.KaasBlokItem;
import net.fabricmc.bleidorb.items.KaasItem;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

//	public static final Item KAAS_ITEM = new KaasItem(new FabricItemSettings().group(ItemGroup.FOOD)
//	.food(new FoodComponent.Builder().hunger(1).saturationModifier(2f).alwaysEdible().build()).maxCount(60));

	public static final String MOD_ID = "bleidorbmod";

	public static final Item KAAS_ITEM = new Item(new KaasItem.Settings().group(ItemGroup.MISC).food((new FoodComponent.Builder())
		.hunger(3)
		.saturationModifier(0.3F)
		.build())
	.maxCount(32));

	public static final Item KAAS_BLOK_ITEM = new KaasBlokItem(new FabricItemSettings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");

		Registry.register(Registry.ITEM, new Identifier("bleidorbmod", "kaas_item"), KAAS_ITEM);
		Registry.register(Registry.ITEM, new Identifier("bleidorbmod", "kaas_blok_item"), KAAS_BLOK_ITEM);

	}

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier("bleidorb", "general"), () -> new ItemStack(Items.COBBLESTONE));


}
