//For every object, JVM generates a unique number which is hashcode. It returns distinct integers for distinct objects
package objectclass;

public class hashcodemethod {

	public static void main(String[] args) {
hashcodemethod obj=new hashcodemethod();
System.out.println("every object has its own unique code: "+obj.hashCode());
}

}
