package fr.pifpouf.quidditchmod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class QuidditchModCreativeTabs extends CreativeTabs
{
    public QuidditchModCreativeTabs(String label)
    {
         super(label);
    }
    
    @Override
    public Item getTabIconItem()
    {
        return QuidditchMod.itemVifDor;
    }
}