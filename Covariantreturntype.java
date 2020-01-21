package javapolymorphism;
class A{  
	A get(){return this;}  
	} 
public class Covariantreturntype extends A {
	Covariantreturntype get(){return this;}
	void message(){System.out.println("welcome to covariant return type");}  

	public static void main(String[] args) {
	 
			new Covariantreturntype().get().message();  
	}

}
