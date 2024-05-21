package com.dannypas00.simplealchemy;

import com.dannypas00.simplealchemy.registerables.registers.CreativeTabRegister;
import com.dannypas00.simplealchemy.registerables.registers.ItemRegister;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(SimpleAlchemy.MODID)
public class SimpleAlchemy {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "simplealchemy";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public SimpleAlchemy(IEventBus modEventBus, ModContainer modContainer) {
        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ItemRegister.register(modEventBus);
        CreativeTabRegister.register(modEventBus);
    }

    // This event is necessary to allow constructor to call registers
    @SubscribeEvent
    public void onServerSTarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting event");
    }
}
