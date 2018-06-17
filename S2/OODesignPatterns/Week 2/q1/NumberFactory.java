/**
 * @(#)NumberFactory.java
 * @Joseph Tierney
 * @version 1.00 2018/2/1
 */

public class NumberFactory {

    public NumberList getNumberList(String list) {

    	//Check for existence of '.'
    	int i = list.indexOf('.');

    	if(list.matches("[A-Z ]*")){
    		return new CharList(list);
    	}//end if
    	if(list.matches("^0x.*")){
    		return new HexList(list);
    	}//end if
    	if(i != -1){
    		return new DoubleList(list);
    	}//end if
    	else{
    		return new IntList(list);
    	}//end else
    }//end getNumberList
}//end class