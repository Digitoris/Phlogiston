package digitas.phlogiston.item;

import cpw.mods.fml.common.registry.GameRegistry;
import digitas.phlogiston.reference.Reference;
import digitas.phlogiston.utility.ResourceData;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final ItemPhlogiston flask = new ItemPhlogiston("flask");
	public static final ItemMeta gear = new ItemMeta("gear", ResourceData.getMetals(true));
	public static final ItemMeta plate = new ItemMeta("plate", ResourceData.getMetals(true));
	public static final ItemMeta ingot = new ItemMeta("ingot", ResourceData.getMetals(false));
	public static final ItemMeta dust = new ItemMeta("dust", ResourceData.getMetals(true));
	public static final ItemMeta dustDirty = new ItemMeta("dustDirty", ResourceData.getMetals(true));
	public static final ItemMeta resource = new ItemMeta("resource", ResourceData.getNonMetals(false));

	
	public static void init() {
		GameRegistry.registerItem(flask, "flask");
		GameRegistry.registerItem(gear, "gear");
		GameRegistry.registerItem(plate, "plate");
		GameRegistry.registerItem(ingot, "ingot");
		GameRegistry.registerItem(dust, "dust");
		GameRegistry.registerItem(dustDirty, "dustDirty");
	}
}
