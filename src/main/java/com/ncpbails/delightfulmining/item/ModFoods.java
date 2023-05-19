package com.ncpbails.delightfulmining.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModFoods {
    
    public static final FoodProperties CLAM_CHOWDER = (new FoodProperties.Builder()).nutrition(12).saturationMod(1.3F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), FoodValues.LONG_DURATION, 0), 1.0F).build();

}