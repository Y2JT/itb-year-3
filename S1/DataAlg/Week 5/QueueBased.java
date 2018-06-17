/**
 * @(#)QueueBased.java
 * @Joseph Tierney
 * @version 1.00 2017/10/29
 */

public class QueueBased implements QueueInterface{

	final int MAX_QUEUE = 50;
	private Object palinInput[];
	private int qfront;
	private int qback;
	private int numItems;

    public QueueBased() {
    	palinInput = new Object[MAX_QUEUE];
    	qfront = 0;
    	qback = MAX_QUEUE - 1;
    	numItems = 0;
    }//end constructor

    public boolean isEmpty(){
    	return numItems == 0;
    }//end isEmpty

    public boolean isFull(){
    	return numItems == MAX_QUEUE;
    }//end isFull

    public void enqueue(Object newItem) throws QueueException{
    	if(!isFull()){
    		qback = (qback+1)%MAX_QUEUE;
    		palinInput[qback] = newItem;
    		numItems++;
    	}//end if
    	else{
    		throw new QueueException("ERROR: Queue is full");
    	}//end else
    }//end enqueue

    public Object dequeue() throws QueueException{
    	if(!isEmpty()){
    		Object queueFront = palinInput[qfront];
    		qfront = (qfront+1)%MAX_QUEUE;
    		numItems--;
    		return queueFront;
    	}//end if
    	else{
    		throw new QueueException("ERROR: Queue Empty!");
    	}//end else
    }//end dequeue

    public void dequeueAll(){
    	palinInput = new Object[MAX_QUEUE];
    	qfront = 0;
    	qback = MAX_QUEUE - 1;
    	numItems = 0;
    }//end dequeueAll

    public Object peek() throws QueueException{
    	if(!isEmpty()){
    		return palinInput[qfront];
    	}//end if
    	else{
    		throw new QueueException("ERROR: Queue empty");
    	}//end else
    }//end peek
}//end class