package com.melvinbur.archmagica.world;

import com.google.common.collect.ImmutableList;
import com.melvinbur.archmagica.core.init.BlockInit;


import net.minecraft.block.Blocks;
import net.minecraft.world.gen.feature.BlockWithContextConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;


public class MagicCrystalGen { 
@SuppressWarnings("rawtypes")
public static final ConfiguredFeature MAGIC_CRYSTAL = register("magic_crystal", Feature.SIMPLE_BLOCK.withConfiguration
		(new BlockWithContextConfig(BlockInit.MAGIC_CRYSTAL.get().getDefaultState(), 
				ImmutableList.of(Blocks.STONE.getDefaultState()), ImmutableList.of(), ImmutableList.of())).range(50).square().count(10));
	
	
	
}