package linkedlistjava;
class linkedlist
{
	node head;
	static class node{
		int data;
		node next;
		node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static linkedlist insert(linkedlist list,int data)   //insertion in the list
	{
		node new_node=new node(data);   //at the starting of the list 
		new_node.next=null;
		if(list.head==null)
		{
			list.head=new_node;
		}
		else    //to traverse till we get the null
		{
			node last=list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_node;	
		}
		return list;	
	}

public static void traversing(linkedlist list)
{
node currentnode=list.head;
while(currentnode.next==null)
{
	System.out.println(currentnode.data+" ");
	currentnode=currentnode.next;
}
}

	public static void main(String[] args) {
		
linkedlist list=new linkedlist();
list=insert(list,10);
list=insert(list,8);
traversing(list);
	}

}
