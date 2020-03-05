package exception;
class myexception extends Exception{
	myexception(String s){
	super(s);	
	}
}
class userdefinedexception{  
	  
	   static void validate(int age)throws myexception{  
	     if(age<18)  
	      throw new myexception("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(13);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
	}
