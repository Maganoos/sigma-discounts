package eu.magkari.mc.villager_discount.mixin;

import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MerchantOffer.class)
public class MixinMerchantOffer {
	/**
	 * @author Magnus trust
	 * @reason We disable villager curing, and other discounts.
	 */
	@Overwrite
	private int getModifiedCostCount(ItemCost itemCost) {
		return itemCost.count();
	}
}