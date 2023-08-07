
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package lm.lancemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import lm.lancemod.world.features.ores.LaiYinKuangShiFeature;
import lm.lancemod.LancemodMod;

@Mod.EventBusSubscriber
public class LancemodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, LancemodMod.MODID);
	public static final RegistryObject<Feature<?>> LAI_YIN_KUANG_SHI = REGISTRY.register("lai_yin_kuang_shi", LaiYinKuangShiFeature::feature);
}
