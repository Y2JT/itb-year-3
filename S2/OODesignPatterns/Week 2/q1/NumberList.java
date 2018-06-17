/**
 * @(#)NumberList.java
 * @Joseph Tierney
 * @version 1.00 2018/2/1
 */

public abstract class NumberList {

	protected int[] int_list;
	protected double[] double_list;
	protected String[] hex_list;
	protected String[] char_list;

    public NumberList() {
    	int_list = null;
		double_list = null;
		hex_list = null;
		char_list = null;
    }//end NumberList

    public int[] getIntList(){
    	return int_list;
    }//end getIntList

    public double[] getDoubleList(){
    	return double_list;
    }//end getDoubleList

	public String[] getHexList(){
		return hex_list;
	}//end getHexList

	public String[] getCharList(){
		return char_list;
	}//end getCharList

	public void display(){
	}//end display

	public Number sum(){
		return null;
	}//end sum
}//end class