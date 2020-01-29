//Lambda expressions basically express instances of functional interfaces
//Enable to treat functionality as a method argument, or code as data.
//A function that can be created without belonging to any class.
//A lambda expression can be passed around as if it was an object and executed on demand.
//lambda expressions implement the only abstract function and therefore implement functional interfaces
interface FuncInterface 
{ 
    // An abstract function 
    void abstractFun(int x); 
  
    // A non-abstract (or default) function 
    default void normalFun() 
    { 
       System.out.println("Hello"); 
    } 
} 
  
class lambdaexpression 
{ 
    public static void main(String args[]) 
    { 
        // lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
        FuncInterface fobj = (int x)->System.out.println(2*x); 
  
        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(5); 
    } 
} 

