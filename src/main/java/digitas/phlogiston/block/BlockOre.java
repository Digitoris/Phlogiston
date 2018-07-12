package digitas.phlogiston.block;

import digitas.phlogiston.reference.Textures;
import net.minecraft.util.IIcon;

public class BlockOre extends BlockPhlogiston {
	
	//private IIcon[] icons; 
	
	public BlockOre() {
		super();
		this.setBlockName("ore");
	}
	
	//TODO: FIGURE OUT METADATA -> MULTIPLE BLOCKS IN ONE
	@Override
	public String getUnlocalizedName() {
		String sample = super.getUnlocalizedName();
		return sample;
	}
}
