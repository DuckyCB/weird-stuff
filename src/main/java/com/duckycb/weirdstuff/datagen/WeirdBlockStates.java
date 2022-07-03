package com.duckycb.weirdstuff.datagen;

import com.duckycb.weirdstuff.WeirdStuff;
import com.duckycb.weirdstuff.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class WeirdBlockStates extends BlockStateProvider {
    public WeirdBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, WeirdStuff.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.CARDBOARD.get());
    }
}
