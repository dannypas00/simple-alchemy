package com.dannypas00.simplealchemy.registerables.items;

import com.dannypas00.simplealchemy.SimpleAlchemy;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import org.jetbrains.annotations.NotNull;

public class PhilosophersStoneItem extends AbstractItem {
    private static final int maxDurability = 128;

    public PhilosophersStoneItem() {
        super(PhilosophersStoneItem.getProperties());
    }

    public static Properties getProperties() {
        return new Properties()
                .stacksTo(1)
                .fireResistant()
                .setNoRepair()
                .rarity(Rarity.RARE)
                .durability(maxDurability);
    }

    public static PhilosophersStoneItem register() {
        return new PhilosophersStoneItem();
    }

    @Override
    public boolean hasCraftingRemainingItem(@NotNull ItemStack stack) {
        return true;
    }

    @Override
    public @NotNull ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        SimpleAlchemy.LOGGER.debug("Get remaining item");

        // If item is at 1 durability, deplete it
        if (itemStack.getMaxDamage() - itemStack.getDamageValue() < 2) {
            SimpleAlchemy.LOGGER.debug("Item dead: {}", itemStack.getDamageValue());
            SimpleAlchemy.LOGGER.debug(String.valueOf(itemStack.getMaxDamage()));
            // TODO: Deplete item instead of destroying it
            return ItemStack.EMPTY;
        }
        SimpleAlchemy.LOGGER.debug("Item alive!");
        itemStack.setDamageValue(itemStack.getDamageValue() + 1);
        SimpleAlchemy.LOGGER.debug(String.valueOf(itemStack.getDamageValue()));
        return itemStack;
    }
}
