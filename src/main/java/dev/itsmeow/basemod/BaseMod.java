package dev.itsmeow.basemod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(modid = BaseMod.MODID)
@Mod(value = BaseMod.MODID)
public class BaseMod {

    public static final String MODID = "basemod";
    public static ItemGroup ITEM_GROUP = new ItemGroup("basemod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.APPLE);
        }
    };

    public BaseMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::loadComplete);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void loadComplete(final FMLLoadCompleteEvent event) {

    }
}
