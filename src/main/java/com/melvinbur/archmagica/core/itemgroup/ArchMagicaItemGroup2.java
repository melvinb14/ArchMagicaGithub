package com.melvinbur.archmagica.core.itemgroup;

import com.melvinbur.archmagica.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ArchMagicaItemGroup2 extends ItemGroup {
	
	
	public static final ArchMagicaItemGroup2 ARCHMAGICA = new ArchMagicaItemGroup2(ItemGroup.GROUPS.length, "archmagicatab2");
	
		
		public ArchMagicaItemGroup2(int index, String label) {
		super(index, label);
	
	}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemInit.PURGATORY_STONE.get());
		}

		
	}


