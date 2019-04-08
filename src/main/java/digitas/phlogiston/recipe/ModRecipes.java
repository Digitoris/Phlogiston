package digitas.phlogiston.recipe;

import cpw.mods.fml.common.registry.GameRegistry;
import digitas.phlogiston.block.ModBlocks;
import digitas.phlogiston.item.ModItems;
import digitas.phlogiston.utility.ResourceData;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModRecipes {
	
	public static void init() {
		setOreDictionary();
		loadRecipes();
		
		
	}
	
	private static void setOreDictionary() {}
	
	private static void loadRecipes() {
		ItemStack item;
		for (ResourceData r : ResourceData.getMetals(true)) {
			if (r.isVanilla()) {
				item = new ItemStack((Item)Item.itemRegistry.getObject(r.getName() + "_ingot"));
				System.out.println(Item.itemRegistry.getObject(r.getName() + "_ingot").toString());
				System.out.println(item.toString());
				
			} else {
				if (r.isMetal())
					item = new ItemStack(ModItems.ingot,1,r.getMeta());
				else
					item = new ItemStack(ModItems.resource,1,r.getMeta());
				
				GameRegistry.addRecipe(
						new ItemStack(ModBlocks.blockResource,1,r.getMeta()),
						new Object[] {"WWW","WWW","WWW",'W', item});
			}
			
			if (r.isMetal()) {

				GameRegistry.addRecipe(
						new ItemStack(ModItems.gear,1,r.getMeta()),
						new Object[] {" W ","W W"," W ",'W', item});
				
				GameRegistry.addRecipe(
						new ItemStack(ModItems.plate,1,r.getMeta()),
						new Object[] {"WW","WW",'W', item});
			}
			
			item = null;
		}
	}

}
