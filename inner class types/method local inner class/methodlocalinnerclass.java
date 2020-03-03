package innerclassandinterface;
class outerclassmethodlocal{
	
		void show()
		{
			System.out.println("in local method of outer class");
			class innerclassmethodlocal{
			void innershow()
			{
				System.out.println("in local method in inner class");
			}
			}
			innerclassmethodlocal obj=new innerclassmethodlocal(); //making object of inner method class
			obj.innershow();
			}
		}

public class methodlocalinnerclass {

	public static void main(String[] args) {
		outerclassmethodlocal obj1=new outerclassmethodlocal();
		obj1.show();
	}

}
