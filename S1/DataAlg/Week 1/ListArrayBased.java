public class ListArrayBased implements ListInterface{

	private Object items[];
	private int numItems;
	private final int MAX_ITEMS = 10;

	ListArrayBased(){
		items = new Object[MAX_ITEMS];
		numItems = 0;
	}//end constructor

	public void display(){
		for(int i=0;i<numItems;i++){
			System.out.println(items[i]);
		}
	}//end display

	public boolean isEmpty(){
		if (numItems == 0)
			return true;
		else
			return false;
	}//end isEmpty

  	public int size(){
  		return numItems;
  	}//end size

  	public void add(int index, Object item) throws ListIndexOutOfBoundsException, ListException{
  		if(index >= 0 && index <= numItems){
  			for(int pos = numItems-1; pos>=index;pos--){
  				items[pos+1] = items[pos];
  			}//end for
  			items[index] = item;
  			numItems++;
  		}//end if
  		else{
  			throw new ListIndexOutOfBoundsException ("Error, no free space available!");
  		}//end else
    }//end add

  	public Object get(int index)throws ListIndexOutOfBoundsException{
  		   if(index >=0 && index < numItems){
  		   	return items[index];
  		   }//end if
  		   else{
  		   	throw new ListIndexOutOfBoundsException("Cannot find item");
  		   }//end else
    }//end get

  	public void remove(int index) throws ListIndexOutOfBoundsException{
  		if(index >=0 && index < numItems){
  			for(int pos = index+1;pos<size();pos++){
  				items[pos-1] = items[pos];
  			}//end for
  			numItems--;
  		}//end if
  		else{
  			throw new ListIndexOutOfBoundsException ("Something went wrong");
  		}//end else
    }//end remove

  	public void removeAll(){
  		items = new Object[MAX_ITEMS]; // Old list has no ref - Java Garbage collector
  		numItems = 0;
  	}//end removeAll
}//end class