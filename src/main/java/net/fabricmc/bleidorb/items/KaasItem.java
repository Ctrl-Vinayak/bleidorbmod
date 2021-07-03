package net.fabricmc.bleidorb.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class KaasItem extends Item {

    public KaasItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

//          playerEntity.setVelocity(playerEntity.getVelocity().x, 0.5, playerEntity.getVelocity().z);
//          playerEntity.playSound(SoundEvents.BLOCK_ANCIENT_DEBRIS_BREAK, 1.0F, 1.0F);

        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }

}
