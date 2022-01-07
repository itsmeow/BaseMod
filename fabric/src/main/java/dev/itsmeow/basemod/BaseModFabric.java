package dev.itsmeow.basemod;

import net.fabricmc.api.ModInitializer;

public class BaseModFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        BaseMod.construct();
        BaseMod.init(Runnable::run);
    }

}
