package assignmentoops;
 
import java.util.Scanner;

class Animal{
	String name;
	Integer age;
	String type;
	Animal()
	{
		System.out.println("Enter the name of the animal: ");
		Scanner s=new Scanner(System.in);
		name=s.nextLine();
		age=s.nextInt();
	}
	String getName()
	{
		return name;
	}
	Integer getAge()
	{
		return age;
	}
	void talk(String name,Integer age,String type)
	{
		System.out.println("name of animal is: "+ this.name);
		System.out.println("age of animal is: "+ this.age);
		System.out.println("type of animal: "+ this.type);
	}
	
}
class lion extends Animal{
lion()
{
	super.talk("lion",10,"carnivores");
}
}
class tiger extends Animal{
	tiger()
	{
		super.talk("tiger",10,"carnivores");
	}
}
class Zoo extends Animal{
	void addAnimal(Animal newAnimal)
	{
		
	
	}
}






public class ques1 {

	public static void main(String[] args) {
		System.out.println("Enter the no of animals to be in zoo: ");
	Scanner s=new Scanner(System.in);
	Integer noofanimals=s.nextInt();
	Zoo[] obj=new Zoo[noofanimals];
		Animal[] obj1=new Animal[noofanimals];
		for(int i=0;i<noofanimals;i++)
		obj[i].addAnimal(obj1[i]);
		

	}

}
