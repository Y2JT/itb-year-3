/**
 * @(#)car.java
 *
 *
 * @author
 * @version 1.00 2018/1/28
 */


public class car extends vehicle{

	private int noDoors;

    public car(String colour, String type, String engine, int price, int noDoors) {
    	super(colour, type, engine, price);
    	this.noDoors = noDoors;
    }//end constructor

    public String toString(){
    	return super.toString() + "\nNumber of Doors: " + noDoors + "\n\n";
    }//end toString

}//end class