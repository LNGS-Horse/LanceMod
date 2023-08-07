
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package lm.lancemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import lm.lancemod.block.LaiYinKuangShiBlock;
import lm.lancemod.LancemodMod;

public class LancemodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LancemodMod.MODID);
	public static final RegistryObject<Block> LAI_YIN_KUANG_SHI = REGISTRY.register("lai_yin_kuang_shi", () -> new LaiYinKuangShiBlock());
}
