package dev.itsmeow.basemod.client;

import net.fabricmc.api.ClientModInitializer;

public class BaseModFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BaseModClient.clientInit();
    }

}
