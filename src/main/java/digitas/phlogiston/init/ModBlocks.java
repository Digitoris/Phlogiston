package digitas.phlogiston.init;

import cpw.mods.fml.common.registry.GameRegistry;
import digitas.phlogiston.block.BlockMetal;
import digitas.phlogiston.block.BlockPhlogiston;
import digitas.phlogiston.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final BlockPhlogiston metal = new BlockMetal();
	
	public static void init() {
		GameRegistry.registerBlock(metal, "metal");
	}
}
