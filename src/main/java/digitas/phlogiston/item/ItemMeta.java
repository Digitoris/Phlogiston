package digitas.phlogiston.item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import digitas.phlogiston.utility.ResourceData;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemMeta extends ItemPhlogiston {
	
	protected Map<Integer,ResourceData> types;
	protected Map<Integer,IIcon> icons;

	public ItemMeta(String name, ResourceData[] types) {
		super(name);
		setHasSubtypes(true);
		icons = new HashMap();
		
		this.types = new HashMap();
		for (ResourceData r : types) {
			this.types.put(r.getMeta(), r);
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return super.getUnlocalizedName() + "." + types.get(itemStack.getItemDamage()).getName();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		for (ResourceData r : types.values()) {
			icons.put(r.getMeta(),iconRegister.registerIcon(getUnwrappedUnlocalizedName(this.getUnlocalizedName() + "_" + r.getName())));
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		if (icons.containsKey(meta)) {
			return icons.get(meta);
		} else {
			return icons.values().iterator().next();
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (ResourceData r : types.values()) {
			list.add(new ItemStack(item, 1, r.getMeta()));
		}
	}
}
