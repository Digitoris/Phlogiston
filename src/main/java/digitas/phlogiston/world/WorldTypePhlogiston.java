package digitas.phlogiston.world;

import digitas.phlogiston.reference.Reference;
import digitas.phlogiston.world.biome.WorldChunkManagerPhlogiston;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;

public class WorldTypePhlogiston extends WorldType {

	public WorldTypePhlogiston() {
		super(Reference.WORLDTYPE);
	}
	
	@Override
	public WorldChunkManager getChunkManager(World world) {
		return new WorldChunkManagerPhlogiston(BiomeGenBase.desert, 0.0F);
	}
	
}
