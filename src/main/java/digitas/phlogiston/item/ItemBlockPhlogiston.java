package digitas.phlogiston.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import digitas.phlogiston.block.BlockOre;
import digitas.phlogiston.block.BlockPhlogiston;
import digitas.phlogiston.reference.Textures;
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

}
