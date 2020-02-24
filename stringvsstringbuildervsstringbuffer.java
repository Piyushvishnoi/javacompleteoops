
//If a string is going to remain constant throughout the program, then use String class object because a String object is immutable.
//If a string can change and will only be accessed from a single thread, using a StringBuilder is good enough.
//If a string can change, and will be accessed from multiple threads, use a StringBuffer because StringBuffer is synchronous so you have thread-safety.
class stringvsstringbuildervsstringbuffer
{ 
    // Concatenates to String 
    public static void concat1(String s1)  //use of string
    { 
        s1 = s1 + "forgeeks";  //here now s1 will be assigned with a new memory address to store new appended value
    } 
  
    // Concatenates to StringBuilder 
    public static void concat2(StringBuilder s2) //use oif stringbuilder
    { 
        s2.append("Vishnoi"); 
    } 
  
    // Concatenates to StringBuffer 
    public static void concat3(StringBuffer s3) //use of stringbuffer
    { 
        s3.append("Vishnoi"); 
    } 
  
    public static void main(String[] args) 
    { 
        String s1 = "Piyush"; 
        concat1(s1);  // s1 is not changed 
        System.out.println("String: " + s1); 
  
        StringBuilder s2 = new StringBuilder("Piyush"); 
        concat2(s2); // s2 is changed 
        System.out.println("StringBuilder: " + s2); 
  // StringBuffer is similar to StringBuilder except one difference that StringBuffer is thread safe,
 //multiple threads can use it without any issue. The thread safety brings a penalty of performance.
        StringBuffer s3 = new StringBuffer("Vishnoi"); 
        concat3(s3); // s3 is changed 
        System.out.println("StringBuffer: " + s3); 
    } 
} 
