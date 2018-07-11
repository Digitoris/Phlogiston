package digitas.phlogiston.world.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

public class BiomeRegistryPhlogiston {
	
	public static void init() {
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomePhlogiston;
	
	private static void initializeBiome() {
		int nextId = 127;
		biomePhlogiston = new BiomeGenPhlogiston(nextId);
		
	}

	private static void registerBiome() {
		BiomeDictionary.registerBiomeType(biomePhlogiston, Type.MOUNTAIN);
		
	}

	

}
