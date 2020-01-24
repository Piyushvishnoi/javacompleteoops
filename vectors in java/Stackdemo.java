package linkedlistjava;

import java.util.Stack;

public class Stackdemo {
public static void showpush(Stack obj1,int a)
{
	obj1.push(new Integer(a));
	System.out.println("pushing "+ a);
	System.out.println("Stack now is: " + obj1);
}
public static void showpop(Stack obj1)
{
	Integer a=(Integer)obj1.pop();
	System.out.println("popped element is " + a);
	System.out.println("Stack now is: " + obj1);
	
}
	public static void main(String[] args) {
	Stack obj=new Stack();
	showpush(obj,2);
	showpush(obj,3);
	showpush(obj,4);
	showpush(obj,1);
	showpop(obj);
	}

}
