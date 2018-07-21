package digitas.phlogiston.utility;

import java.util.ArrayList;

public enum MetalType implements IType{
	COPPER("copper"),
	TUNGSTEN("tungsten"),
	TIN("tin");
	
	private final String name;
		
	MetalType(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public int getMeta() {
		return this.ordinal();
	}
}
