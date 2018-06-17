class TestDList
{
	public static void main (String args[])
	{
		ADTDList dList= new ADTDList();
		try {

			dList.add(0, new Integer(5));
			dList.add(1, new Integer(10));
			dList.add(2, new Integer(6));
			dList.add(3, new Integer(12));
			dList.add(4, new Integer(20));
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

		System.out.println("Head to tail output....");
		dList.displayHeadToTail();

		System.out.println("Tail to head output....");
		dList.displayTailToHead();

		// TODO: write a test to check for insertion in the middle of the list
		try{
			System.out.println("Attempting to add a new item in the middle of the list");
			dList.add(3, "Test");
		}
		catch(ListIndexOutOfBoundsException e){
			System.out.println("Invalid index!!");
		}

		System.out.println("Updated head output: ");
		dList.displayHeadToTail();

		System.out.println("Updated tail output: ");
		dList.displayTailToHead();

		// TODO: write a test to check for deletion of the head
		try{
			System.out.println("Removing " + dList.get(0) + " from list");
			dList.remove(0);
		}
		catch(ListIndexOutOfBoundsException e){
			System.out.println("Invalid index!!");
		}

		System.out.println("Updated head output: ");
		dList.displayHeadToTail();

		System.out.println("Attempting to remove item at index 6....");

		// TODO: write a test to check for deletion of a non existing index
		try{
			System.out.println("Removing item at index 6: " + dList.get(6));
		}
		catch(ListIndexOutOfBoundsException e){
			System.out.println("Invalid index!!");
		}

		//Remove all items from the list
		System.out.println("Removing all items from the list.");
		dList.removeAll();

		//Is the list empty?
		System.out.println("List is Empty? = " + dList.isEmpty());


	}
}