package digitas.phlogiston.block;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockMeta extends BlockPhlogiston {
	
	
	public List<String> names;
	public List<IIcon> blockIcons;
	public IIcon icon;
	
	public BlockMeta(String[] names) {
		super();
		this.names = Arrays.asList(names);
		blockIcons = new ArrayList(this.names.size());
		this.setBlockName("ore");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		for (int i = 0; i < names.size(); i++) {
			blockIcons.add(i,iconRegister.registerIcon(getUnwrappedUnlocalizedName(this.getUnlocalizedName()) + "_" + names.get(i)));
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return blockIcons.get(meta);
	}
	
	@Override
	public int damageDropped(int i) {
		return i;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs creativetabs, List list)
	{
		for (int i = 0; i < names.size(); i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}
