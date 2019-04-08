package digitas.phlogiston.world;

import biomesoplenty.common.world.BOPBiomeManager;
import digitas.phlogiston.utility.ModCompat;
import digitas.phlogiston.world.biome.BiomeGenMod;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class ModWorld {
	
	public static BiomeGenBase modBiome;
	
	public static WorldTypePhlogiston worldTypePhlogiston;
	
	public static void init() {
		//GameRegistry.registerWorldGenerator(new WorldGenPhlogiston(), 1);
		registerBiomes();
	}
	
	public static void postInt() {
		worldTypePhlogiston = new WorldTypePhlogiston();
	}
	
	private static void registerBiomes() {
		modBiome = new BiomeGenMod(200);
		BiomeDictionary.registerBiomeType(modBiome, Type.FOREST);
		
		registerBiome(modBiome, BiomeType.WARM,10);
	}
	
	private static void registerBiome(BiomeGenBase biome, BiomeType type, int weight) {
		BiomeEntry entry = new BiomeEntry(biome, weight);
		BiomeManager.addBiome(type, entry);
		
		if (ModCompat.isBOPLoaded()) {
			BOPBiomeManager.overworldBiomes[type.ordinal()].add(entry);
		}
	}
}
