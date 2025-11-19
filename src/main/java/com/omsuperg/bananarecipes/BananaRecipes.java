package com.omsuperg.bananarecipes;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BananaRecipes implements ModInitializer {
	public static final String MOD_ID = "bananarecipes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Custom Items
	public static final Item BANANA = registerItem("banana", new Item(new Item.Settings().food(ModFoodComponents.BANANA)));
	public static final Item GOLDEN_BANANA = registerItem("golden_banana", new Item(new Item.Settings().food(ModFoodComponents.GOLDEN_BANANA)));
	public static final Item BANANA_BREAD = registerItem("banana_bread", new Item(new Item.Settings().food(ModFoodComponents.BANANA_BREAD)));
	public static final Item DRIED_BANANA = registerItem("dried_banana", new Item(new Item.Settings().food(ModFoodComponents.DRIED_BANANA)));

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Banana Recipes Mod!");
	}

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
	}
}
