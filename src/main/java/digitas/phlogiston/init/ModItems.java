package digitas.phlogiston.init;

import cpw.mods.fml.common.registry.GameRegistry;
import digitas.phlogiston.item.ItemFlask;
import digitas.phlogiston.item.ItemPhlogiston;
import digitas.phlogiston.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemPhlogiston flask = new ItemFlask();
	
	public static void init() {
		GameRegistry.registerItem(flask, "flask");
	}
}
