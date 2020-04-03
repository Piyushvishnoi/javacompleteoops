package javalabexp;

import java.util.Scanner;

public class exp8que3 {
    static String LowerToUpper(String s) {
        String result = ("");
        char ch = ' ';
        for (int i = 0; i < s.length(); i++) {
            
            //check valid alphabet and it is in lowercase
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                ch = (char)(s.charAt(i) - 32);    //here we are dealing with thw ascii values of characters in string
            }
            //else keep the same alphabet or any character
            else {
                ch = (char)(s.charAt(i));
            }
            
            result =result + ch; // concatenation, append c to result
        }
        return result;
    }

    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
    	System.out.println("Enter lower case string: ");
    	String s=input.nextLine();
    	System.out.println("upper case case string: "+LowerToUpper((s)));
       
    }
}
