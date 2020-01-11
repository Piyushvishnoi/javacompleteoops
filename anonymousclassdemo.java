//anonymous class is used to override a function i.e we donn't have to define an extra clas just to override a function
//anonymous class is actually not a class but can be treated as a single time use class
package tutorial;
class an
{
	public void show()
	{
		System.out.println("in original");
	}

}
public class anonymousclassdemo {

	public static void main(String[] args) {
		an a=new an()
				{
				public void show()
			{
	System.out.println("after overriding");			
			}
	};
a.show();
				
		
	}
}
