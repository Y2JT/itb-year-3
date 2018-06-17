/**
 * @(#)student.java
 * @Joseph Tierney
 * @version 1.00 2018/1/24
 */


public class student {

	private String name;
	private String address;
	private int phoneNo;
	private String course;

    public student() {
    	this.name = name;
    	this.address = address;
    	this.phoneNo = phoneNo;
    	this.course = course;
    }//end constructor

    public student(String name, String address, int phoneNo, String course) {
    	this.name = name;
    	this.address = address;
    	this.phoneNo = phoneNo;
    	this.course = course;
    }//end constructor

    public String toString(){
    	return "\nStudent Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNo + "\nCourse: " + course + "\n\n";
    }//end toString

}//end class