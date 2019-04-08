package digitas.phlogiston.utility;

import java.util.ArrayList;

import forestry.api.apiculture.BeeManager;
import forestry.api.apiculture.IAlleleBeeSpecies;
import forestry.api.genetics.AlleleManager;
import forestry.api.genetics.IAllele;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModFixes {
	public static void preInit() {
		// Pam's sesame fix
		if (ModCompat.isHarvestCraftLoaded()) {
			ArrayList<ItemStack> sesame = OreDictionary.getOres("cropSesame");
			for (ItemStack stack : sesame) {
				OreDictionary.registerOre("cropSesameseed", stack);
			}
		}
	}
	public static void init() {
		// Extrabees breeding fix
		if (ModCompat.isForestryLoaded() && ModCompat.isExtrabeesLoaded()) {
			IAlleleBeeSpecies bee1 = (IAlleleBeeSpecies) AlleleManager.alleleRegistry.getAllele("forestry.speciesRural");
			IAlleleBeeSpecies bee2 = (IAlleleBeeSpecies) AlleleManager.alleleRegistry.getAllele("extrabees.species.fruit");
			IAllele[] bee3 = BeeManager.beeRoot.getTemplate("extrabees.species.alcohol");
			BeeManager.beeMutationFactory.createMutation(bee1, bee2, bee3, 10);
		}
	}
	
	public static void postInit() {
	
	}
	
	
}
