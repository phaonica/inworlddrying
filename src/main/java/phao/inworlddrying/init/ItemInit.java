package phao.inworlddrying.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import phao.inworlddrying.objects.armor.ArmorBase;
import phao.inworlddrying.util.Reference;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	/*
	 *  LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
        CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
        IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
        GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
        DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

	 */
	
	//public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness)
	public static final ArmorMaterial ARMOR_TUTORIAL = EnumHelper.addArmorMaterial("armor_hide", Reference.MODID+":hide", 3, new int[]{1, 1, 1, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F); // below leather values

	//public static final Item HELMET_TUTORIAL = new ArmorBase(name, material, renderIndex, slot);
	public static final Item HELMET_TUTORIAL = new ArmorBase("armor_hide_head", ARMOR_TUTORIAL, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHEST_TUTORIAL = new ArmorBase("armor_hide_body", ARMOR_TUTORIAL, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_TUTORIAL = new ArmorBase("armor_hide_legs", ARMOR_TUTORIAL, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_TUTORIAL = new ArmorBase("armor_hide_feet", ARMOR_TUTORIAL, 1, EntityEquipmentSlot.FEET);

}
