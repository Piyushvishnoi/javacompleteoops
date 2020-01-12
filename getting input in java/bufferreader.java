package waysofinputinjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bufferreader {

	public static void main(String[] args) throws IOException{
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
String name=obj.readLine();
System.out.print(name);
System.out.println("vishnoi");

	}

}
