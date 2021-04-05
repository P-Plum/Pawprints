package plum.pawprints.objects.items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCrispyCaterpillar extends ItemFoodBase {

	public ItemCrispyCaterpillar(String name, int amount, boolean isWolfFood) {
		super(name, amount, isWolfFood);
	}

	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote)
        {
        	player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 250));
        }
    }
	
}