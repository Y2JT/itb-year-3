/**
 * @(#)CharList.java
 * @Joseph Tierney
 * @version 1.00 2018/2/1
 */

import java.io.*;
import java.util.*;

public class CharList extends NumberList{

	int size;

    public CharList(String list) {

    	size = 0;

    	StringTokenizer token = new StringTokenizer(list);

        size = token.countTokens();

        //Allocate space for the array
        char_list = new String[size];

        //Store each list item in the appropriate array
        for(int i = 0; i < size; i++){
            char_list[i] = token.nextToken();
        }//end for
    }//end CharList

    public void display(){
    	System.out.print("Character List\n");
        for(int i = 0; i < size; i++){
            System.out.println("[" + i + "] = " + char_list[i]);
        }//end for
    }//end display
}//end class