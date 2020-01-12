package p2;

public class Mydemomain {

	public static void main(String[] args) {
	Mydemo obj=new Mydemo();
	obj.i=2;  //here we can access i because we are in same package
	obj.a=3;
	obj.b=5;
	//obj.c=3; private members cannot be accessed 
	}

}
