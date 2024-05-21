package com.dannypas00.simplealchemy.registerables.registers;

import com.dannypas00.simplealchemy.SimpleAlchemy;
import com.dannypas00.simplealchemy.Util;
import com.dannypas00.simplealchemy.registerables.items.PhilosophersStoneItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegister {
    public static final DeferredRegister.Items itemRegister = DeferredRegister.createItems(SimpleAlchemy.MODID);

    public static DeferredItem<PhilosophersStoneItem>
            PHILOSOPHERS_STONE = itemRegister.register(Util.pathFromClass(PhilosophersStoneItem.class), PhilosophersStoneItem::register);

    public static void register(IEventBus modEventBus) {
        itemRegister.register(modEventBus);
        SimpleAlchemy.LOGGER.debug("Registered items: " + itemRegister.getEntries());
    }
}
