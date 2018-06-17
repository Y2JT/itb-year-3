/**
 * @(#)studentTest.java
 *
 *
 * @Joseph Tierney
 * @version 1.00 2018/1/24
 */


public class studentTest {

    public static void main(String args[]) {

    	student s = new student("Test", "Test", 0, "Test");

    	s.setName("Joseph Tierney");
    	s.setAddress("Dublin");
    	s.setPhone(8566291);
    	s.setCourse("Information Technology");

    	System.out.print(s.toString());
    }//end main method

}//end class