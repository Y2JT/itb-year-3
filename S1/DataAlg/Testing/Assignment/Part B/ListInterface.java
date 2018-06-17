/**
 * @(#)ListInterface.java
 * @Joseph Tierney
 * @version 1.00 2017/10/10
 */

public interface ListInterface{
  // list operations:
  public boolean isEmpty();
  public int size();
  public void add(int index, Object item) throws ListIndexOutOfBoundsException;
  public void remove(int index) throws ListIndexOutOfBoundsException;
  public Object get(int index) throws ListIndexOutOfBoundsException;
  public void removeAll();
} // end ListInterface