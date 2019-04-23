package digitas.phlogiston;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import digitas.phlogiston.block.ModBlocks;
import digitas.phlogiston.item.ModItems;
import digitas.phlogiston.proxy.IProxy;
import digitas.phlogiston.recipe.ModRecipes;
import digitas.phlogiston.reference.Reference;
import digitas.phlogiston.utility.EventHandler;
import digitas.phlogiston.utility.ModFixes;
import digitas.phlogiston.world.ModWorld;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS, dependencies = Reference.DEPENDENCIES)
public class Phlogiston {
	
	@Mod.Instance(Reference.MOD_ID)
	public static Phlogiston instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	//public SimpleNetworkWrapper packetHandler;
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ModBlocks.preInit();
		ModItems.preInit();
		ModWorld.preInit();
		//ModNetwork.init();
		ModFixes.preInit();
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModFixes.init();
		ModRecipes.init();
		
		MinecraftForge.EVENT_BUS.register(new EventHandler());
	}	
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		ModWorld.postInt();	
	}
	
}
