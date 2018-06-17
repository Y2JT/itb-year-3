/**
 * @(#)NumberFactoryTest.java
 * @Joseph Tierney
 * @version 1.00 2018/2/1
 */

public class NumberFactoryTest {

    public static void main(String[] args) {
    	String list1 = new String("1 2 3 4 5 6 7 8 9 10");
    	String list2 = new String("1.1 2.2 3.3 4.4 5.5 6.6 7.7 8.8 9.9 10.1");
    	String list3 = new String("0xA15 0xFBA2 0xFFC 0xA26C");
    	String list4 = new String("A B C D");

    	NumberFactory nofact = new NumberFactory();

    	nofact.getNumberList(list1).display();
    	System.out.println("");

    	NumberList noList2 = nofact.getNumberList(list2);
    	noList2.display();
    	System.out.println("");

    	NumberList noList3 = nofact.getNumberList(list3);
    	noList3.display();
    	System.out.println("");

    	NumberList noList4 = nofact.getNumberList(list4);
    	noList4.display();
    	System.out.println("");
    }//end main
}//end class