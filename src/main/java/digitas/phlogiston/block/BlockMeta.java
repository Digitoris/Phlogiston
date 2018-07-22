package digitas.phlogiston.block;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import digitas.phlogiston.utility.IType;
import digitas.phlogiston.utility.MetalType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockMeta<I extends IType> extends BlockPhlogiston {
	
	public List<IIcon> blockIcons;
	public I[] types;
	
	public BlockMeta(String name, Material material, I[] types) {
		super(name, material);
		this.types = types;
		this.blockIcons = new ArrayList<IIcon>(this.types.length);
	}
	
	@Override
	public int damageDropped(int i) {
		return i;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		for (int i = 0; i < types.length; i++) {
			blockIcons.add(i,iconRegister.registerIcon(
				getUnwrappedUnlocalizedName(this.getUnlocalizedName()) + "_" + types[i].getName()
			));
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return blockIcons.get(meta);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs creativetabs, List list) {
		for (int i = 0; i < types.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}
