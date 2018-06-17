/**
 * @(#)AccountList.java
 * @Joseph Tierney
 * @version 1.00 2018/2/1
 */

public abstract class AccountList {

	protected String[] current_list;
	protected String[] invest_list;

    public AccountList() {
    	current_list = null;
    	invest_list = null;
    }//end AccountList

    public String[] getCurrentList(){
    	return current_list;
    }//end getCurrentList

    public String[] getInvestList(){
    	return invest_list;
    }//end getInvestList

    public void display(){
    }//end display
}//end class