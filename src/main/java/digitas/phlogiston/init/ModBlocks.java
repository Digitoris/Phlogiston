package digitas.phlogiston.init;

import cpw.mods.fml.common.registry.GameRegistry;
import digitas.phlogiston.block.BlockMeta;
import digitas.phlogiston.block.BlockPhlogiston;
import digitas.phlogiston.item.ItemBlockPhlogiston;
import digitas.phlogiston.reference.Names;
import digitas.phlogiston.reference.Reference;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final BlockPhlogiston metal = new BlockPhlogiston("metal", Material.iron);
	public static final BlockPhlogiston ore = new BlockMeta("ore", Names.ORE_NAMES);
	
	public static void init() {
		GameRegistry.registerBlock(metal, "metal");
		GameRegistry.registerBlock(ore, ItemBlockPhlogiston.class, "ore");
	}
}