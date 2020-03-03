package innerclassandinterface;
class demo1{
interface demointerface
{
	void show();
}
}
class testing implements demo1.demointerface{
	public void show()
	{
		System.out.println("In testing class implementing interface");
	}
}
public class interfaceinsideclass  {
	public static void main(String[] args) {
		testing obj=new testing();
		obj.show();
		//or we can do it as 
		demo1.demointerface t;
		t=new testing();
		t.show();

	}

}
