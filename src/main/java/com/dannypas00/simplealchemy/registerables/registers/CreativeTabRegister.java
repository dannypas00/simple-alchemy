package com.dannypas00.simplealchemy.registerables.registers;

import com.dannypas00.simplealchemy.SimpleAlchemy;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTabRegister {
    public static final DeferredRegister<CreativeModeTab> creativeTabRegister = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimpleAlchemy.MODID);

    public static DeferredHolder<CreativeModeTab, CreativeModeTab>
            ALCHEMY_TAB = creativeTabRegister.register("simplealchemy_tab", () -> CreativeModeTab
            .builder()
            .title(Component.translatable("itemGroup.simplealchemy"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ItemRegister.PHILOSOPHERS_STONE.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemRegister.PHILOSOPHERS_STONE);
            })
            .build());

    public static void register(IEventBus modEventBus) {
        creativeTabRegister.register(modEventBus);
        SimpleAlchemy.LOGGER.debug("Registered creative tabs: " + creativeTabRegister.getEntries());
    }
}
