import java.util.LinkedList;
import java.util.Queue;
//queues is an ordered list of objects with its use limited to insert elements at the end of the list and deleting elements from the start of list
//queue is an interface which even can be implemented by LINKEDLIST
public class queuesinjava {
 
	public static void main(String[] args) {
	Queue <Integer> obj=new LinkedList<>();
	for(Integer i=0;i<5;i++)   
	{ 
		obj.add(i);
		
	}
	//to show elements of queue
	System.out.println(obj);
	//toremove head of the queue
	int objrem=obj.remove();
	System.out.println("removed head element is: "+objrem);
	//after removing queue is
	System.out.println("after removing an element queue is: "+obj);
	//to view what is on the head of queue
	int objhead=obj.peek();
	System.out.println("what is on the head of queue: "+ objhead);
	//to find size of the queue
	int objsize=obj.size();
	System.out.println("Size of queue is: "+objsize);
	}

}
