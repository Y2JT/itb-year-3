/**
 * @(#)CurrentList.java
 * @Joseph Tierney
 * @version 1.00 2018/2/1
 */

import java.io.*;
import java.util.*;

public class CurrentList extends AccountList{

	int size;

    public CurrentList(String list) {

    	size = 0;

    	StringTokenizer token = new StringTokenizer(list);

    	size = token.countTokens();

    	//Allocate space for the array
        current_list = new String[size];

        //Store each list item in the appropriate array
        for(int i = 0; i < size; i++){
            current_list[i] = token.nextToken();
        }//end for
    }//end CurrentList

    public void display(){
    	System.out.print("Current Account List\n");
        for(int i = 0; i < size; i++){
            System.out.println("[" + i + "] = " + current_list[i]);
        }//end for
    }//end display
}//end class