package tutorial;
interface staticdemo
{
	int i=10; // in interface every variable declared will be bydefault constant or we can say final keyword.
	void add();
	//for default methods we have to make an object of interface which is not possible
	//or we have to implement it through class and then we can call this method through class
	static void show()
	{
		System.out.println("in statically defined method");
	}
}
public class staticmethodsinintefaces {

	public static void main(String[] args) {
staticdemo.show();  //here we can directly call show function because it was statically defined

	}

}
