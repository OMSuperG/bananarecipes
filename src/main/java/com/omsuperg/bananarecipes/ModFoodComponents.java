package com.omsuperg.bananarecipes;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

/**
 * Defines food properties for all banana-related items in the mod.
 * Each food component specifies nutrition, saturation, and any status effects.
 */
public class ModFoodComponents {
	/**
	 * Banana: A basic food item.
	 * Restores 4 hunger (2 shanks), 4.8 saturation.
	 */
	public static final FoodComponent BANANA = new FoodComponent.Builder()
			.nutrition(4)
			.saturationModifier(0.6f)
			.build();

	/**
	 * Golden Banana: A premium food item with beneficial effects.
	 * Restores 6 hunger (3 shanks), 14.4 saturation.
	 * Provides Regeneration II for 5 seconds and Absorption for 2 minutes.
	 * Can always be eaten even when full.
	 */
	public static final FoodComponent GOLDEN_BANANA = new FoodComponent.Builder()
			.nutrition(6)
			.saturationModifier(1.2f)
			.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0f)
			.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f)
			.alwaysEdible()
			.build();

	/**
	 * Banana Bread: A filling baked good.
	 * Restores 8 hunger (4 shanks), 9.6 saturation.
	 */
	public static final FoodComponent BANANA_BREAD = new FoodComponent.Builder()
			.nutrition(8)
			.saturationModifier(0.6f)
			.build();

	/**
	 * Dried Banana: A quick snack.
	 * Restores 2 hunger (1 shank), 2.4 saturation.
	 * Faster to eat than regular food items.
	 */
	public static final FoodComponent DRIED_BANANA = new FoodComponent.Builder()
			.nutrition(2)
			.saturationModifier(0.6f)
			.snack()
			.build();
}
