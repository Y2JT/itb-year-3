/**
 * @(#)HexList.java
 * @Joseph Tierney
 * @version 1.00 2018/2/1
 */

import java.io.*;
import java.util.*;

public class HexList extends NumberList{

	int size;

    public HexList(String list) {

    	size = 0;

        StringTokenizer token = new StringTokenizer(list);

        size = token.countTokens();

        //Allocate space for the array
        hex_list = new String[size];

        //Store each list item in the appropriate array
        for(int i = 0; i < size; i++){
            hex_list[i] = token.nextToken();
        }// end for
    }//end HexList

    public void display(){
        System.out.print("Hexadecimal List\n");
        for(int i = 0; i < size; i++){
            System.out.println("[" + i + "] = " + hex_list[i]);
        }//end for
    }//end display
}//end class