
package com.melvinbur.archmagica.core.init;

import com.melvinbur.archmagica.ArchMagica;

import com.melvinbur.archmagica.common.material.CustomArmorMaterial;
import com.melvinbur.archmagica.core.itemgroup.ArchMagicaItemGroup;
import com.melvinbur.archmagica.core.itemgroup.ArchMagicaItemGroup2;
import com.melvinbur.archmagica.core.itemgroup.ArchMagicaItemGroup3;


import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			ArchMagica.MOD_ID);
	
	public static final RegistryObject<Item> ARCH_CRYSTAL = ITEMS.register("arch_crystal", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ABYSSAL_ORB = ITEMS.register("abyssal_orb", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ARCANE_CRYSTAL = ITEMS.register("arcane_crystal", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ARMOR_FRAGMENT = ITEMS.register("armor_fragment", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> BLUE_RUNE = ITEMS.register("blue_rune", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> CERBERUS_HIDE = ITEMS.register("cerberus_hide", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> CERBERUS_TOOTH = ITEMS.register("cerberus_tooth", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> CUSPID_FANG = ITEMS.register("cuspid_fang", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> CYAN_RUNE = ITEMS.register("cyan_rune", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ENHANCE_STONE = ITEMS.register("enhance_stone", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> FAIRY_DUST = ITEMS.register("fairy_dust", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> GOLD_RING = ITEMS.register("gold_ring", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> GRAY_RUNE = ITEMS.register("gray_rune", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> GREEN_RUNE = ITEMS.register("green_rune", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> HARDBONE = ITEMS.register("hardbone", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> INFERNAL_CORE = ITEMS.register("infernal_core", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> INFERNAL_POWDER = ITEMS.register("infernal_powder", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> IVORY_CHARM = ITEMS.register("ivory_charm", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> LOST_LETTER = ITEMS.register("lost_letter", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> LOST_PENDANT = ITEMS.register("lost_pendant", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> MANA_CRYSTAL = ITEMS.register("mana_crystal", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> MAGIC_DUST = ITEMS.register("magic_dust", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> MAGICAL_LEAF = ITEMS.register("magical_leaf", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> MINOTAUR_HORN = ITEMS.register("minotaur_horn", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> OMINOUS_ORB = ITEMS.register("ominous_orb", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ORANGE_RUNE = ITEMS.register("orange_rune", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> PIXIE_DUST = ITEMS.register("pixie_dust", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> POISON_STINGER = ITEMS.register("poison_stinger", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> PURPLE_RUNE = ITEMS.register("purple_rune", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> RED_RUNE = ITEMS.register("red_rune", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> SHARP_SPIKE = ITEMS.register("sharp_spike", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> SPIDER_SILK = ITEMS.register("spider_silk", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> SWORD_FRAGMENT = ITEMS.register("sword_fragment", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> WEDDDING_RING = ITEMS.register("wedding_ring", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> WHITE_RUNE = ITEMS.register("white_rune", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> WISDOM_AMULET = ITEMS.register("wisdom_amulet", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> YELLOW_RUNE = ITEMS.register("yellow_rune", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ENGRAVING_STONE = ITEMS.register("engraving_stone", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));

	public static final RegistryObject<Item> ENCHANT = ITEMS.register("enchant", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> GOBLIN_EYE = ITEMS.register("goblin_eye", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> HOWLEX_EAR = ITEMS.register("howlex_ear", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> OMINOUS_FLUID_BUCKET = ITEMS.register("ominous_fluid_bucket", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> AWAKEND_ENCHANT = ITEMS.register("awakend_enchant", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> AWAKENING_STONE1 = ITEMS.register("awakening_stone1", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> AWAKENING_STONE2 = ITEMS.register("awakening_stone2", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> AWAKENING_STONE3 = ITEMS.register("awakening_stone3", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> AWAKENING_STONE4 = ITEMS.register("awakening_stone4", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> AWAKENING_STONE5 = ITEMS.register("awakening_stone5", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> DEMON_BLOOD1 = ITEMS.register("demon_blood1", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> DEMON_BLOOD2 = ITEMS.register("demon_blood2", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> DEMON_BLOOD3 = ITEMS.register("demon_blood3", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> DEMON_BLOOD4 = ITEMS.register("demon_blood4", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> DEMON_BLOOD5 = ITEMS.register("demon_blood5", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> WATER_LIFE1 = ITEMS.register("water_life1", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> WATER_LIFE2 = ITEMS.register("water_life2", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> WATER_LIFE3 = ITEMS.register("water_life3", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> WATER_LIFE4 = ITEMS.register("water_life4", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> WATER_LIFE5 = ITEMS.register("water_life5", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	
	
		// Ingots & Nuggets
	
	public static final RegistryObject<Item> CELESTINE_INGOT = ITEMS.register("celestine_ingot", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> CELESTINE_NUGGET = ITEMS.register("celestine_nugget", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> CRIMSONSTEEL_INGOT = ITEMS.register("crimsonsteel_ingot", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> CRIMSONSTEEL_NUGGET = ITEMS.register("crimsonsteel_nugget", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> EDAPHINE_INGOT = ITEMS.register("edaphine_ingot", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> EDAPHINE_NUGGET = ITEMS.register("edaphine_nugget", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ETHRIL_INGOT = ITEMS.register("ethril_ingot", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ETHRIL_NUGGET = ITEMS.register("ethril_nugget", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> MYTHRIL_NUGGET = ITEMS.register("mythril_nugget", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ORASINE_INGOT = ITEMS.register("orasine_ingot", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ORASINE_NUGGET = ITEMS.register("orasine_nugget", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ORICHALGUM_INGOT = ITEMS.register("orichalgum_ingot", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ORICHALGUM_NUGGET = ITEMS.register("orichalgum_nugget", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> SOULSTEEL_INGOT = ITEMS.register("soulsteel_ingot", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> SOULSTEEL_NUGGET = ITEMS.register("soulsteel_nugget", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> STYGIUM_INGOT = ITEMS.register("stygium_ingot", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> STYGIUM_NUGGET = ITEMS.register("stygium_nugget", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	public static final RegistryObject<Item> JADE = ITEMS.register("jade", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup.ARCHMAGICA)));
	
	
	
	
	
	
	
	
		// Block Items
	
	public static final RegistryObject<BlockItem> BRECCIA_STONE = ITEMS.register("breccia_stone", 
			() -> new BlockItem(BlockInit.BRECCIA_STONE.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> PURGATORY_STONE = ITEMS.register("purgatory_stone", 
			() -> new BlockItem(BlockInit.PURGATORY_STONE.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> RUNIC_STONE = ITEMS.register("runic_stone", 
			() -> new BlockItem(BlockInit.RUNIC_STONE.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> CORRUPTED_GRASS = ITEMS.register("corrupted_grass", 
			() -> new BlockItem(BlockInit.CORRUPTED_GRASS.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> CELESTINE_BLOCK = ITEMS.register("celestine_block", 
			() -> new BlockItem(BlockInit.CELESTINE_BLOCK.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> EDAPHINE_BLOCK = ITEMS.register("edaphine_block", 
			() -> new BlockItem(BlockInit.EDAPHINE_BLOCK.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> ORICHALGUM_BLOCK = ITEMS.register("orichalgum_block", 
			() -> new BlockItem(BlockInit.ORICHALGUM_BLOCK.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> ETHRIL_BLOCK = ITEMS.register("ethril_block", 
			() -> new BlockItem(BlockInit.ETHRIL_BLOCK.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> CRIMSONSTEEL_BLOCK = ITEMS.register("crimsonsteel_block", 
			() -> new BlockItem(BlockInit.CRIMSONSTEEL_BLOCK.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> SOULSTEEL_BLOCK = ITEMS.register("soulsteel_block", 
			() -> new BlockItem(BlockInit.SOULSTEEL_BLOCK.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> STYGIUM_BLOCK = ITEMS.register("stygium_block", 
			() -> new BlockItem(BlockInit.STYGIUM_BLOCK.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> ORASINE_BLOCK = ITEMS.register("orasine_block", 
			() -> new BlockItem(BlockInit.ORASINE_BLOCK.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> MYTHRIL_BLOCK = ITEMS.register("mythril_block", 
			() -> new BlockItem(BlockInit.MYTHRIL_BLOCK.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> JADE_BLOCK = ITEMS.register("jade_block", 
			() -> new BlockItem(BlockInit.JADE_BLOCK.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> STEEL_BLOCK = ITEMS.register("steel_block", 
			() -> new BlockItem(BlockInit.STEEL_BLOCK.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> CELESTINE_ORE = ITEMS.register("celestine_ore", 
			() -> new BlockItem(BlockInit.CELESTINE_ORE.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> EDAPHINE_ORE = ITEMS.register("edaphine_ore", 
			() -> new BlockItem(BlockInit.EDAPHINE_ORE.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> STYGIUM_ORE = ITEMS.register("stygium_ore", 
			() -> new BlockItem(BlockInit.STYGIUM_ORE.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> ORASINE_ORE = ITEMS.register("orasine_ore", 
			() -> new BlockItem(BlockInit.ORASINE_ORE.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> MYTHRIL_ORE = ITEMS.register("mythril_ore", 
			() -> new BlockItem(BlockInit.MYTHRIL_ORE.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> JADE_ORE = ITEMS.register("jade_ore", 
			() -> new BlockItem(BlockInit.JADE_ORE.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	
	
	// BlockBench 
	
	public static final RegistryObject<BlockItem> WITCH_OVEN = ITEMS.register("witch_oven", 
			() -> new BlockItem(BlockInit.WITCH_OVEN.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> BLACKSMITH_ANVIL = ITEMS.register("blacksmith_anvil", 
			() -> new BlockItem(BlockInit.BLACKSMITH_ANVIL.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> MAGIC_CRYSTAL = ITEMS.register("magic_crystal", 
			() -> new BlockItem(BlockInit.MAGIC_CRYSTAL.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	public static final RegistryObject<BlockItem> MAGIC_CRYSTAL2 = ITEMS.register("magic_crystal2", 
			() -> new BlockItem(BlockInit.MAGIC_CRYSTAL2.get(), new Item.Properties().group(ArchMagicaItemGroup2.ARCHMAGICA)));
	
	
	
	

	 
	
	
	
	// Armor
	
	public static final RegistryObject<Item> CELESTINE_HELMET = ITEMS.register("celestine_helmet",
			() -> new ArmorItem(CustomArmorMaterial.CELESTINE_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> CELESTINE_CHESTPLATE = ITEMS.register("celestine_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.CELESTINE_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> CELESTINE_LEGGINGS = ITEMS.register("celestine_leggings",
			() -> new ArmorItem(CustomArmorMaterial.CELESTINE_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> CELESTINE_BOOTS = ITEMS.register("celestine_boots",
			() -> new ArmorItem(CustomArmorMaterial.CELESTINE_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	public static final RegistryObject<Item> EDAPHINE_HELMET = ITEMS.register("edaphine_helmet",
			() -> new ArmorItem(CustomArmorMaterial.EDAPHINE_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> EDAPHINE_CHESTPLATE = ITEMS.register("edaphine_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.EDAPHINE_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> EDAPHINE_LEGGINGS = ITEMS.register("edaphine_leggings",
			() -> new ArmorItem(CustomArmorMaterial.EDAPHINE_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> EDAPHINE_BOOTS = ITEMS.register("edaphine_boots",
			() -> new ArmorItem(CustomArmorMaterial.EDAPHINE_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ORICHALGUM_HELMET = ITEMS.register("orichalgum_helmet",
			() -> new ArmorItem(CustomArmorMaterial.ORICHALGUM_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> ORICHALGUM_CHESTPLATE = ITEMS.register("orichalgum_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.ORICHALGUM_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> ORICHALGUM_LEGGINGS = ITEMS.register("orichalgum_leggings",
			() -> new ArmorItem(CustomArmorMaterial.ORICHALGUM_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> ORICHALGUM_BOOTS = ITEMS.register("orichalgum_boots",
			() -> new ArmorItem(CustomArmorMaterial.ORICHALGUM_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ETHRIL_HELMET = ITEMS.register("ethril_helmet",
			() -> new ArmorItem(CustomArmorMaterial.ETHRIL_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> ETHRIL_CHESTPLATE = ITEMS.register("ethril_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.ETHRIL_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> ETHRIL_LEGGINGS = ITEMS.register("ethril_leggings",
			() -> new ArmorItem(CustomArmorMaterial.ETHRIL_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> ETHRIL_BOOTS = ITEMS.register("ethril_boots",
			() -> new ArmorItem(CustomArmorMaterial.ETHRIL_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	public static final RegistryObject<Item> CRIMSONSTEEL_HELMET = ITEMS.register("crimsonsteel_helmet",
			() -> new ArmorItem(CustomArmorMaterial.CRIMSONSTEEL_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> CRIMSONSTEEL_CHESTPLATE = ITEMS.register("crimsonsteel_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.CRIMSONSTEEL_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> CRIMSONSTEEL_LEGGINGS = ITEMS.register("crimsonsteel_leggings",
			() -> new ArmorItem(CustomArmorMaterial.CRIMSONSTEEL_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> CRIMSONSTEEL_BOOTS = ITEMS.register("crimsonsteel_boots",
			() -> new ArmorItem(CustomArmorMaterial.CRIMSONSTEEL_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	public static final RegistryObject<Item> SOULSTEEL_HELMET = ITEMS.register("soulsteel_helmet",
			() -> new ArmorItem(CustomArmorMaterial.SOULSTEEL_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> SOULSTEEL_CHESTPLATE = ITEMS.register("soulsteel_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.SOULSTEEL_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> SOULSTEEL_LEGGINGS = ITEMS.register("soulsteel_leggings",
			() -> new ArmorItem(CustomArmorMaterial.SOULSTEEL_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> SOULSTEEL_BOOTS = ITEMS.register("soulsteel_boots",
			() -> new ArmorItem(CustomArmorMaterial.SOULSTEEL_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	public static final RegistryObject<Item> STYGIUM_HELMET = ITEMS.register("stygium_helmet",
			() -> new ArmorItem(CustomArmorMaterial.STYGIUM_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> STYGIUM_CHESTPLATE = ITEMS.register("stygium_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.STYGIUM_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> STYGIUM_LEGGINGS = ITEMS.register("stygium_leggings",
			() -> new ArmorItem(CustomArmorMaterial.STYGIUM_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> STYGIUM_BOOTS = ITEMS.register("stygium_boots",
			() -> new ArmorItem(CustomArmorMaterial.STYGIUM_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	public static final RegistryObject<Item> ORASINE_HELMET = ITEMS.register("orasine_helmet",
			() -> new ArmorItem(CustomArmorMaterial.ORASINE_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> ORASINE_CHESTPLATE = ITEMS.register("orasine_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.ORASINE_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> ORASINE_LEGGINGS = ITEMS.register("orasine_leggings",
			() -> new ArmorItem(CustomArmorMaterial.ORASINE_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> ORASINE_BOOTS = ITEMS.register("orasine_boots",
			() -> new ArmorItem(CustomArmorMaterial.ORASINE_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	public static final RegistryObject<Item> MYTHRIL_HELMET = ITEMS.register("mythril_helmet",
			() -> new ArmorItem(CustomArmorMaterial.MYTHRIL_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> MYTHRIL_CHESTPLATE = ITEMS.register("mythril_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.MYTHRIL_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> MYTHRIL_LEGGINGS = ITEMS.register("mythril_leggings",
			() -> new ArmorItem(CustomArmorMaterial.MYTHRIL_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> MYTHRIL_BOOTS = ITEMS.register("mythril_boots",
			() -> new ArmorItem(CustomArmorMaterial.MYTHRIL_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	public static final RegistryObject<Item> JADE_HELMET = ITEMS.register("jade_helmet",
			() -> new ArmorItem(CustomArmorMaterial.JADE_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> JADE_CHESTPLATE = ITEMS.register("jade_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.JADE_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> JADE_LEGGINGS = ITEMS.register("jade_leggings",
			() -> new ArmorItem(CustomArmorMaterial.JADE_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> JADE_BOOTS = ITEMS.register("jade_boots",
			() -> new ArmorItem(CustomArmorMaterial.JADE_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
			() -> new ArmorItem(CustomArmorMaterial.STEEL_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.STEEL_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
			() -> new ArmorItem(CustomArmorMaterial.STEEL_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));

	public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
			() -> new ArmorItem(CustomArmorMaterial.STEEL_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	
	// Tools
	
	
	public static final RegistryObject<Item> IRON_HATCHET = ITEMS.register("iron_hatchet", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	public static final RegistryObject<Item> DIAMOND_HATCHET = ITEMS.register("diamond_hatchet", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", 
			() -> new Item(new Item.Properties().group(ArchMagicaItemGroup3.ARCHMAGICA)));
	
	
	
	
	
	
	
	
	
}