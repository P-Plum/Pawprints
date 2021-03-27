package plum.pawprints.objects.items;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import plum.pawprints.main;
import plum.pawprints.init.ItemInit;
import plum.pawprints.objects.items.models.ModelBilbyScarf;
import plum.pawprints.util.interfaces.IHasModel;

public class ArmourModel extends ItemArmor implements IHasModel

{

	public ArmourModel(String name, CreativeTabs tab, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 1, equipmentSlotIn);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		setMaxStackSize(1);
		
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		
		main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	@Override
	public ModelBilbyScarf getArmorModel(EntityLivingBase entityLiving, ItemStack itemstack, EntityEquipmentSlot armorSlot, ModelBiped _default)
	{
		if(itemstack != ItemStack.EMPTY)
		{
			if(itemstack.getItem() instanceof ItemArmor)
			{
				ModelBilbyScarf model = new ModelBilbyScarf();
				model.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				
				model.isChild = _default.isChild;
				model.isRiding = _default.isRiding;
				model.isSneak = _default.isSneak;
				
				return model;
			}
		}
		return null;
	}
}
