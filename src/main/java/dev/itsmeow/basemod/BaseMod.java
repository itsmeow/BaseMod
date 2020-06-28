package dev.itsmeow.basemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(modid = BaseMod.MODID)
@Mod(value = BaseMod.MODID)
public class BaseMod {

    public static final String MODID = "basemod";
    private static final Logger LOGGER = LogManager.getLogger();
    public static ItemGroup ITEM_GROUP = new ItemGroup("basemod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.APPLE);
        }

        @Override
        public void fill(NonNullList<ItemStack> toDisplay) {
            super.fill(toDisplay);
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
