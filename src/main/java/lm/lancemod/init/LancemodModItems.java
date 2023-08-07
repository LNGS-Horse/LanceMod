
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package lm.lancemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import lm.lancemod.item.LaiYinYuanKuangItem;
import lm.lancemod.LancemodMod;

public class LancemodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LancemodMod.MODID);
	public static final RegistryObject<Item> LAI_YIN_KUANG_SHI = block(LancemodModBlocks.LAI_YIN_KUANG_SHI, LancemodModTabs.TAB_LAN_SI_MO_ZU);
	public static final RegistryObject<Item> LAI_YIN_YUAN_KUANG = REGISTRY.register("lai_yin_yuan_kuang", () -> new LaiYinYuanKuangItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
