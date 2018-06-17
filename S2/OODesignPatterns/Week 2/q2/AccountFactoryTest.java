/**
 * @(#)AccountFactoryTest.java
 * @Joseph Tierney
 * @version 1.00 2018/2/1
 */

public class AccountFactoryTest {

    public static void main(String[] args) {
    	String list1 = new String("C10001 C10002 C10003");
    	String list2 = new String("I20001 I20002 I20003");

    	AccountFactory accFact = new AccountFactory();

    	accFact.getAccountList(list1).display();
    	System.out.println("");

    	AccountList noList2 = accFact.getAccountList(list2);
    	noList2.display();
    	System.out.println("");
    }//end main
}//end class