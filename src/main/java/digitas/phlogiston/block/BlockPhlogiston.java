package digitas.phlogiston.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import digitas.phlogiston.reference.Textures;
import digitas.phlogiston.utility.CreativeTabPhlogiston;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockPhlogiston extends Block {

	public BlockPhlogiston(String name, Material material) {
		super(material);
		this.setBlockName(name);
		this.setCreativeTab(CreativeTabPhlogiston.PHLOGISTON_TAB);
	}
	
	public BlockPhlogiston(String name) {
		this(name, Material.rock);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}
