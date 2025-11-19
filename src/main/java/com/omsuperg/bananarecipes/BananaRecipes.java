package com.omsuperg.bananarecipes;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main mod class for Banana Recipes.
 * Adds banana-themed food items and recipes to Minecraft.
 */
public class BananaRecipes implements ModInitializer {
	/** Mod identifier */
	public static final String MOD_ID = "bananarecipes";
	/** Logger for the mod */
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Custom Items
	/** Basic banana food item */
	public static final Item BANANA = registerItem("banana", new Item(new Item.Settings().food(ModFoodComponents.BANANA)));
	/** Golden banana with special effects */
	public static final Item GOLDEN_BANANA = registerItem("golden_banana", new Item(new Item.Settings().food(ModFoodComponents.GOLDEN_BANANA)));
	/** Banana bread made from bananas and wheat */
	public static final Item BANANA_BREAD = registerItem("banana_bread", new Item(new Item.Settings().food(ModFoodComponents.BANANA_BREAD)));
	/** Dried banana created by smelting */
	public static final Item DRIED_BANANA = registerItem("dried_banana", new Item(new Item.Settings().food(ModFoodComponents.DRIED_BANANA)));

	/**
	 * Initializes the mod when Minecraft loads.
	 * Called by Fabric Loader during game startup.
	 */
	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Banana Recipes Mod!");
	}

	/**
	 * Registers an item with the game registry.
	 * @param name The item's registry name
	 * @param item The item instance to register
	 * @return The registered item
	 */
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
	}
}
