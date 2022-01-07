package dev.itsmeow.basemod.client;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class BaseModForgeClient {

    public void clientSetup(FMLClientSetupEvent event) {
        BaseModClient.clientInit();
    }

}
