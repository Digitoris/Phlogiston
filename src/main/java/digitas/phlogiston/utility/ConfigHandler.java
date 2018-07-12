package digitas.phlogiston.utility;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import digitas.phlogiston.reference.Reference;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static Configuration config;
	public static boolean testValue = false;
	
	public static void init(File configFile) {
		
		if (config == null) {
			config	= new Configuration(configFile);
			
			config.load();
			
			loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration() {
		
		testValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "example value");
		
		if (config.hasChanged()) {
			config.save();
		}
	}
}
