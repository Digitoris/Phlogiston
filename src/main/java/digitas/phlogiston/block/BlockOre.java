package digitas.phlogiston.block;

import java.util.ArrayList;

import digitas.phlogiston.item.ModItems;
import digitas.phlogiston.utility.ResourceData;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockOre extends BlockMeta {

	public BlockOre(String name, Material material, ResourceData[] types) {
		super(name, material, types);
		
		for (ResourceData r : types) {
			this.setHardness(3.0F);
			this.setResistance(5.0F);
			this.setHarvestLevel("pickaxe", r.getHarvestLevel(), r.getMeta());
		}
	}
	
    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int meta, int fort) {
    	ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
    	
    	if (types.get(meta).isMetal()) {
    		ret.add(new ItemStack(ModItems.dustDirty, types.get(meta).getOreQuantity(), meta));
    		
    	} else {
    		ret.add(new ItemStack(ModItems.resource, types.get(meta).getOreQuantity(), meta));
    	}
    	
    	
    	return ret;
    }
}

