package com.melvinbur.archmagica.core.init;



import com.melvinbur.archmagica.ArchMagica;
import com.melvinbur.archmagica.common.blocks.BlacksmithAnvil;

import com.melvinbur.archmagica.common.blocks.MagicCrystal;
import com.melvinbur.archmagica.common.blocks.MagicCrystal2;
import com.melvinbur.archmagica.common.blocks.WitchOven;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ArchMagica.MOD_ID);

	public static final RegistryObject<Block> BRECCIA_STONE = BLOCKS.register("breccia_stone",
			() -> new Block(AbstractBlock.Properties.from(Blocks.STONE)));
	
	public static final RegistryObject<Block> PURGATORY_STONE = BLOCKS.register("purgatory_stone",
			() -> new Block(AbstractBlock.Properties.from(Blocks.STONE)));
	
	public static final RegistryObject<Block> RUNIC_STONE = BLOCKS.register("runic_stone",
			() -> new Block(AbstractBlock.Properties.from(Blocks.STONE))); 
	
	public static final RegistryObject<Block> CORRUPTED_GRASS = BLOCKS.register("corrupted_grass",
			() -> new Block(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
	
	public static final RegistryObject<Block> CELESTINE_BLOCK = BLOCKS.register("celestine_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
					.hardnessAndResistance(7f, 7f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(4)
					.sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> EDAPHINE_BLOCK = BLOCKS.register("edaphine_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
					.hardnessAndResistance(7f, 7f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(4)
					.sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> ORICHALGUM_BLOCK = BLOCKS.register("orichalgum_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
					.hardnessAndResistance(7f, 7f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(4)
					.sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> ETHRIL_BLOCK = BLOCKS.register("ethril_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
					.hardnessAndResistance(7f, 7f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(4)
					.sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> CRIMSONSTEEL_BLOCK = BLOCKS.register("crimsonsteel_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
					.hardnessAndResistance(6f, 7f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(3)
					.sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> SOULSTEEL_BLOCK = BLOCKS.register("soulsteel_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
					.hardnessAndResistance(6f, 7f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(3)
					.sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> STYGIUM_BLOCK = BLOCKS.register("stygium_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
					.hardnessAndResistance(6f, 6f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(3)
					.sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> ORASINE_BLOCK = BLOCKS.register("orasine_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
					.hardnessAndResistance(5f, 6f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(2)
					.sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> MYTHRIL_BLOCK = BLOCKS.register("mythril_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
					.hardnessAndResistance(5f, 6f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(2)
					.sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> JADE_BLOCK = BLOCKS.register("jade_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
					.hardnessAndResistance(5f, 6f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(2)
					.sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
					.hardnessAndResistance(5f, 6f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(2)
					.sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> CELESTINE_ORE	= BLOCKS.register("celestine_ore",
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)
					.hardnessAndResistance(7f, 7f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(4)
					.sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> EDAPHINE_ORE	= BLOCKS.register("edaphine_ore",
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)
					.hardnessAndResistance(7f, 7f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(4)
					.sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> STYGIUM_ORE	= BLOCKS.register("stygium_ore",
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)
					.hardnessAndResistance(6f, 6f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(3)
					.sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> ORASINE_ORE	= BLOCKS.register("orasine_ore",
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)
					.hardnessAndResistance(5f, 6f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(2)
					.sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> MYTHRIL_ORE	= BLOCKS.register("mythril_ore",
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)
					.hardnessAndResistance(5f, 6f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(2)
					.sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> JADE_ORE	= BLOCKS.register("jade_ore",
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)
					.hardnessAndResistance(5f, 6f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(2)
					.sound(SoundType.STONE)));
	
	
	
	
	
	
    
	
	
	
	// BlockBench Blocks
	

	public static final RegistryObject<Block> WITCH_OVEN = BLOCKS.register("witch_oven", 
			() -> new WitchOven(AbstractBlock.Properties.create(Material.ANVIL, MaterialColor.GRAY).
					                                           hardnessAndResistance(5F, 6F).
					                                           setRequiresTool().
					                                           harvestLevel(2).
					                                           sound(SoundType.ANVIL).
					                                           setLightLevel((state) -> {
					                                        	   return state.get(BlockStateProperties.LIT) ? 13 : 0;}
					                                           )));
	
	
	
	
	
	public static final RegistryObject<Block> BLACKSMITH_ANVIL = BLOCKS.register("blacksmith_anvil", 
			() -> new BlacksmithAnvil(AbstractBlock.Properties.create(Material.ANVIL, MaterialColor.GRAY).
					                                           hardnessAndResistance(5F, 6F).
					                                           setRequiresTool().
					                                           sound(SoundType.ANVIL)));
	
	public static final RegistryObject<Block> MAGIC_CRYSTAL	= BLOCKS.register("magic_crystal",
			() -> new MagicCrystal(AbstractBlock.Properties.create(Material.GLASS, MaterialColor.ICE)
	.hardnessAndResistance(0.3F, 0F)
	.sound(SoundType.GLASS)
	.setLightLevel(b -> 11)
	.harvestTool(ToolType.PICKAXE)
	.setRequiresTool()
	.harvestLevel(0)
	.notSolid()));
	
	


	
	
	
	public static final RegistryObject<Block> MAGIC_CRYSTAL2 = BLOCKS.register("magic_crystal2",
			() -> new MagicCrystal2(AbstractBlock.Properties.create(Material.GLASS, MaterialColor.ICE)
					.hardnessAndResistance(0.3F, 0F)
					.sound(SoundType.GLASS)
					.setLightLevel(b -> 11)
					.harvestTool(ToolType.PICKAXE)
					.setRequiresTool()
					.harvestLevel(0)
					.notSolid()));
	      
			
	
	
	
	
}

	
	

