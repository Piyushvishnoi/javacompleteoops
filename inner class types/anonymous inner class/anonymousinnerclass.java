package innerclassandinterface;
class outerclass1
{
	void show()
	{ 
		System.out.println("in show method of outer class");
	}
}
public class anonymousinnerclass {
	static outerclass1 obj=new outerclass1()    //anonymous class
	{
void show()
{super.show(); //use of super
	System.out.println("in show method of inner class");	
}
	};
	public static void main(String[] args) {
		
		obj.show();

	}

}
