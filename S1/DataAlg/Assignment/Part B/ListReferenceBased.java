/**
 * @(#)ListReferenceBased.java
 * @Joseph Tierney
 * @version 1.00 2017/10/10
 */

public class ListReferenceBased implements ListInterface {
  	private Node head;
  	private Node tail;
  	private Node curr = head;
  	private int numItems; // number of items in list

  	public ListReferenceBased() {
  		this.head = null;
  		numItems = 0;
  	}//end ListReferenceBased constructor

  	public boolean isEmpty() {
  		return size() == 0;
  	}//end isEmpty

  	public int size() {
  		return numItems;
  	}//end size

  	public void display() {
  		Node curr = head;
  		for(int i = 0; i<numItems; i++){
  			System.out.print(curr.getItem());
  			curr = curr.getNext();
  		}//end for
  	}//end display

  	private Node find(int index) {
  		Node curr = head;
  		//Traverse the list
  		for(int i = 0; i<index; i++){
  			curr = curr.getNext();
  		}//end for
  	return curr;
  	}//end find

  	public Object get(int index) throws ListIndexOutOfBoundsException {
  		if(index >= 0 && index < numItems) {
  			Node curr = find(index);
  			return curr.getItem();
  		}//end if

  		else{
  			throw new ListIndexOutOfBoundsException("ERROR: Unable to get Index");
  		}//end else
  	}//end get

  	public void add(int index, Object item)throws ListIndexOutOfBoundsException {
  		if(index > numItems || index < 0) {
  			throw new ListIndexOutOfBoundsException("ERROR: Unable to Add Data");
  		}//end if

  		if(index == 0) {
  			Node myNode = new Node(item,head);
  			head = myNode;
  		}//end if
  		else{
  			tail = find(index-1);
  			Node myNodeT = new Node(item, null);
  			tail.setNext(myNodeT);
  			tail = tail.getNext();
  			if(index == numItems){
  				tail.setNext(head);
  				tail = myNodeT;
  			}//end if
  		}//end else
  		numItems++;
  	}//end add

  	public void remove(int index) throws ListIndexOutOfBoundsException {
  		if(index > numItems || index < 0) {
  			throw new ListIndexOutOfBoundsException("ERROR: Unable to Remove Data");
  		}//end if

  		if(index == 0) {
  			head = head.getNext();
  			tail.setNext(head);
  		}//end if
  		else{
  			Node myNodeF = this.find(index-1);
  			Node myNode = myNodeF.getNext();
  			myNodeF.setNext(myNode.getNext());
  		}//end else
  		numItems--;
  	}//end remove

  	public void removeAll() {
  		head = null;
  		numItems = 0;
  	}//end removeAll
}//end ListReferenceBased