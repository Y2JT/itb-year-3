/**
 * @(#)QueueInterface.java
 * @Joseph Tierney
 * @version 1.00 2017/10/29
 */


public interface QueueInterface {

	//public void createQueue();
	//creates an empty queue

	public boolean isEmpty();
	//determines whether a queue is empty

	public boolean isFull();
	//determines whether the queue is full

	public void enqueue(Object newItem) throws QueueException;
	//adds newItem at the back of a queue.
	//Throws QueueException if the operation is not successful.

	public Object dequeue() throws QueueException;
	//retrieves and removes the front of a queue
	//Throws QueueException if the operation is not successful.

	public void dequeueAll();
	//remove all items from the front of a queue

	public Object peek() throws QueueException;
	//retrieves the front of a queue, that is,
	//retrieves the item that was added earliest.
	//Throws QueueException if the operation is not successful.
	//The queue is unchanged
}//end class