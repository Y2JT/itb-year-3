/**
 * @(#)Lab5.java
 * @Joseph Tierney
 * @version 1.00 2017/10/29
 */

import java.util.Scanner;

public class Lab5 {

	public static boolean isPal(String str){

		QueueBased queue = new QueueBased();
		StackReferenceBased stack = new StackReferenceBased();

		for(int i = 0; i < str.length(); i++){
			queue.enqueue(str.charAt(i));
			stack.push(str.charAt(i));
		}//end for

		while(!queue.isEmpty()){
			if(queue.dequeue() != stack.pop()){
				return false;
			}//end if
		}//end while
		return true;
	}//end isPal

	public static void main(String[] args){

		String struser;	//for user input

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		struser = input.nextLine();
		struser = struser.toUpperCase();
		if(isPal(struser) == false){	//if the word the user inputs is NOT a palindrome
			System.out.println("\n [ *** " + struser + " is NOT a Palindrome *** ]\n\n");
		}//end if
		else{	//the word is a palindrome
			System.out.println("\n [ *** " + struser + " is a Palindrome *** ]\n\n");
		}//end else
	}//end main

}//end class