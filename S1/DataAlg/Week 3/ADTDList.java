 class ADTDList implements DListInterface
{

	Node head;
	Node tail;
	int numItems;
	// TODO: Implement list operations here
	public boolean isEmpty(){
		if(numItems == 0){
			return true;
		}
		else{
			return false;
		}
	}//end isEmpty

	public int size(){
		return numItems;
	}//end size

	public void add (int index, Object item )throws ListIndexOutOfBoundsException  {
		Node tempNode = new Node(item);
        if(index < 0 || index > numItems){
            throw new ListIndexOutOfBoundsException("Out of bounds: add");
        }//end if
        else if(index == 0){
            Node h1 = new Node(item);
        	if(head == null){
            	head = h1;
            	tail = head;
        	}//end if
        	else{
            	h1.setNext(head);
            	head.setPrev(h1);
            	head = h1;
        	}//end else
        	numItems++;
        }//end else if
        else if(index == numItems){
            Node t2 = new Node(item);
        	if(head == null){
            	head = t2;
            	tail = head;
        	}//end if
        	else{
            	tail.setNext(t2);
            	t2.setPrev(tail);
            	tail = t2;
       	 	}//end else
        	numItems++;
        }//end else if
        else{
            Node curr = head;
            for(int i = 0; i < index; i++){
                curr = curr.getNext();
            }//end for
            Node previous = curr.getPrev();
            previous.setNext(tempNode);
            tempNode.setPrev(previous);
            tempNode.setNext(curr);
            curr.setPrev(tempNode);
            numItems++;
        }//end else
	}//end add

	public Node find(int index){
		Node curr = head;
		for(int i = 0; i < index; i++){
			curr = curr.getNext();
		}//end for
		return curr;
	}//end find

	public void remove(int index)throws ListIndexOutOfBoundsException  {
	   if(index >= 0 && index < numItems){
	   	if(index == 0){
	   		head = head.getNext();
	   	}//end inner if
	   	else{
	   		Node prev = find(index - 1);
	   		Node curr = prev.getNext();
	   		prev.setNext(curr.getNext());
	   	}//end else
	   	numItems--;
	   }//end if
	   else{
	   		throw new ListIndexOutOfBoundsException("Index out of bounds: remove");
	   	}//end else
	}//end remove

	public Object get(int index) throws ListIndexOutOfBoundsException {
		if(index >= 0 && index <= numItems){
			Node curr = find(index);
			return curr.getItem();
		}//end if
		else{
			throw new ListIndexOutOfBoundsException("Index out of range: get method");
		}//end else
	}//end get

	public void removeAll(){
      head = null;
      numItems =0;
	}//end removeAll

	public void displayHeadToTail(){
		for(Node curr = head; curr != null;curr = curr.getNext()){
			System.out.println(curr.getItem());
		}//end for
	}//end displayHeadToTail

	public void displayTailToHead(){
		for(Node curr = tail; curr != null; curr = curr.getPrev()){
			System.out.println(curr.getItem());
		}//end for
	}//end displayTailToHead

}//end class