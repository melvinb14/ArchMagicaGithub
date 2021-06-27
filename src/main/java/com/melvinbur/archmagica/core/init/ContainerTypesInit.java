package com.melvinbur.archmagica.core.init;

import com.melvinbur.archmagica.ArchMagica;
import com.melvinbur.archmagica.common.container.DisplayCaseContainer;

import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypesInit {
	
	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister
			.create(ForgeRegistries.CONTAINERS, ArchMagica.MOD_ID);
	

	public static final RegistryObject<ContainerType<DisplayCaseContainer>> DISPLAY_CASE_CONTAINER_TYPE = CONTAINER_TYPES
			.register("display_case", () -> IForgeContainerType.create(DisplayCaseContainer::new));



}
