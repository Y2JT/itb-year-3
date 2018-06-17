/**
 * @(#)DoubleList.java
 * @Joseph Tierney
 * @version 1.00 2018/2/1
 */

import java.io.*;
import java.util.*;

public class DoubleList extends NumberList{

	int size;

    public DoubleList(String list) {
    	size = 0;

		StringTokenizer token = new StringTokenizer(list);

		size = token.countTokens();

		//Allocate some space for the array
		double_list = new double[size];

		//Store each list item in the appropriate array
		for(int i = 0; i < size; i++){
			double_list[i] = Double.parseDouble(token.nextToken());
		}//end for
    }//end DoubleList

    public void display(){
    	System.out.print("Double List\n");
		for(int i = 0; i < size; i++){
			System.out.println("[" + i + "] = " + double_list[i]);
		}//end for
    }//end display
}//end class