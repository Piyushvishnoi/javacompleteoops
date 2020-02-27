package javalabexp;
import exp6package.classtobeimported;  //importing user defined packages
/*default - only accessible within the package
private - only accessible in the class
protected - accessible to classes in package and subclasses outside package
public - always accessible  */

public class exp4que1 {

	public static void main(String[] args) {
	classtobeimported obj=new classtobeimported();
	demopackageclass obj1=new demopackageclass();
	System.out.println("value of a is: " +obj.a);
	System.out.println("value of b is: " +obj.b);
//	System.out.println("value of member is: " +obj.member);  //member will not be visible till a sub-class is not made
	}

}
class demopackageclass extends classtobeimported  //extending imported package class
{
	demopackageclass()
	{
		System.out.println("value of member: "+member);
		System.out.println("Here we can access protected members of imported package class after making its subclass");
	}
}
