package com.melvinbur.archmagica.core.init;



import com.melvinbur.archmagica.ArchMagica;

import com.melvinbur.archmagica.common.te.DisplayCaseTileEntity;


import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class TileEntityTypesInit {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister
			.create(ForgeRegistries.TILE_ENTITIES, ArchMagica.MOD_ID);

	
	
	public static final RegistryObject<TileEntityType<DisplayCaseTileEntity>> DISPLAY_CASE_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
			.register("display_case",
					() -> TileEntityType.Builder.create(DisplayCaseTileEntity::new, BlockInit.DISPLAY_CASE.get()).build(null));

}