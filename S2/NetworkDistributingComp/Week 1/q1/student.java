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

    public student(String name, String address, int phoneNo, String course) {
    	this.name = name;
    	this.address = address;
    	this.phoneNo = phoneNo;
    	this.course = course;
    }//end constructor

    public void setName(String name){
    	this.name = name;
    }//end setName

    public String getName(){
    	return name;
    }//end getName

    public void setAddress(String address){
    	this.address = address;
    }//end setAddress

    public String getAddress(){
    	return address;
    }//end getAddress

    public void setPhone(int phoneNo){
    	this.phoneNo = phoneNo;
    }//end setPhone

    public int getPhone(){
    	return phoneNo;
    }//end getPhone

    public void setCourse(String course){
    	this.course = course;
    }//end setCourse

    public String getCourse(){
    	return course;
    }//end getCourse

    public String toString(){
    	return "\nStudent Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNo + "\nCourse: " + course + "\n\n";
    }//end toString

}//end class