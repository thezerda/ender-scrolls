package com.urfriders.teleportation.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class BaseItem extends Item {

    public BaseItem() {
        this(new FabricItemSettings().group(ModItemGroup.ITEMS));
    }

    public BaseItem(int maxStackSize) {
        this(new FabricItemSettings().group(ModItemGroup.ITEMS).maxCount(maxStackSize));
    }

    public BaseItem(Settings settings) {
        super(settings.group(ModItemGroup.ITEMS));
    }
}
