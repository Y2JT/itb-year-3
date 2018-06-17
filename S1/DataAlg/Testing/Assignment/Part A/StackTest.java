/**
 * @(#)StackTest.java
 * @Joseph Tierney
 * @version 1.00 2017/10/19
 */

import java.io.*;

public class StackTest{

	public static void main(String[] args) {
		StackReferenceBased stack = new StackReferenceBased();

		String myProgFile = args[0];
		BufferedReader myReader = null;
		String readerLine = null;

		try{
			myReader = new BufferedReader(new FileReader(myProgFile));
			while((readerLine = myReader.readLine()) != null){
				stack.checker(readerLine);
			}//end while
		}//end try
		catch(IOException e){
			e.printStackTrace();
		}//end catch
	}//end main
}//end class