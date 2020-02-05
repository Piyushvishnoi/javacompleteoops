package hackerranktopics;
//BigDecimal can handle very large and very small floating point numbers with great precision but compensating with the time complexity a bit.
import java.math.BigDecimal;

public class bigdecimalclass {

	public static void main(String[] args) {
		double a=0.03;
		double b=0.04;
		double c=b-a;
		System.out.println(c);
		//advantage of bigdecimal over double is that it will give more accurate result
		BigDecimal a1=new BigDecimal("0.03");
		BigDecimal b1=new BigDecimal("0.04");
		BigDecimal c1=b1.subtract(a1);
		System.out.println(c1);
		

	}

}
