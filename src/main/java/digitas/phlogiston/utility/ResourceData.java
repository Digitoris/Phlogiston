package digitas.phlogiston.utility;

import java.util.ArrayList;

public enum ResourceData {
	
	COPPER("copper",2,1,true,1,false),
	TUNGSTEN("tungsten",1,1,true,3,false),
	TIN("tin",2,1,true,1,false),
	SULFUR("sulfur",3,2,false,2,false),
	NITER("niter",3,2,false,2,false),
	PHOSPHORUS("phosphorus",3,2,false,2,false),
	IRON("iron",2,1,true,0,true),
	GOLD("gold",2,1,true,0,true),
	PALADIUM("paladium",1,1,true,3,false);
	
	private final String name;
	private final int oreQuantity;
	private final int fortuneBonus;
	private final boolean metal;
	private final int harvestLevel;
	private final boolean vanilla;
		
	ResourceData(String name, int oreQuantity, int fortuneBonus, boolean metal, int harvestLevel, boolean vanilla) {
		this.name = name;
		this.oreQuantity = oreQuantity;
		this.fortuneBonus = fortuneBonus;
		this.metal = metal;
		this.harvestLevel = harvestLevel;
		this.vanilla = vanilla;
	}

	public String getName() {
		return this.name;
	}
	
	public int getMeta() {
		return this.ordinal();
	}
	
	public boolean hasOre() {
		return this.oreQuantity == -1;
	}
	
	public int getOreQuantity() {
		return this.oreQuantity;
	}
	
	public boolean isMetal() {
		return this.metal;
	}
	
	public int getHarvestLevel() {
		return this.harvestLevel;
	}
	
	public boolean isVanilla() {
		return this.vanilla;
	}
	
	public int getFortuneBonus() {
		return this.fortuneBonus;
	}
	
	public static ResourceData[] getMetals(boolean includeVanilla) {
		ArrayList<ResourceData> metals = new ArrayList<ResourceData>();
		
		for (ResourceData r : ResourceData.values()) {
			if (r.isMetal() && (!r.isVanilla() || includeVanilla)) {
				metals.add(r);
			}
		}
		
		return metals.toArray(new ResourceData[0]);
	}
	
	public static ResourceData[] getNonMetals(boolean includeVanilla) {
		ArrayList<ResourceData> resources = new ArrayList<ResourceData>();
		
		for (ResourceData r : ResourceData.values()) {
			if (!r.isMetal() && (!r.isVanilla() || includeVanilla)) {
				resources.add(r);
			}
		}
		
		return resources.toArray(new ResourceData[0]);	
	}
	
	public static ResourceData[] getValues(boolean includeVanilla) {
		ArrayList<ResourceData> resources = new ArrayList<ResourceData>();
		
		for (ResourceData r : ResourceData.values()) {
			if (!r.isVanilla() || includeVanilla) {
				resources.add(r);
			}
		}
		
		return resources.toArray(new ResourceData[0]);
	}
	
	public static ResourceData[] getOres(boolean includeVanilla) {
		ArrayList<ResourceData> resources = new ArrayList<ResourceData>();
		
		for (ResourceData r : ResourceData.values()) {
			if (r.hasOre() && (!r.isVanilla() || includeVanilla)) {
				resources.add(r);
			}
		}
		
		return resources.toArray(new ResourceData[0]);
	}
}