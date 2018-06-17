package zoo;

import zoo.Animal;
import zoo.lizard;

public class LizardAdapter extends Animal{

	protected void feed() {
		lizard loppy = new lizard(50);
		loppy.feedlizard();
	}

}