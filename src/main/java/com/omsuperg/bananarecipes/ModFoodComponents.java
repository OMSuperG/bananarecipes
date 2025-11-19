package com.omsuperg.bananarecipes;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
	// Banana: Restores 4 hunger (2 shanks), 4.8 saturation
	public static final FoodComponent BANANA = new FoodComponent.Builder()
			.nutrition(4)
			.saturationModifier(0.6f)
			.build();

	// Golden Banana: Restores 6 hunger (3 shanks), 14.4 saturation, gives Regeneration and Absorption
	public static final FoodComponent GOLDEN_BANANA = new FoodComponent.Builder()
			.nutrition(6)
			.saturationModifier(1.2f)
			.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0f)
			.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f)
			.alwaysEdible()
			.build();

	// Banana Bread: Restores 8 hunger (4 shanks), 9.6 saturation
	public static final FoodComponent BANANA_BREAD = new FoodComponent.Builder()
			.nutrition(8)
			.saturationModifier(0.6f)
			.build();

	// Dried Banana: Restores 2 hunger (1 shank), 2.4 saturation, quick to eat
	public static final FoodComponent DRIED_BANANA = new FoodComponent.Builder()
			.nutrition(2)
			.saturationModifier(0.6f)
			.snack()
			.build();
}
