package tutorial;
abstract class first1
{
	public abstract void eat();
}
class second extends first1
{
	public void eat()
	{
		System.out.println("in class second");
	}
}

public class abstractclassdemo {

	public static void main(String[] args) {
		first1 a=new second();
		a.eat();

	}

}
