package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ZItemFood extends ItemFood

{

    public ZItemFood(String unlocalizedName, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.FOOD);
        this.setRegistryName(ZeiyoMain.MODID + ":" + unlocalizedName);
    }

}