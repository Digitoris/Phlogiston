package digitas.phlogiston.block;

import cpw.mods.fml.common.registry.GameRegistry;
import digitas.phlogiston.item.ItemBlockPhlogiston;
import digitas.phlogiston.reference.Reference;
import digitas.phlogiston.utility.ResourceData;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final Block metal = new BlockPhlogiston("metal", Material.iron);
	public static final Block blockOre = new BlockOre("blockOre", Material.rock, ResourceData.getValues(false));
	public static final Block blockResource = new BlockMeta("blockResource", Material.iron, ResourceData.getValues(false));
	
	public static void init() {
		
		GameRegistry.registerBlock(metal, "metal");
		GameRegistry.registerBlock(blockOre, ItemBlockPhlogiston.class, "blockOre");
		GameRegistry.registerBlock(blockResource, ItemBlockPhlogiston.class, "blockResource");
	
	}
}