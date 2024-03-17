package mmrevilium.theatermod.item;

import mmrevilium.theatermod.TheaterMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PLACEHOLDERITEM = registerItem("placeholderitem", new Item(new FabricItemSettings()));

    private static void  addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(PLACEHOLDERITEM);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheaterMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TheaterMod.LOGGER.info("Registering Mod Items for " + TheaterMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
