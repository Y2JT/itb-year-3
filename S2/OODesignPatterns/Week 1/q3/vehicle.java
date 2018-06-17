/**
 * @(#)vehicle.java
 *
 *
 * @author
 * @version 1.00 2018/1/24
 */


public class vehicle {

	private String colour;
	private String type;
	private String engine;
	public int price;

    public vehicle(String colour, String type, String engine, int price) {

    	this.colour = colour;
    	this.type = type;
    	this.engine = engine;
    	this.price = price;
    }//end constructor

    public double VRT(){
    	return price * .21;
    }//end VRT

    public String toString(){
    	return "\nColour: " + colour + "\nType: " + type + "\nEngine: " + engine + "\nPrice: " + price + "\n\n";
    }//end toString

}//end class