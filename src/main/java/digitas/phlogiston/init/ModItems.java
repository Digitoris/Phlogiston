package digitas.phlogiston.init;

import cpw.mods.fml.common.registry.GameRegistry;
import digitas.phlogiston.item.ItemMeta;
import digitas.phlogiston.item.ItemPhlogiston;
import digitas.phlogiston.reference.Reference;
import digitas.phlogiston.utility.MetalType;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemPhlogiston flask = new ItemPhlogiston("flask");
	public static final ItemMeta material = new ItemMeta("material", MetalType.values());
	
	public static void init() {
		GameRegistry.registerItem(flask, "flask");
		GameRegistry.registerItem(material, "material");
	}
}
