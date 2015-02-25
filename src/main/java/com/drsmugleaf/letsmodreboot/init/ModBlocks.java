package com.drsmugleaf.letsmodreboot.init;

import com.drsmugleaf.letsmodreboot.block.BlockFlag;
import com.drsmugleaf.letsmodreboot.block.BlockLMRB;
import com.drsmugleaf.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
