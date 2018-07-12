package digitas.phlogiston;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import digitas.phlogiston.init.ModBlocks;
import digitas.phlogiston.init.ModItems;
import digitas.phlogiston.init.ModNetwork;
import digitas.phlogiston.init.ModWorld;
import digitas.phlogiston.proxy.IProxy;
import digitas.phlogiston.reference.Reference;
import digitas.phlogiston.utility.ConfigHandler;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Phlogiston {
	
	@Mod.Instance(Reference.MOD_ID)
	public static Phlogiston instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	public SimpleNetworkWrapper packetHandler;
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Network handling, mod configuration, items and blocks
		
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		//FMLCommonHandler.instance().bus().register(new ConfigHandler());
		
		ModBlocks.init();
		ModItems.init();
		ModWorld.init();
		ModNetwork.init();
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		//guis, tile entities, recipes
	}	
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//wrap things up
	}

}
