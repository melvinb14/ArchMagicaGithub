package com.melvinbur.archmagica.world;

import com.melvinbur.archmagica.core.init.BlockInit;

import net.minecraft.block.BlockState;

import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;



public class OreGeneration {
	
	public static void generateOres(final BiomeLoadingEvent event) {
		{
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.JADE_ORE.get().getDefaultState(), 6, 0, 49, 10);
			
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.MYTHRIL_ORE.get().getDefaultState(), 5, 0, 38, 8);
			
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.STYGIUM_ORE.get().getDefaultState(), 5, 0, 16, 4);
			
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
					BlockInit.ORASINE_ORE.get().getDefaultState(), 7, 10, 117, 10);
			
				
		}
	}

	private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state,
			int veinSize, int minHeight, int maxHeight, int amount) {
		settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
						.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
						.square().func_242731_b(amount));
	}
}