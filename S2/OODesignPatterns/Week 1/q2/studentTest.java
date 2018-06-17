/**
 * @(#)studentTest.java
 *
 *
 * @Joseph Tierney
 * @version 1.00 2018/1/24
 */


public class studentTest {

    public static void main(String args[]) {

		//default values
    	student s = new student();

    	student s2 = new student("Joseph Tierney", "Dublin", 8566291, "Information Technology");

    	System.out.print("Default values: " + s.toString());
    	System.out.print(s2.toString());
    }//end main method

}//end class