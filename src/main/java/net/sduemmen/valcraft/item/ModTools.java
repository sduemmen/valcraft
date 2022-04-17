package net.sduemmen.valcraft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sduemmen.valcraft.Valcraft;

public class ModTools {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Valcraft.MOD_ID);

    public static final RegistryObject<Item> CRYSTAL_BATTLEAXE = ITEMS.register("crystal_battleaxe",
            () -> new SwordItem(ModTiers.CRYSTAL_BATTLEAXE, 10, 0.3f, new Item.Properties()
                    .tab(ModItemGroups.VALCRAFT_TOOLS_ITEM_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
