//toString() provides String representation of an Object and used to convert an object to String
package objectclass;

public class tostringmethod {

	public static void main(String[] args) {
		tostringmethod obj=new tostringmethod();
		System.out.println(obj);
//The default toString() method for class Object returns a string consisting of the name of the class of which the object is an instance, 
//the at-sign character `@’, and the unsigned hexadecimal representation of the hash code of the object.	
		System.out.println(obj.toString());
	}

}
