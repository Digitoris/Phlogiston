package digitas.phlogiston.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import digitas.phlogiston.block.BlockMeta;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemBlockPhlogiston extends ItemBlock {
	
	public ItemBlockPhlogiston(Block block) {
		super(block);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int i) {
		return i;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int i) {
		return field_150939_a.getIcon(2, i);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return getUnlocalizedName() + "." + ((BlockMeta)field_150939_a).names.get(itemStack.getItemDamage());
	}

}
