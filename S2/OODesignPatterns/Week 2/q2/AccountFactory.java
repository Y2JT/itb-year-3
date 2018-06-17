/**
 * @(#)AccountFactory.java
 * @Joseph Tierney
 * @version 1.00 2018/2/1
 */

public class AccountFactory {

    public AccountList getAccountList(String list) {

    	//Check for existence of '.'
    	int i = list.indexOf('.');

    	if(list.matches("I")){
    		return new InvestList(list);
    	}//end if
    	else{
    		return new CurrentList(list);
    	}//end else
    }//end getAccountList
}//end class