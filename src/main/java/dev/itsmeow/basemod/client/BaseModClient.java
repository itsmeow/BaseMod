package dev.itsmeow.basemod.client;

import dev.itsmeow.basemod.BaseMod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BaseMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BaseModClient {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {

    }

}
