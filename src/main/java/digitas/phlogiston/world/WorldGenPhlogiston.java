package digitas.phlogiston.world;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeManager;

public class WorldGenPhlogiston implements IWorldGenerator {

		@Override
		public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
			switch(world.provider.dimensionId) {
			case 0:
				generateSurface(random, chunkX, chunkZ, world);
				
			}
			
		}
		
		private void generateSurface(Random random, int chunkX, int chunkZ, World world) {
			int xBase = chunkX*16;
			int zBase = chunkZ*16;

			
			// SLOW FOR LIGHTING UPDATES
			for (int i=0; i<16; i++) {
				int x = xBase + i;
				for (int j=0; j<16; j++) {
					world.setBlock(x,20,zBase+j,Blocks.diamond_block,0,2);
				}
			}
			
			//TODO ALL ORES
			//TODO ALL STONES :D?
			
			
		}

}
