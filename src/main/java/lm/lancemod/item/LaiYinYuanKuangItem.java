
package lm.lancemod.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import lm.lancemod.init.LancemodModTabs;

public class LaiYinYuanKuangItem extends Item {
	public LaiYinYuanKuangItem() {
		super(new Item.Properties().tab(LancemodModTabs.TAB_LAN_SI_MO_ZU).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
