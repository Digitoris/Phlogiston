package digitas.phlogiston.init;

import cpw.mods.fml.common.registry.GameRegistry;
import digitas.phlogiston.item.ItemFlask;
import digitas.phlogiston.item.ItemMeta;
import digitas.phlogiston.item.ItemPhlogiston;
import digitas.phlogiston.reference.Names;
import digitas.phlogiston.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemPhlogiston flask = new ItemFlask();
	public static final ItemMeta material = new ItemMeta("material", Names.MATERIAL_NAMES);
	
	public static void init() {
		GameRegistry.registerItem(flask, "flask");
		GameRegistry.registerItem(material, "material");
	}
}
