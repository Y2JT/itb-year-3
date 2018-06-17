/**
 * @(#)vehicleTest.java
 *
 *
 * @author
 * @version 1.00 2018/1/28
 */


public class vehicleTest {

    public static void main(String args[]) {

    	vehicle v1 = new vehicle("Black", "Ford", "Petrol", 1200);
    	car v2 = new car("Black", "Ford", "Petrol", 1200, 4);
    	motorbike v3 = new motorbike("Black", "Ford", "Petrol", 2000, 0, "Yes");

		System.out.print(v1.toString());
    	System.out.print(v2.toString());
    	System.out.println("\nVRT of car: " + v1.VRT());
    	System.out.print(v3.toString());
    	System.out.println("\nVRT of motorbike: " + v3.VRT());

    }
}