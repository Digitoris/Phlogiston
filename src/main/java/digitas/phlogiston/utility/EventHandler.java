package digitas.phlogiston.utility;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import digitas.phlogiston.block.BlockPhlogiston;
import digitas.phlogiston.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.oredict.OreDictionary;

public class EventHandler {
	
	@SubscribeEvent
	public void onHarvest(HarvestDropsEvent event) {
		if (!(event.block instanceof BlockPhlogiston) && !event.isSilkTouching) {
			int[] ids = OreDictionary.getOreIDs(new ItemStack(event.block,1,event.blockMetadata));
			ResourceData resource = null;
			for (int i = 0; i < ids.length; i++) {
				if (OreDictionary.getOreName(ids[i]).substring(0,3).equals("ore")) {
					try {
						resource = ResourceData.valueOf(OreDictionary.getOreName(ids[i]).substring(3).toUpperCase());
						break;
					} catch (IllegalArgumentException e) {
						continue;
					}
				}
			}
			if (resource != null) {
				ItemStack stack = new ItemStack(event.block,1,event.blockMetadata);
				for (int i = 0; i < event.drops.size(); i++) {
					if (ItemStack.areItemStacksEqual(event.drops.get(i), stack)) {
						event.drops.remove(i);
						break;
					}
				}
				int quantity = Utils.fortuneHelper(resource.getOreQuantity(), resource.getFortuneBonus(), event.fortuneLevel);
				if (resource.isMetal()) {
					event.drops.add(new ItemStack(ModItems.dustDirty,quantity,resource.getMeta()));
				} else {
					event.drops.add(new ItemStack(ModItems.resource,quantity,resource.getMeta()));
				}
			}
		} 
	}
}
