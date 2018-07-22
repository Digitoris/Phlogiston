package digitas.phlogiston.init;

import cpw.mods.fml.common.registry.GameRegistry;
import digitas.phlogiston.block.BlockMeta;
import digitas.phlogiston.block.BlockPhlogiston;
import digitas.phlogiston.item.ItemBlockPhlogiston;
import digitas.phlogiston.reference.Reference;
import digitas.phlogiston.utility.IType;
import digitas.phlogiston.utility.MetalType;
import digitas.phlogiston.utility.ResourceType;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final BlockPhlogiston metal = new BlockPhlogiston("metal", Material.iron);
	public static final BlockMeta oreMetal = new BlockMeta("oreMetal", Material.rock, MetalType.values());
	public static final BlockMeta oreResource = new BlockMeta("oreResource", Material.rock, ResourceType.values());
	
	
	public static void init() {
		
		GameRegistry.registerBlock(metal, "metal");
		GameRegistry.registerBlock(oreMetal, ItemBlockPhlogiston.class, "oreMetal");
		GameRegistry.registerBlock(oreResource, ItemBlockPhlogiston.class, "oreResource");
	}
}