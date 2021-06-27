package com.melvinbur.archmagica;





import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.melvinbur.archmagica.core.init.BlockInit;
import com.melvinbur.archmagica.core.init.ItemInit;
import com.melvinbur.archmagica.core.init.TileEntityTypesInit;
import com.melvinbur.archmagica.core.init.ContainerTypesInit;
import com.melvinbur.archmagica.world.OreGeneration;





@Mod(ArchMagica.MOD_ID)
public class ArchMagica {
    
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "archmagica";
   
    
    public ArchMagica() {
      
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        TileEntityTypesInit.TILE_ENTITY_TYPE.register(bus);
		ContainerTypesInit.CONTAINER_TYPES.register(bus);
        
     
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    }

    private void setup(final FMLCommonSetupEvent event) {
   
       

    }
    
  
    
    

    
  }



