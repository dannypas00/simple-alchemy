package com.dannypas00.simplealchemy.registerables.items;

import com.dannypas00.simplealchemy.Util;
import com.dannypas00.simplealchemy.registerables.IRegisterable;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

abstract public class AbstractItem extends Item implements IRegisterable {
    public AbstractItem(Properties pProperties) {
        super(pProperties);
    }
}
