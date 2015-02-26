package com.drsmugleaf.letsmodreboot.creativetab;

import com.drsmugleaf.letsmodreboot.init.ModItems;
import com.drsmugleaf.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }

    };
}
