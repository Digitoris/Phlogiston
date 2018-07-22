package digitas.phlogiston.init;

import cpw.mods.fml.common.registry.GameRegistry;
import digitas.phlogiston.item.ItemMeta;
import digitas.phlogiston.item.ItemPhlogiston;
import digitas.phlogiston.reference.Reference;
import digitas.phlogiston.utility.MetalType;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemPhlogiston flask = new ItemPhlogiston("flask");
	public static final ItemMeta gear = new ItemMeta("gear", MetalType.values());
	public static final ItemMeta plate = new ItemMeta("plate", MetalType.values());
	public static final ItemMeta ingot = new ItemMeta("ingot", MetalType.values());
	public static final ItemMeta dust = new ItemMeta("dust", MetalType.values());
	public static final ItemMeta dustDirty = new ItemMeta("dustDirty", MetalType.values());

	
	public static void init() {
		GameRegistry.registerItem(flask, "flask");
		GameRegistry.registerItem(gear, "gear");
		GameRegistry.registerItem(plate, "plate");
		GameRegistry.registerItem(ingot, "ingot");
		GameRegistry.registerItem(dust, "dust");
		GameRegistry.registerItem(dustDirty, "dustDirty");
	}
}
