package digitas.phlogiston.world.biome;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenMod extends BiomeGenBase {
	
	private static final Height biomeHeight = new Height(0.1F,0.2F);
	public BiomeGenMod(int id) {
		super(id);
		
		this.setBiomeName("Phlogiston");
		
		this.setHeight(biomeHeight);
		this.setColor(0);
		this.setTemperatureRainfall(0.7F,0.8F);
	}
	
	@Override
	public int getWaterColorMultiplier() {
		return 0;
	}
	
	@Override
	public int getBiomeGrassColor(int x, int y, int z) {
		return 0;
	}
	
	@Override
	public int getBiomeFoliageColor(int x, int y, int z) {
		return 0;
	}
	
	@Override
	public int getSkyColorByTemp(float par1) {
		return 0;
	}

}
