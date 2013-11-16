package net.darkhax.moreswords.item;

import net.darkhax.moreswords.MoreSwords;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemCoreSword extends ItemSword {

	public ItemCoreSword(int id, EnumToolMaterial material) {
	
		super(id, material);
		this.setCreativeTab(MoreSwords.tabSwords);
	}
}
