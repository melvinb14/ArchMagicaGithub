package com.melvinbur.archmagica.core.init;



import com.melvinbur.archmagica.ArchMagica;
import com.melvinbur.archmagica.common.te.WitchOvenTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class TileEntityTypesInit {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister
			.create(ForgeRegistries.TILE_ENTITIES, ArchMagica.MOD_ID);
	
	public static final RegistryObject<TileEntityType<WitchOvenTileEntity>> WITCH_OVEN =
			TILE_ENTITY_TYPE.register("witch_oven", 
					() -> TileEntityType.Builder.create(WitchOvenTileEntity::new, 
							BlockInit.WITCH_OVEN.get()).build(null));


	
	
	
	
	
}