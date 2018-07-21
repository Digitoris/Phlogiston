package digitas.phlogiston.item;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import digitas.phlogiston.utility.IType;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemMeta<I extends IType> extends ItemPhlogiston {
	
	public I[] types;
	public List<IIcon> icons;

	public ItemMeta(String name, I[] types) {
		super(name);
		setHasSubtypes(true);
		this.types = types;
		icons = new ArrayList(this.types.length);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return super.getUnlocalizedName() + "." + types[itemStack.getItemDamage()].getName();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		for (int i = 0; i < types.length; i++) {
			icons.add(i,iconRegister.registerIcon(getUnwrappedUnlocalizedName(this.getUnlocalizedName() + "_" + types[i].getName())));
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int i) {
		return icons.get(i);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < types.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}
