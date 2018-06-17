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
}//end StackReferenceBased