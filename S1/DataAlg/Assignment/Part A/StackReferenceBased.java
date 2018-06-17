/**
 * @(#)StackReferenceBased.java
 * @Joseph Tierney
 * @version 1.00 2017/10/19
 */

public class StackReferenceBased implements StackInterface{

  	private Node top;
  	private int numItems = 0;
  	boolean balance = false;

  	public StackReferenceBased(){
    	top = null;
    	numItems = 0;
  	}//end default constructor

  	public boolean isEmpty(){
    	return top ==  null;
  	}//end isEmpty

  	public void push(Object newItem){
    	top = new Node(newItem, top);
    	numItems++;
  	}//end push

  	public Object pop() throws StackException{
    	if (!isEmpty()){
    		Node t = top;
    		top = top.getNext();
    		numItems--;
    		return t.getItem();
    	}//end if
    	else{
    		throw new StackException("ERROR: There was a problem on Pop");
    	}//end else
  	}//end pop

  	public void popAll(){
    	top = null;
    	numItems = 0;
  	}//end popAll

  	public Object top() throws StackException{
    	if (!isEmpty()){
      		return top.getItem();
    	}//end if
    	else{
      		throw new StackException("ERROR: There was a problem on Top");
    	}//end else
  	}//end top

  	public void checker(String input){
  		StackReferenceBased stack = new StackReferenceBased();
  		balance = true;
  		int k = 0;

  		while(balance == true && k < input.length()){
  			char ch = input.charAt(k);
  			k++;
  			if(ch == '{'){
  				stack.push('{'); //push an open brace
  			}//end if
  			else if(ch == '}'){
  				if(!stack.isEmpty()){
  					stack.pop(); //pop a matching open brace
  				}//end if
  				else{
  					balance = false;
  				}//end else
  			}//end else if
  		}//end while
  		if(balance && stack.isEmpty()){
  			System.out.println("BALANCED: Program has balanced braces");
  		}//end if
  		else{
  			System.out.println("NOT BALANCED: Program does not have balanced braces");
  		}//end else
  	}//end checker
}//end StackReferenceBased