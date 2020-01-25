//Immutable class is that when once object got created for a class , its value can't be changed
//Immutable class can be created by using final keyword
 //In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable.
public final class Student   //use of final class
{ 
    final String name;   //use of final data member
    final int regNo; 
  
    public Student(String name, int regNo) 
    { 
        this.name = name; 
        this.regNo = regNo; 
    } 
    public String getName()  //no setters only getters in immutable classes
    { 
        return name; 
    } 
    public int getRegNo() 
    { 
        return regNo; 
    } 
} 
  
// Driver class 
class Test 
{ 
    public static void main(String args[]) 
    { 
        Student s = new Student("ABC", 101); 
        System.out.println(s.getName()); 
        System.out.println(s.getRegNo()); 
  
        // Uncommenting below line causes error 
        // s.regNo = 102; 
    } 
} 
