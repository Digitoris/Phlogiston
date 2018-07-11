package digitas.phlogiston.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import digitas.phlogiston.init.ModItems;
import digitas.phlogiston.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabPhlogiston {
	
	public static final CreativeTabs PHLOGISTON_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return ModItems.flask;
		}
		
	};

}
