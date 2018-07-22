package digitas.phlogiston.utility;

public enum ResourceType implements IType {
	SULFUR("sulfur"),
	NITER("niter"),
	PHOSPHORUS("phosphorus");
	
	private final String name;
		
	ResourceType(String name) {
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