// ****************************************************
// Reference-based implementation of ADT list.
// ****************************************************
public class ListReferenceBased implements ListInterface {
  //reference to linked list of items
  private Node head;
  private int numItems; //number of items in list

  public ListReferenceBased() {
  	head = null;
  	numItems = 0;
  }//end default constructor

  public void display(){
  	Node myNode = head;

  	for(int i=0;i<numItems;i++){
  		System.out.println(myNode.getItem() + " ");
  		myNode = myNode.getNext();
  	}//end for
  }//end display

  public boolean isEmpty() {
  	if(numItems == 0){
  		return true;
  	}//end if
  	else{
  		return false;
  	}//end else
  }//end isEmpty

  public int size() {
  	return numItems;
  }  // end size

  public void listLargest(){
  	String strLargest[] = new String[numItems];
  	int i = 0;

  	for(Node curr = head; curr != null; curr = curr.getNext()){
  		strLargest[i] = curr.getItem().toString();
  		i++;
  	}//end for

  	int index = 0;
  	int listitemLength = strLargest[0].length();

  	for(int x=1;x < numItems; x++){
  		if(strLargest[x].length() > listitemLength){
  			index = x; listitemLength = strLargest[x].length();
  		}//end if
  	}//end for

  	System.out.println("Largest item in the list (current state): " + strLargest[index]);
  }//end listLargest

  private Node find(int index) {
  //--------------------------------------------------
  //Locates a specified node in a linked list.
  //Precondition: index is the number of the desired
  //node. Assumes that 1 <= index <= numItems+1
  //Postcondition: Returns a reference to the desired
  //node.
  //--------------------------------------------------
  	Node curr = head;

  	for(int i = 0; i < index; i++){
  		curr = curr.getNext();
  	}//end for

  	return curr;
  }// end find

  public Object get(int index) throws ListIndexOutOfBoundsException {
  	if(index >= 0 && index < numItems){
  		Node curr = find(index);
  		return curr.getItem();
  	}//end if
  	else{
  		throw new ListIndexOutOfBoundsException("Error with get");
  	}//end else
  }//end get

  public void add(int index, Object item) throws ListIndexOutOfBoundsException {
  	if(index >= 0 && index <=numItems){
  		Node myNode = new Node(item);

  		if(index == 0){
  			myNode.setNext(head);
  			head = myNode;
  		}//end if
  		else{
  			Node prevNode = find(index-1);
  			myNode.setNext(prevNode.getNext());
  			prevNode.setNext(myNode);
  		}//end else
  		numItems++;
  	}//end if
  	else{
  		throw new ListIndexOutOfBoundsException("Not enough room!");
  	}//end else
  }//end add

  public void remove(int index)throws ListIndexOutOfBoundsException{
  	if(index >= 0 && index < numItems){
  		if(index == 0){
  			head = head.getNext();
  		}//end if
  		else{
  			Node prev = find(index-1);
  			Node curr = prev.getNext();
  			prev.setNext(curr.getNext());
  		}//end else
  		numItems--;
  	}//end if
  	else{
  		throw new ListIndexOutOfBoundsException("List is out of bounds");
  	}//end else
  }//end remove

  public void removeAll() {
    //setting head to null causes list to be
    //unreachable and thus marked for garbage
    //collection
    head = null;
    numItems = 0;
  }//end removeAll
}//end ListReferenceBased