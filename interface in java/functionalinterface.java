package tutorial;
interface fi
{
	void show();
}
public class functionalinterface {

	public static void main(String[] args) {
fi d=() -> System.out.println("lambda expression"); // -> lambda expression can be only used with functional interface
d.show(); 
	}

}
