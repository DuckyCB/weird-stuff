package com.duckycb.weirdstuff;

import com.duckycb.weirdstuff.setup.ClientSetup;
import com.duckycb.weirdstuff.setup.ModSetup;
import com.duckycb.weirdstuff.setup.Registration;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("weirdstuff")
public class WeirdStuff {
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "weirdstuff";

    public WeirdStuff() {
        // Register the diferred registry
        Registration.init();

//        Register the setup method for mod lading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }

}
