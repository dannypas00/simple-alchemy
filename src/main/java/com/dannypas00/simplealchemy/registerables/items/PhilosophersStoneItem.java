package com.dannypas00.simplealchemy.registerables.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

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
}
