package net.jaar.edibleberries.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jaar.edibleberries.EdibleBerries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BakedOranBerry = registerItem("baked_oran_berry", new Item(new FabricItemSettings().food(ModFoodComponents.BakedOranBerry)));

    //public static final Item RawOranBerry = registerItem("raw_oran_berry", new Item(new FabricItemSettings()));

    public static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(BakedOranBerry);

        //entries.add(RawOranBerry);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(EdibleBerries.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EdibleBerries.LOGGER.info("Registering Mod Items for" + EdibleBerries.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
    }
}
