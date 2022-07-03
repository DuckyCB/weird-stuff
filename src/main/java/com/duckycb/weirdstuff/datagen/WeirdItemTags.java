package com.duckycb.weirdstuff.datagen;

import com.duckycb.weirdstuff.WeirdStuff;
import com.duckycb.weirdstuff.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

public class WeirdItemTags extends ItemTagsProvider {
    public WeirdItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, WeirdStuff.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.CARDBOARD_ITEM.get());
    }

    @Override
    public @NotNull String getName() {
        return "Weird Tags";
    }
}
