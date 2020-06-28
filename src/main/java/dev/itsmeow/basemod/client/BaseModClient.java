package dev.itsmeow.basemod.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BaseMod.MODID)
public class BaseModClient {

    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {

    }

}
