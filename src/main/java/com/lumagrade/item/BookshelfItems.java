package com.lumagrade.item;

import com.lumagrade.Lumas_literature;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class BookshelfItems {

    public static void registerModItems(){
        Lumas_literature.LOGGER.info("Registering mod items for " + Lumas_literature.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
        //   entries.add();
        //});
    }
}
