package digitas.phlogiston.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

public class PhlogistonMessage implements IMessage {
	
	public PhlogistonMessage() {}
	
	private int toSend;
	public PhlogistonMessage(int toSend) {
		this.toSend = toSend;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		buf.writeInt(toSend);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		toSend = buf.readInt();
	}
	
	public static class PhlogistonMessageHandler implements IMessageHandler<PhlogistonMessage, IMessage> {

		@Override
		public IMessage onMessage(PhlogistonMessage message, MessageContext ctx) {
			// TODO
			//Acces message data via message.toSend
			//Make sure to do stuff server side
			//Schedule tasks on the server thread
			
			//Check world.isBlockLoaded(pos) when accessing blocks
			
			//Choose a return package
			return null;
		}
		
	}

}
