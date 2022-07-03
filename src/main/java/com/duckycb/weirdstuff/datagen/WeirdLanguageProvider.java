package com.duckycb.weirdstuff.datagen;

import com.duckycb.weirdstuff.WeirdStuff;
import com.duckycb.weirdstuff.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.duckycb.weirdstuff.setup.ModSetup.TAB_NAME;

public class WeirdLanguageProvider extends LanguageProvider {
    public WeirdLanguageProvider(DataGenerator gen, String locale) {
        super(gen, WeirdStuff.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Weird Stuff");
        add(Registration.CARDBOARD.get(), "Cardboard");
    }
}
