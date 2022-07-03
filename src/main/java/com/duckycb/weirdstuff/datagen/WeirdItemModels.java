package com.duckycb.weirdstuff.datagen;

import com.duckycb.weirdstuff.WeirdStuff;
import com.duckycb.weirdstuff.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class WeirdItemModels extends ItemModelProvider {
    public WeirdItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, WeirdStuff.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.CARDBOARD.get()
                .getRegistryName().getPath(), modLoc("block/cardboard"));
    }
}
