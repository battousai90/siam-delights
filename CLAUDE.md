# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Siam Delights is a Minecraft mod for Fabric that adds Thai cuisine and tropical fruits. It integrates with Farmer's Delight Refabricated for Cooking Pot and Skillet recipes.

**Mod ID:** `siam_delights`

## Stack

- Minecraft 26.1 + Fabric
- Farmer's Delight Refabricated 3.5.2
- Java 21
- Gradle

## Build Commands

```bash
./gradlew runClient      # Launch game in dev mode
./gradlew genSources     # Generate Minecraft sources
./gradlew build          # Compile the mod
```

## Content

- Thai fruits: mango, durian, rambutan, dragon fruit...
- Cooked dishes via Farmer's Delight Cooking Pot and Skillet
- Crops/plants with growth stages

## Conventions

- Centralized registration in `registry/`
- Recipes in JSON at `data/siam_delights/recipes/`
- 16x16 PNG textures in `assets/siam_delights/textures/item/`
