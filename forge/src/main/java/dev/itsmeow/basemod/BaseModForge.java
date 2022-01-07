package dev.itsmeow.basemod;

import dev.itsmeow.basemod.client.BaseModForgeClient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BaseMod.MOD_ID)
@Mod.EventBusSubscriber(modid = BaseMod.MOD_ID)
public class BaseModForge {

    public BaseModForge() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.<FMLCommonSetupEvent>addListener(e -> {
            BaseMod.init(e::enqueueWork);
        });
        modBus.<FMLClientSetupEvent>addListener(e -> new BaseModForgeClient().clientSetup(e));
    }

}
