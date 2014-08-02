package com.nyghtprowler.nyghtmod.init;

import com.nyghtprowler.nyghtmod.block.BlockFlag;
import com.nyghtprowler.nyghtmod.block.BlockNyghtmod;
import com.nyghtprowler.nyghtmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockNyghtmod flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
