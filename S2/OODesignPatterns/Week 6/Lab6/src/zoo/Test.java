package zoo;

public class Test {

	public static void main(String[] args) {
		LizardAdapter lAdapt = new LizardAdapter();
		AlligatorAdapter aAdapt = new AlligatorAdapter();
		lAdapt.feed();
		System.out.println("\n");
		aAdapt.feed();
	}

}