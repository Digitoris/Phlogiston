package digitas.phlogiston.block;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import digitas.phlogiston.utility.ResourceData;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockMeta extends BlockPhlogiston {
	
	protected Map<Integer,ResourceData> types;
	protected Map<Integer,IIcon> blockIcons;
	
	public BlockMeta(String name, Material material, ResourceData[] types) {
		super(name, material);
		this.blockIcons = new HashMap();
		
		this.types = new HashMap();
		for (ResourceData r : types) {
			this.types.put(r.getMeta(), r);
		}
	}
	
	@Override
	public int damageDropped(int i) {
		return i;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		for (ResourceData r : types.values()) {
			blockIcons.put(r.getMeta(),iconRegister.registerIcon(
				getUnwrappedUnlocalizedName(this.getUnlocalizedName()) + "_" + r.getName()
			));
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		if (blockIcons.containsKey(meta)) {
			return blockIcons.get(meta);
		} else {
			return blockIcons.values().iterator().next();
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs creativetabs, List list) {
		for (ResourceData r : types.values()) {
			list.add(new ItemStack(item, 1, r.getMeta()));
		}
	}
	
	public ResourceData getTypeFromMeta(int meta) {
		return types.get(meta);
	}
}
