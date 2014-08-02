package com.nyghtprowler.nyghtmod.creativetab;


import com.nyghtprowler.nyghtmod.init.ModItems;
import com.nyghtprowler.nyghtmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabNyghtMod
{
    public static final CreativeTabs NYGHT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }
    };
}
