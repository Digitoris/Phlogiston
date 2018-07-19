package digitas.phlogiston.item;

import digitas.phlogiston.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ItemBlockOre extends ItemBlockPhlogiston {

	public ItemBlockOre(Block block) {
		super(block);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return getUnlocalizedName() + "." + Names.ORE_NAMES[itemStack.getItemDamage()];
	}

}
