package com.melvinbur.archmagica.common.handler;

import com.melvinbur.archmagica.ArchMagica;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;

public class RegistryHandler { public static <C extends IFeatureConfig, F extends Feature<C>, CF extends ConfiguredFeature<C, F>> CF register(String key, CF configuredFeature) {
    ResourceLocation id = new ResourceLocation(ArchMagica.MOD_ID, key);
    if (WorldGenRegistries.CONFIGURED_FEATURE.keySet().contains(id)) {
        throw new IllegalStateException("The Configured Feature " + key + "already exists in the registry");
    }
    Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, id, configuredFeature);
    return configuredFeature;
}

}
