package digitas.phlogiston.init;

import cpw.mods.fml.common.registry.GameRegistry;
import digitas.phlogiston.world.WorldGenPhlogiston;
import digitas.phlogiston.world.biome.BiomeRegistryPhlogiston;

public class ModWorld {
	
	public static void init() {
		GameRegistry.registerWorldGenerator(new WorldGenPhlogiston(), 1);
		//BiomeRegistryPhlogiston.init();
	}
}
