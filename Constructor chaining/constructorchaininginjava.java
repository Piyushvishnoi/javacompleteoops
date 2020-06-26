//Constructor chainig can be done in two ways:
//1: by using this keyword
//2:by using super() keyword  
public class constructorchaininginjava {  
   
    // default constructor 1     
    // default constructor will call another constructor 
    // using this keyword from same class  
	constructorchaininginjava()    
    {   
        // calls constructor 2    
        this(5); 
        System.out.println("The Default constructor"); 
    }  
  
    // parameterized constructor 2 
	constructorchaininginjava(int x) 
    { 
        // calls constructor 3 
        this(5, 15); 
        System.out.println(x); 
    } 
  
    // parameterized constructor 3 
	constructorchaininginjava(int x, int y) 
    { 
        System.out.println(x * y); 
    } 
  
    public static void main(String args[]) 
    { 
        // invokes default const ructor first  
        new constructorchaininginjava();   
    } 
} 
