/**
 * @(#)IntList.java
 * @Joseph Tierney
 * @version 1.00 2018/2/1
 */

import java.io.*;
import java.util.*;

public class IntList extends NumberList{

	int size;

    public IntList(String list) {
    	size = 0;

    	StringTokenizer token = new StringTokenizer(list);

    	size = token.countTokens();

    	//Allocate some space for the array
    	int_list = new int[size];

    	//Store each list item in the approriate array
    	for(int i = 0; i < size; i++){
    		int_list[i] = Integer.parseInt(token.nextToken());
    	}//end for
    }//end IntList

    public void display(){
    	System.out.print("Integer List\n");
    	for(int i = 0; i < size; i++){
    		System.out.println("[" + i + "] = " + int_list[i]);
    	}//end for
    }//end display
}//end class