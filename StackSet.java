/**
 * COMP 410
 * See inline comment descriptions for methods we need that are
 * not described in the interface.
 *
*/
package assignment1;

public class StackSet implements StackSet_Interface {
  private Node head;  
  private final int limit;  
  private int size; 
  
  public StackSet( int maxNumElts ){ 
    head = null;                 
    limit = maxNumElts;          //you may add fields if you need to
    size = 0;
  }
  
  /*public StackSet(int maxNumElts, String x) {
	  	head = new NodeImpl(1);                 
	    limit = maxNumElts;          //you may add fields if you need to
	    size = 1;    
  }*/
 

  
  
  
  
 
  
  
  
  public boolean push(double elt) {
	  // if StackSet is null
	  if(head == null) {
	  Node n = new NodeImpl(elt, head);
	  head = n;
	  size++;
	  return true;
	  }
	  // if elt = head already
	  if(head.getValue() == elt) {
		  return true;
	  }
	  // if size = limit
	  if(size() == limit() ) { return false;}
	
	  // check if elt is in the stack somewhere 
	  
	  if(size() < limit()) {
	  Node temp = head;
	  for(int i = 0 ; i < size() ; i++) {
		  // if elt is in the stack
		  if(temp.getNext() != null &&
				  temp.getNext().getValue() == elt  
				  ) {
			  Node n = new NodeImpl(elt, temp);
			  head = n;
			  return true;
		  }
		  // if elt is not in the stack
		  else {
			  Node n = new NodeImpl(elt, head);
			  head = n; 
			  size++;
			  return true;
		  }
	  }
	  }
	  
	 return false;
  }// end push
  
  
  
  
  
  
  
  
  
  
  
  public boolean pop () {
	  if(isEmpty() == true) {
		  return false;
	  }
	  if(isEmpty() == false) {
		  Node temp = new NodeImpl(Double.NaN, head);
		  temp = head;
		  head = head.getNext();
		  temp.setNext(null);
		  size --;
		  return true;
	  } 
	  return false;
  }
  
  public double peek () {
	  if(size >= 1) {
		  return head.getValue();
	  } 
	  return Double.NaN;
  }
  
  public boolean contains(double elt) {
	  
	  if(isEmpty() == false) {
		  if(head.getValue() ==  elt) {
				 return true;}
		  if(head.getNext() != null) {
	  for (int i = 0 ; i < size() ; i++) {
		 if(head.getNext().getValue() ==  elt) {
			 return true;} 
	  } // end for loop
	  }
	  }
	  
	  
	  return false;
  }

  
  
  public int size () {
	 return this.size;
  }
  
  public int limit () {
	  return this.limit;
  }
  
  public boolean isEmpty() {
	  return size() == 0;
  }
  
  public boolean isFull () {
	  return size() == limit();
  }
  
  
  
  //implement all methods of the interface, and 
  //also include the getRoot method below that we made for testing purposes. 
  //Feel free to implement private helper methods!
  //you may add any fields you need to add to make it all work... 
  
  public Node getRoot(){ //leave this method as is, used by the grader to grab 
    return head;         //your data list easily.
  }

}