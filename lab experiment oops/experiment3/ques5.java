package javalabexp;
import java.util.Scanner;
class employee{
	public String name;
	public Integer empid;
	public Integer salary;
	employee()
	{}
	employee(String name,int empid,int salary)   //parametrized constructor
	{
		this.name=name;
		this.empid=empid;
		this.salary=salary;
	}
	String toreturnname()
	{
		return name;
	}
	Integer toreturnsalary()
	{
		return salary;
	}
	void toincreasesalary()
	{
System.out.println("Enter the percentage by which salary must be increased: ");
	Scanner s=new Scanner(System.in);
	Integer perc=s.nextInt();
	salary=salary+(salary*perc/100);
	System.out.println("Salary after increament: "+salary);
	}
	
}
class manager extends employee   //extending employee class
{ public String department;
	manager()
	{
		System.out.println("Enter department name: ");
		Scanner s=new Scanner(System.in);
		String dep=s.nextLine();
	}
}
public class ques5 {

	public static void main(String[] args) {
	employee obj=new employee("Piyush",50067083,100000); 
System.out.println("name of the employee is: "+obj.toreturnname());
System.out.println("salary of the emplyee is: "+obj.toreturnsalary());
employee obj1=new manager();
	}

}
