
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package lm.lancemod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LancemodModTabs {
	public static CreativeModeTab TAB_LAN_SI_MO_ZU;

	public static void load() {
		TAB_LAN_SI_MO_ZU = new CreativeModeTab("tablan_si_mo_zu") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LancemodModItems.LAI_YIN_YUAN_KUANG.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
