package javapolymorphism;

class dynamicbinding{  
	 void eat(){System.out.println("animal is eating...");}  
	}  
	  
	class Dog extends dynamicbinding{  
	 void eat(){System.out.println("dog is eating...");}  
	  
	 public static void main(String args[]){  
		 dynamicbinding a=new Dog();  
	  a.eat();  
	 }  
	} 