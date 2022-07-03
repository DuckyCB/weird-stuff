package com.duckycb.weirdstuff.datagen;

import com.duckycb.weirdstuff.WeirdStuff;
import com.duckycb.weirdstuff.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WeirdBlockTags extends BlockTagsProvider {
    public WeirdBlockTags(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, WeirdStuff.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.CARDBOARD.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.CARDBOARD.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.CARDBOARD.get());
    }

    @Override
    public @NotNull String getName() {
        return "Weird Tags";
    }
}
