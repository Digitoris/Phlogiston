package digitas.phlogiston.block;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import digitas.phlogiston.reference.Names;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockOre extends BlockPhlogiston {
	
	public static final IIcon[] icons = new IIcon[Names.ORE_NAMES.length];
	
	public BlockOre() {
		super();
		this.setBlockName("ore");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		for (int i = 0; i < Names.ORE_NAMES.length; i++) {
			icons[i] = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1) + "_" + Names.ORE_NAMES[i]);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return icons[meta];
	}
	
	@Override
	public int damageDropped(int i) {
		return i;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs creativetabs, List list)
	{
		for (int i = 0; i < Names.ORE_NAMES.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}
