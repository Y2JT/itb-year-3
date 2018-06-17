/**
 * @(#)InvestList.java
 * @Joseph Tierney
 * @version 1.00 2018/2/1
 */

import java.io.*;
import java.util.*;

public class InvestList extends AccountList{

	int size;

    public InvestList(String list) {

    	size = 0;

    	StringTokenizer token = new StringTokenizer(list);

    	size = token.countTokens();

    	//Allocate space for the array
        invest_list = new String[size];

        //Store each list item in the appropriate array
        for(int i = 0; i < size; i++){
            invest_list[i] = token.nextToken();
        }//end for
    }//end InvestList

    public void display(){
    	System.out.print("Investment Account List\n");
        for(int i = 0; i < size; i++){
            System.out.println("[" + i + "] = " + invest_list[i]);
        }//end for
    }//end display
}//end class