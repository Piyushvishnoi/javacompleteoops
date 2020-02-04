//This method is called just before an object is garbage collected.
//It is called by the Garbage Collector on an object when garbage collector determines that there are no more references to the object.
package objectclass;

public class finalizemethod {

	public static void main(String[] args) {
	finalizemethod obj1=new finalizemethod();
	System.out.println(obj1.hashCode());
	obj1=null;
	//calling garbage collector
	System.gc();
	
	System.out.println("End");
	}
	@Override
	protected void finalize()
	{
		System.out.println("Finalize method called");
	}

}
