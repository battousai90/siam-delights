# Plan V1 MVP — Siam Delights (final verrouillé)

## Context
Le mod Siam Delights ajoute la cuisine thaïlandaise à Minecraft via Farmer's Delight Refabricated. V1 complète : items, blocs végétaux, crops bootstrap-ables, saplings fonctionnels, recettes FD, effets de nourriture, worldgen, tags convention, tooltips.

---

## Scope V1 — retiré
- ~~pineapple~~ → retiré V1 (pas utile dans les recettes retenues)
- ~~pineapple_crop~~ → retiré V1

---

## Blocs à créer

### Arbres (log + leaves + sapling fonctionnel)
| arbre | log | leaves | drop fruit | sapling (~5%) |
|-------|-----|--------|------------|---------|
| Cocotier | `coconut_log` | `coconut_leaves` | `coconut` (~15%) | `coconut_sapling` |
| Bananier | `banana_log` | `banana_leaves` | `banana` (~25%) | `banana_sapling` |
| Papayer | `papaya_log` | `papaya_leaves` | `papaya` (~25%) | `papaya_sapling` |
| Makrut | `makrut_log` | `makrut_leaves` | `makrut_leaf` (~40%) + `makrut` (~15%) | `makrut_sapling` |

> Saplings : `SaplingBlock` + `TreeGrower` custom. Croissance par bone meal + random tick.

### Buissons (cassés → drop item direct)
`chili_bush` → `thai_chili`, `garlic_bush` → `garlic`, `thai_basil_plant` → `thai_basil`

> Buissons spawned naturellement en jungle/zones chaudes = bootstrap pour le joueur.

### Cultures avec stages (`SiamCropBlock` — items = seeds, comme carotte vanilla)
| bloc | drop mature | biome spawn naturel |
|------|-------------|---------------------|
| `shallot_crop` | 1-3 shallot (+ replantable) | jungle, savanna |
| `galangal_crop` | 1-3 galangal (+ replantable) | jungle |
| `thai_eggplant_crop` | 1-2 thai_eggplant (+ replantable) | jungle, warm |

> Le joueur trouve les items dans la nature, les replante sur farmland.

### Lemongrass — Fabric LootTableEvents
- `LootTableEvents.MODIFY` sur `minecraft:blocks/tall_grass`
- Condition : outil avec tag `farmersdelight:knives`
- Drop : 0-1 lemongrass (luck compatible)

---

## Items à créer

### Fruits (edibles)
| id | nutrition | saturation | source |
|----|-----------|------------|--------|
| `coconut` | 2 | 0.2 | coconut_leaves (~15%) |
| `coconut_meat` | 4 | 0.4 | FD cutting board |
| `banana` | 4 | 0.6 | banana_leaves (~25%) |
| `papaya` | 4 | 0.5 | papaya_leaves (~25%) |
| `makrut` | 2 | 0.3 | makrut_leaves (~15%) |

### Herbes & Épices (edibles, faible nutrition)
| id | nutrition | saturation | effet | source |
|----|-----------|------------|-------|--------|
| `lemongrass` | 1 | 0.1 | — | tall_grass + knife |
| `galangal` | 1 | 0.1 | — | galangal_crop |
| `thai_basil` | 1 | 0.2 | — | thai_basil_plant |
| `makrut_leaf` | 1 | 0.1 | — | makrut_leaves (~40%) |
| `thai_chili` | 1 | 0.1 | fire_resistance I (5s) | chili_bush |
| `garlic` | 2 | 0.2 | — | garlic_bush |
| `shallot` | 2 | 0.3 | — | shallot_crop |
| `thai_eggplant` | 3 | 0.4 | — | thai_eggplant_crop |

### Transformés — Edibles
| id | nutrition | saturation | craft |
|----|-----------|------------|-------|
| `sliced_mango` | 5 | 0.6 | FD cutting board |
| `shredded_papaya` | 3 | 0.4 | FD cutting board |
| `dried_fish` | 4 | 0.5 | furnace |
| `sticky_rice` | 6 | 0.5 | FD Cooking Pot |

### Transformés — Non-edibles
`coconut_milk`, `fish_sauce`, `red_curry_paste`, `green_curry_paste`, `makrut_juice`

### Saplings
`coconut_sapling`, `banana_sapling`, `papaya_sapling`, `makrut_sapling`

### Plats — effets distinctifs
| id | nutrition | saturation | effet | tooltip |
|----|-----------|------------|-------|---------|
| `mango_sticky_rice` | 8 | 0.7 | — | "Sweet & Comforting" |
| `green_curry` | 10 | 0.8 | speed I (8s) | "Spicy & Warming 🌶️" |
| `tom_yum` | 7 | 0.6 | regeneration I (8s) | "Refreshing & Healing" |
| `som_tam` | 6 | 0.5 | — | "Light & Tangy" |
| `pad_thai` | 9 | 0.7 | saturation I (8s) | "Filling & Savory" |

---

## Recettes

### FD Cutting Board (`farmersdelight:cutting`)
- `coconut` → `2x coconut_meat`
- `mango` → `2x sliced_mango`
- `papaya` → `shredded_papaya`

### Crafting shapeless
- `coconut_meat` + `minecraft:bowl` → `coconut_milk`
- `makrut` + `minecraft:glass_bottle` → `makrut_juice`

### Furnace
- `minecraft:cod` ou `minecraft:salmon` → `dried_fish` (400t, 0.35 xp)

### FD Cooking Pot (`farmersdelight:cooking`)
| recette | ingrédients | résultat | container | temps | xp |
|---------|-------------|----------|-----------|-------|----|
| `sticky_rice` | farmersdelight:rice + coconut_milk | sticky_rice | — | 200t | 0.5 |
| `fish_sauce` | dried_fish ×2 + water_bucket | fish_sauce | — | 200t | 0.5 |
| `red_curry_paste` | thai_chili + garlic + shallot + makrut_leaf | red_curry_paste | — | 200t | 0.5 |
| `green_curry_paste` | thai_chili + garlic + shallot + makrut_leaf + thai_basil | green_curry_paste | — | 200t | 0.5 |
| `mango_sticky_rice` | sliced_mango + sticky_rice + coconut_milk | mango_sticky_rice | bowl | 300t | 1.0 |
| `green_curry` | green_curry_paste + coconut_milk + chicken + thai_eggplant | green_curry | bowl | 400t | 1.5 |
| `tom_yum` | lemongrass + galangal + makrut_leaf + fish_sauce + [cod\|salmon\|chicken] | tom_yum | bowl | 400t | 1.5 |
| `som_tam` | shredded_papaya + fish_sauce + thai_chili + makrut_juice | som_tam | bowl | 200t | 1.0 |
| `pad_thai` | #c:foods/cooked_pasta + [chicken\|cod] + fish_sauce + egg | pad_thai | bowl | 400t | 1.5 |

---

## Tooltips
- Implémentation : classe `SiamFoodItem extends Item` avec `appendHoverText()` → lit la clé `item.siam_delights.<name>.tooltip` dans le lang
- Utilisé pour les plats et items avec propriétés notables (`thai_chili`)

---

## Tags (convention — modpack compat)
- `#c:foods/tropical_fruits` → mango, coconut_meat, banana, papaya
- `#c:crops/chili` → thai_chili
- `#c:crops/garlic` → garlic
- `#c:crops/shallot` → shallot
- Fichiers : `data/c/tags/item/*.json`

---

## Structure Java
| fichier | rôle |
|---------|------|
| `registry/ModBlocks.java` | logs, leaves, saplings, bushes, crops |
| `registry/ModItems.java` | tous les items + block items |
| `registry/ModFoods.java` | FoodProperties avec effets |
| `item/SiamFoodItem.java` | base class avec tooltip support |
| `block/SiamCropBlock.java` | crop générique (shallot, galangal, eggplant) |
| `worldgen/ModConfiguredFeatures.java` | TreeConfiguration par arbre |
| `worldgen/ModPlacedFeatures.java` | PlacementUtils |
| `worldgen/ModWorldGeneration.java` | BiomeModifications |
| `SiamDelights.java` | initialize() + LootTableEvents lemongrass |

---

## Worldgen
| arbre | biome | fréquence |
|-------|-------|-----------|
| Cocotier | jungle + beach | rare (beach très rare) |
| Bananier | jungle | peu fréquent |
| Papayer | jungle | peu fréquent |
| Makrut | jungle | rare |

> Buissons (chili, garlic, thai_basil) : spawn via `PATCH` feature en jungle/savanna

### Structures arbres
- **Cocotier** : 5-7 blocs, `StraightTrunkPlacer` + couronne plate (`AcaciaFoliagePlacer`)
- **Bananier** : 3-4 blocs, `StraightTrunkPlacer` + feuillage large (`BlobFoliagePlacer` radius 2)
- **Papayer** : 4-6 blocs, petite couronne sommet uniquement, fruits en texture V1 (TreeDecorator V2)
- **Makrut** : 4-5 blocs, `BlobFoliagePlacer` dense standard

---

## Phases d'implémentation (progressives — valider avant d'avancer)

### Phase 1 — Coconut chain complète + premiers plats ← ON COMMENCE ICI
**Items :** `coconut`, `coconut_meat`, `coconut_milk`, `sticky_rice`, `sliced_mango`
**Blocs :** `coconut_log`, `coconut_leaves`, `coconut_sapling`
**Recettes :**
  - FD Cutting Board : `coconut → 2x coconut_meat`, `mango → 2x sliced_mango`
  - Crafting : `coconut_meat + bowl → coconut_milk`
  - FD Cooking Pot : `sticky_rice`, `mango_sticky_rice`, `tom_yum` (avec ingrédients déjà dispo vanilla)
**Worldgen :** cocotier en jungle + beach
**→ Tester en jeu avant de continuer**

### Phase 2 — Herbes & aromatics chain
**Items :** `lemongrass`, `galangal`, `makrut_leaf`, `makrut`, `makrut_juice`, `thai_basil`
**Blocs :** `makrut_log`, `makrut_leaves`, `makrut_sapling`, `thai_basil_plant`
**LootTable :** lemongrass depuis tall_grass + knife FD
**→ Tester lemongrass drop, makrut tree**

### Phase 3 — Chili & curry chain
**Items :** `thai_chili`, `garlic`, `shallot`, `thai_eggplant`, `red_curry_paste`, `green_curry_paste`, `yellow_curry_paste`
**Blocs :** `chili_bush`, `garlic_bush`, `shallot_crop`, `galangal_crop`, `thai_eggplant_crop`
**Recettes :** curry pastes en Cooking Pot
**Worldgen :** buissons en jungle/savanna
**→ Tester crops bootstrap**

### Phase 4 — Fish chain + plats restants
**Items :** `dried_fish`, `fish_sauce`
**Recettes :** `dried_fish` (furnace), `fish_sauce` (cooking pot), `green_curry`, `som_tam`, `pad_thai`
**→ Tester tous les plats FD**

### Phase 5 — Arbres restants
**Blocs :** `banana_log/leaves/sapling`, `papaya_log/leaves/sapling`
**Items :** `banana`, `papaya`, `shredded_papaya`
**Worldgen :** bananier + papayer en jungle
**→ Tester drops et worldgen**

### Phase 6 — Polish
Tags `#c:foods/`, `#c:crops/`, tooltips, équilibrage final

---

## Vérification
- `./gradlew build` sans erreur
- `./gradlew runClient` — items dans Food & Drinks, blocs posables
- Lemongrass drop sur tall_grass avec knife FD
- Sapling + bone meal → arbre pousse
- Cocotier visible en jungle et beach
- Buissons spawned en jungle
- Crops trouvables en jungle, replantables sur farmland
- Recipe book Cooking Pot : recettes visibles
- Effets : `tom_yum` → regen, `thai_chili` → fire resistance
- Tooltips visibles au hover des items
