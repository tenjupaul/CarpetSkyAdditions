package com.jsorrell.carpetskyadditions.gen.feature;

import com.jsorrell.carpetskyadditions.util.SkyAdditionsIdentifier;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public abstract class SkyAdditionsConfiguredFeatures {
  public static final RegistryKey<ConfiguredFeature<?, ?>> GATEWAY_ISLAND = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new SkyAdditionsIdentifier("end_gateway_island"));
}
