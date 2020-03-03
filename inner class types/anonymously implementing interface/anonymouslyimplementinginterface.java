package innerclassandinterface;
interface demo
{
	void show();
}
public class anonymouslyimplementinginterface {
//anonymous class implementing interface
	static demo obj=new demo() {
	public void show()
	{
	System.out.println("In inner class implementing interface");	
	}
	};
	public static void main(String[] args) {
	obj.show();	
	}

}
