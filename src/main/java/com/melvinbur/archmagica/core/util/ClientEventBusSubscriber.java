package com.melvinbur.archmagica.core.util;

import com.melvinbur.archmagica.ArchMagica;
import com.melvinbur.archmagica.client.screens.DisplayCaseScreen;
import com.melvinbur.archmagica.client.ter.DisplayCaseTileEntityRenderer;
import com.melvinbur.archmagica.core.init.BlockInit;
import com.melvinbur.archmagica.core.init.ContainerTypesInit;
import com.melvinbur.archmagica.core.init.TileEntityTypesInit;

import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ArchMagica.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		ScreenManager.registerFactory(ContainerTypesInit.DISPLAY_CASE_CONTAINER_TYPE.get(), DisplayCaseScreen::new);
		
		RenderTypeLookup.setRenderLayer(BlockInit.DISPLAY_CASE.get(), RenderType.getCutout());
		
		ClientRegistry.bindTileEntityRenderer(TileEntityTypesInit.DISPLAY_CASE_TILE_ENTITY_TYPE.get(), DisplayCaseTileEntityRenderer::new);
	}
}