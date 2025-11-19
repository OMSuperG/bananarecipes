# Development Guide

## Project Overview

This is a Fabric mod for Minecraft Java Edition 1.21 that adds banana-themed items and recipes to the game.

## Project Structure

```
bananarecipes/
├── src/
│   ├── main/
│   │   ├── java/com/omsuperg/bananarecipes/
│   │   │   ├── BananaRecipes.java          # Main mod class
│   │   │   └── ModFoodComponents.java      # Food definitions
│   │   └── resources/
│   │       ├── fabric.mod.json             # Mod metadata
│   │       ├── bananarecipes.mixins.json   # Mixin configuration
│   │       ├── assets/bananarecipes/
│   │       │   ├── lang/en_us.json         # English translations
│   │       │   └── models/item/            # Item models
│   │       └── data/bananarecipes/
│   │           └── recipes/                # Crafting recipes
│   └── client/
│       └── (client-side code can go here)
├── gradle/                                  # Gradle wrapper
├── build.gradle                             # Build configuration
├── gradle.properties                        # Project properties
├── settings.gradle                          # Gradle settings
├── LICENSE                                  # MIT License
├── README.md                                # User documentation
└── TEXTURES.md                              # Texture requirements

```

## Building the Mod

### Prerequisites
1. Java Development Kit (JDK) 21 or higher
2. Internet connection (for downloading dependencies)

### Build Commands
```bash
# Build the mod
./gradlew build              # Unix/Mac
gradlew.bat build            # Windows

# Output location
build/libs/bananarecipes-1.0.0.jar
```

### Running in Development
```bash
# Launch Minecraft client with the mod
./gradlew runClient

# Launch Minecraft server with the mod
./gradlew runServer
```

## Code Organization

### BananaRecipes.java
Main entry point that:
- Registers all items with the game
- Initializes the mod
- Provides logger for debugging

### ModFoodComponents.java
Defines food properties for each item:
- Nutrition values (hunger restored)
- Saturation modifiers
- Status effects (for Golden Banana)
- Eating speed (snack flag for Dried Banana)

### fabric.mod.json
Mod metadata including:
- Mod ID and version
- Dependencies (Fabric Loader, Minecraft, Fabric API)
- Entry points for initialization
- Mixin configuration reference

## Adding New Items

To add a new banana-related item:

1. Add food component in `ModFoodComponents.java`:
```java
public static final FoodComponent NEW_ITEM = new FoodComponent.Builder()
    .nutrition(6)
    .saturationModifier(0.8f)
    .build();
```

2. Register item in `BananaRecipes.java`:
```java
public static final Item NEW_ITEM = registerItem("new_item", 
    new Item(new Item.Settings().food(ModFoodComponents.NEW_ITEM)));
```

3. Add translation in `lang/en_us.json`:
```json
"item.bananarecipes.new_item": "New Item"
```

4. Create model file `models/item/new_item.json`
5. Create recipe in `data/bananarecipes/recipes/new_item.json`
6. Add texture `textures/item/new_item.png`

## Testing

Currently, the project doesn't include automated tests. Testing should be done by:
1. Building the mod
2. Running the development client/server
3. Verifying items appear in creative inventory
4. Testing crafting recipes
5. Verifying food effects work correctly

## Troubleshooting

### Build fails with "Plugin not found"
The build requires internet access to download the Fabric Loom plugin from maven.fabricmc.net. Ensure you have a stable internet connection.

### Items don't appear in game
1. Check that Fabric Loader is installed
2. Verify Fabric API is in the mods folder
3. Check game logs for errors
4. Ensure textures are present

### Missing textures
See TEXTURES.md for required texture files and specifications.

## Contributing

When contributing to this project:
1. Follow existing code style and naming conventions
2. Add JavaDoc comments for public methods and classes
3. Test changes thoroughly
4. Update documentation as needed

## Resources

- [Fabric Wiki](https://fabricmc.net/wiki/)
- [Fabric API Documentation](https://fabricmc.net/wiki/documentation:start)
- [Minecraft Wiki](https://minecraft.wiki/)
