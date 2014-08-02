package com.nyghtprowler.nyghtmod.block;


import com.nyghtprowler.nyghtmod.creativetab.CreativeTabNyghtMod;
import com.nyghtprowler.nyghtmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class BlockNyghtmod extends Block
{
    public BlockNyghtmod(Material material)

    {
        super(material);
        this.setCreativeTab(CreativeTabNyghtMod.NYGHT_TAB);
    }

    public BlockNyghtmod()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase()+ ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s",getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }


    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }
}
