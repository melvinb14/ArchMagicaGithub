package com.melvinbur.archmagica.core.init;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;

import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FeatureInit {

	
	public static void addOres(final BiomeLoadingEvent event) {
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
				BlockInit.JADE_ORE.get().getDefaultState(), 6, 0, 49, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
				BlockInit.MYTHRIL_ORE.get().getDefaultState(), 5, 0, 38, 8);
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
				BlockInit.STYGIUM_ORE.get().getDefaultState(), 5, 0, 21, 5);
		
		
		if (event.getCategory().equals(Biome.Category.ICY)) {
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
				BlockInit.CELESTINE_ORE.get().getDefaultState(), 5, 0, 21, 5);
		}
		
		// Nether
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
				BlockInit.ORASINE_ORE.get().getDefaultState(), 7, 10, 117, 10);
		
		// End
		addOre(event, new BlockMatchRuleTest(Blocks.END_STONE.getBlock()),
				BlockInit.EDAPHINE_ORE.get().getDefaultState(), 5, 10, 110, 4);
	}

	public static void addOre(final BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize,
			int minHeight, int maxHeight, int amount) {
	            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
	    				Feature.ORE.withConfiguration(new OreFeatureConfig(rule, state, veinSize))
	    						.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
	    						.square().func_242731_b(amount));
		
		 
	        
	}

} 