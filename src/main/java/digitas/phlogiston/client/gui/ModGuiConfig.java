package digitas.phlogiston.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import digitas.phlogiston.reference.Reference;
import digitas.phlogiston.utility.ConfigHandler;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig {
	
	public ModGuiConfig(GuiScreen guiScreen) {
		super(guiScreen,
				new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MOD_ID,
				false,
				false,
				GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
	}

}
