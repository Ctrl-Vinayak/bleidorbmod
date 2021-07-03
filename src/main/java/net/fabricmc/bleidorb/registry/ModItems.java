package net.fabricmc.bleidorb.registry;

import net.fabricmc.bleidorb.registry.items.CheeseItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    public static final Item CHEESE_ITEM = new Item(new CheeseItem.Settings().group(ItemGroup.MISC).food((new FoodComponent.Builder())
            .hunger(3)
            .saturationModifier(0.3F)
            .build())
            .maxCount(32));

    //Block Items
    public static final BlockItem CHEESE_BLOCK = new BlockItem(ModBlock.CHEESE_BLOCK, new Item.Settings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("bleidorbmod", "cheese_item"), CHEESE_ITEM);
        Registry.register(Registry.ITEM, new Identifier("bleidorbmod", "cheese_block"), CHEESE_BLOCK);
    }
}
