package fr.zeiyo.zeiyocraft.material;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ZArmorMaterial
{

    public static ItemArmor.ArmorMaterial STEELA = EnumHelper.addArmorMaterial("STEEL", "zeiyocraft:steel", 19, new int[]{2, 6, 6, 2}, 9, SoundEvents.field_187725_r);
    public static ItemArmor.ArmorMaterial BRONZEA = EnumHelper.addArmorMaterial("BRONZEA", "zeiyocraft:bronze", 19, new int[] {3,6,5,2}, 9, SoundEvents.field_187725_r);
    public static ItemArmor.ArmorMaterial ELECTRUMA = EnumHelper.addArmorMaterial("ELECTRUMA", "zeiyocraft:electrum", 23, new int[] {3,6,5,3}, 15, SoundEvents.field_187725_r);
    public static ItemArmor.ArmorMaterial ONYXA = EnumHelper.addArmorMaterial("ONYXA", "zeiyocraft:onyx", 40, new int[] {3, 8, 6, 3}, 14, SoundEvents.field_187716_o);
    public static ItemArmor.ArmorMaterial RUBYA = EnumHelper.addArmorMaterial("RUBYA", "zeiyocraft:ruby", 33, new int[] {3, 8, 6, 3}, 10, SoundEvents.field_187716_o);
    public static ItemArmor.ArmorMaterial SAPPHIREA = EnumHelper.addArmorMaterial("SAPPHIREA", "zeiyocraft:sapphire", 33, new int[] {3, 8, 6, 3}, 10, SoundEvents.field_187716_o);

}