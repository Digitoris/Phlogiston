package digitas.phlogiston.reference;

public final class Reference {
	public static final String MOD_ID = "Phlogiston";
	public static final String MOD_NAME = "Phlogiston";
	
	public static final String VERSION = "@VERSION@";
	
	public static final String CLIENT_PROXY_CLASS = "digitas.phlogiston.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "digitas.phlogiston.proxy.ServerProxy";
	public static final String GUI_FACTORY_CLASS = "digitas.phlogiston.client.gui.GuiFactory";
	
	public static final String DEPENDENCIES = "required-after:Forestry@[4.2.5,);after:ExtraBees;after:BiomesOPlenty";
	
	public static final String WORLDTYPE = "Phlogiston";
}
