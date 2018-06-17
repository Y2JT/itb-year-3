/**
 * @(#)motorbike.java
 *
 *
 * @author
 * @version 1.00 2018/1/28
 */


public class motorbike extends car{

	private String carrier;

    public motorbike(String colour, String type, String engine, int price, int noDoors, String carrier) {
    	super(colour, type, engine, price, noDoors);
    	this.carrier = carrier;
    }//end constructor

    public double VRT(){
    	return price *.13;
    }//end VRT

    public String toString(){
    	return super.toString() + "\nCarrier: " + carrier;
    }//end toString

}//end class