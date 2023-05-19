package com.ncpbails.delightfulmining.item;

import com.ncpbails.delightfulmining.DelightfulMining;
import com.ncpbails.modestmining.item.ModTiers;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DelightfulMining.MOD_ID);

    public static final RegistryObject<Item> CLAM_CHOWDER = ITEMS.register("clam_chowder",
            () -> new BowlFoodItem(new Item.Properties().stacksTo(16).tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.CLAM_CHOWDER)));

    //public static final RegistryObject<Item> FLINT_KNIFE = ITEMS.register("flint_knife", () -> new KnifeItem(ModTiers.FLINT,
    //        0.5F, -2.0F, new Item.Properties().tab(FarmersDelight.CREATIVE_TAB)));

    public static final RegistryObject<Item> WOODEN_KNIFE = ITEMS.register("wooden_knife", () -> new KnifeItem(Tiers.WOOD,
            0.5F, -2.0F, new Item.Properties().tab(FarmersDelight.CREATIVE_TAB)));

    public static final RegistryObject<Item> STEEL_KNIFE = ITEMS.register("steel_knife", () -> new KnifeItem(ModTiers.STEEL,
            0.5F, -2.0F, new Item.Properties().tab(FarmersDelight.CREATIVE_TAB)));

    public static final RegistryObject<Item> ROSEGOLD_KNIFE = ITEMS.register("rosegold_knife", () -> new KnifeItem(ModTiers.ROSEGOLD,
            0.5F, -2.0F, new Item.Properties().tab(FarmersDelight.CREATIVE_TAB)));

    public static final RegistryObject<Item> PRISMARITE_KNIFE = ITEMS.register("prismarite_knife", () -> new KnifeItem(ModTiers.PRISMARITE,
            0.5F, -2.0F, new Item.Properties().tab(FarmersDelight.CREATIVE_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
