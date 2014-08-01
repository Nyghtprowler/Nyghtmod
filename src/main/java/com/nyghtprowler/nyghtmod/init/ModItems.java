package com.nyghtprowler.nyghtmod.init;


import com.nyghtprowler.nyghtmod.item.ItemMapleLeaf;
import com.nyghtprowler.nyghtmod.item.ItemNyghtmod;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemNyghtmod mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
