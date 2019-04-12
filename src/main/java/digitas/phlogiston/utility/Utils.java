package digitas.phlogiston.utility;

import java.util.Random;

public class Utils {
	public static Random rand = new Random();
	
	public static int fortuneHelper(int base, int bonus, int fortuneLevel) {
		return (fortuneLevel > 0) ? base: base + bonus + rand.nextInt(bonus*(fortuneLevel-1)); 
	}
}
