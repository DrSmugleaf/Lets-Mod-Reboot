package com.drsmugleaf.letsmodreboot.init;

import com.drsmugleaf.letsmodreboot.item.ItemLMRB;
import com.drsmugleaf.letsmodreboot.item.ItemMapleLeaf;
import com.drsmugleaf.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }

}
