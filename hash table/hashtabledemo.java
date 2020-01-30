import java.util.Hashtable;
//Hashtable stores key/value pair in hash table.
//In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. 
//The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table
public class hashtabledemo {

	public static void main(String[] args) {
		// creating a hash table 
        Hashtable<Integer, String> h = 
                      new Hashtable<Integer, String>(); 
  
        Hashtable<Integer, String> h1 = 
                      new Hashtable<Integer, String>(); 
  
        h.put(3, "Piyush"); 
        h.put(2, "Vishnoi"); 
        h.put(1, "Khushi"); 
  
        // create a clone or shallow copy of hash table h 
        h1 = (Hashtable<Integer, String>)h.clone(); 
  
        // checking clone h1 
        System.out.println("values in clone: " + h1); 
        
  
        // clear hash table h 
        h.clear(); 
  
        // checking hash table h 
        System.out.println("after clearing: " + h); 

	}

}
