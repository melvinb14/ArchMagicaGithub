package com.melvinbur.archmagica.core.itemgroup;

import com.melvinbur.archmagica.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ArchMagicaItemGroup extends ItemGroup {
	
	public static final ArchMagicaItemGroup ARCHMAGICA = new ArchMagicaItemGroup(ItemGroup.GROUPS.length, "archmagicatab");
	
	

	public ArchMagicaItemGroup(int index, String label) {
		super(index, label);
		
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemInit.ARCH_CRYSTAL.get());
	}
	
	
	
	

}
