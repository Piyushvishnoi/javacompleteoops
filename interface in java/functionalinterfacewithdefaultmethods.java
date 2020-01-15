package tutorial;
//interface can also have method definitions with default keyword
interface fid
{
	void show();
	default void write()
	{
		System.out.println("in interface methods can be defined");
	}
}
public class functionalinterfacewithdefaultmethods {

	public static void main(String[] args) {
		fid f=new fid() 
				{
			public void show()
			{
			System.out.println("in show");
			}
				};
f.show();
f.write();
fid f1=() -> System.out.println("using anonymous class");
f1.show();
	}

}
