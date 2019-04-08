package digitas.phlogiston.utility;

import cpw.mods.fml.common.Loader;

public class ModCompat {
	
	public static boolean isModLoaded(String modID) {
		return Loader.isModLoaded(modID);
	}
	public static boolean isBOPLoaded() {
		return isModLoaded("BiomesOPlenty");
	}
	
	public static boolean isForestryLoaded() {
		return isModLoaded("Forestry");
		
	}
	
	public static boolean isExtrabeesLoaded() {
		return isModLoaded("ExtraBees");
	}
	
	public static boolean isHarvestCraftLoaded() {
		return isModLoaded("harvestcraft");
	}

}
