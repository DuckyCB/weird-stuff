package com.duckycb.weirdstuff.datagen;

import com.duckycb.weirdstuff.WeirdStuff;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = WeirdStuff.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new WeirdRecipes(generator));
            generator.addProvider(new WeirdLootTables(generator));
            WeirdBlockTags blockTags = new WeirdBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new WeirdItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new WeirdBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new WeirdItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new WeirdLanguageProvider(generator, "en_us"));
        }
    }
}
