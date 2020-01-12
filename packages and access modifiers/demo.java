package p1;
import p2.*;

public class demo extends Mydemo {

	public static void main(String[] args) {
demo m=new demo();
//m.i=5;  //we cannot access default variable in another package until it is not a subcLass
m.a=4;
m.b=3;
//m.c=5;


	}

}
