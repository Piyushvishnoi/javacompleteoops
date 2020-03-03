package innerclassandinterface;

class outerclass{
	Integer x=10;
	class innerclass{
		void innershow()
		{
			System.out.println("In inner class method");
		}
	}
}
public class innerclass {

	public static void main(String[] args) {
		outerclass.innerclass obj=new outerclass().new innerclass();
		obj.innershow();

	}

}
