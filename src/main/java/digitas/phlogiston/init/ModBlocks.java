package digitas.phlogiston.init;

import cpw.mods.fml.common.registry.GameRegistry;
import digitas.phlogiston.block.BlockMeta;
import digitas.phlogiston.block.BlockMetal;
import digitas.phlogiston.block.BlockPhlogiston;
import digitas.phlogiston.item.ItemBlockPhlogiston;
import digitas.phlogiston.reference.Names;
import digitas.phlogiston.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final BlockPhlogiston metal = new BlockMetal();
	public static final BlockPhlogiston ore = new BlockMeta(Names.ORE_NAMES);
	
	public static void init() {
		GameRegistry.registerBlock(metal, "metal");
		GameRegistry.registerBlock(ore, ItemBlockPhlogiston.class, "ore");
	}
}