package digitas.phlogiston.init;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import digitas.phlogiston.network.PhlogistonMessage;
import digitas.phlogiston.network.PhlogistonMessage.PhlogistonMessageHandler;
import digitas.phlogiston.reference.Reference;

public class ModNetwork {
	
	public static SimpleNetworkWrapper wrapper = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID);
	
	public static int id = 0;
	
	public static void init() {
		wrapper.registerMessage(PhlogistonMessageHandler.class, PhlogistonMessage.class, id++, Side.CLIENT);
		wrapper.registerMessage(PhlogistonMessageHandler.class, PhlogistonMessage.class, id++, Side.SERVER);
		// REGISTER BOTH SIDES IF PACKET GOES TWO WAYS [SIDE = DESTINATION OF PACKET]
	}
	
	//Using packets:
	// Call from the source of the packet: INSTANCE.sendToServer(new Message(data))
	// or
	// INSTANCE.sendTo..... whatever client option is required
}
