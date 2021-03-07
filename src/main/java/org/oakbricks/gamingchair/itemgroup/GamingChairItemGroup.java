
package org.oakbricks.gamingchair.itemgroup;

import org.oakbricks.gamingchair.block.Chairoakbricksgaming1Block;
import org.oakbricks.gamingchair.GamingChairModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@GamingChairModElements.ModElement.Tag
public class GamingChairItemGroup extends GamingChairModElements.ModElement {
	public GamingChairItemGroup(GamingChairModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabgaming_chair") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Chairoakbricksgaming1Block.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
