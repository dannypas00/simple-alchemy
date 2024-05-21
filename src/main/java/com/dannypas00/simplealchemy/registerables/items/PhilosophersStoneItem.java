package com.dannypas00.simplealchemy.registerables.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class PhilosophersStoneItem extends AbstractItem {
    public PhilosophersStoneItem() {
        super(PhilosophersStoneItem.getProperties());
    }

    public static Properties getProperties() {
        return new Item.Properties()
                .stacksTo(1)
                .fireResistant()
                .setNoRepair()
                .rarity(Rarity.RARE);
    }

    public static PhilosophersStoneItem register() {
        PhilosophersStoneItem item = new PhilosophersStoneItem();
        return item;
    }
}
