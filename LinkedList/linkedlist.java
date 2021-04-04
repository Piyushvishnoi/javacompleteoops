package new_java_programs;

public class linkedlist {
 node head;
public void insert(int data)
{
	node n=new node();
	n.data=data;
	n.next=null;
	
	if(head==null)
	{
		head=n;
	}
	else
	{
		node n1=head; ///temporary node
		while(n1.next!=null)
		{
			n1=n1.next;
		}
		n1.next=n;
	}
}
public void show()
{
	node n= head;
	while(n.next!=null)
	{
		System.out.println(n.data);
		n=n.next;
	}
	System.out.println(n.data);
}
}
