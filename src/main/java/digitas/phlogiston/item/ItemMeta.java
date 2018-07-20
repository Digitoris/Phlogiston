package digitas.phlogiston.item;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import digitas.phlogiston.utility.CreativeTabPhlogiston;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import scala.actors.threadpool.Arrays;

public class ItemMeta extends ItemPhlogiston {
	
	public List<String> names;
	public List<IIcon> icons;

	public ItemMeta(String name, String[] subNames) {
		super(name);
		this.setCreativeTab(CreativeTabPhlogiston.PHLOGISTON_TAB);
		setHasSubtypes(true);
		names = Arrays.asList(subNames);
		icons = new ArrayList(names.size());
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return super.getUnlocalizedName() + "." + names.get(itemStack.getItemDamage());
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		for (int i = 0; i < names.size(); i++) {
			icons.add(i,iconRegister.registerIcon(getUnwrappedUnlocalizedName(this.getUnlocalizedName() + "_" + names.get(i))));
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
		for (int i = 0; i < names.size(); i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}
