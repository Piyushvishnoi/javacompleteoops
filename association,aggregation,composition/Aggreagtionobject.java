package associationaggregationcomposition;
//Aggregation is a special form of Association where:
//Aggregation represents Has-A relationship.
//Aggregation is a unidirectional association i.e. a one way relationship.
//In Aggregation, both the entries can survive individually which means ending one entity will not effect the other entity
import java.util.ArrayList;
import java.util.List;

class Aa
{ private String name;
private String dept;
	Aa(String name,String dept)
	{
		this.name=name;
		this.dept=dept;
	}
}
class Bb
{private String name;
	private List<Aa> obj;
	Bb(String name,List<Aa> obj)
	{
		this.name=name;
		this.obj=obj;
	}
	public List<Aa> getlist()
	{
	return obj;	
	}
}
class Cc
{
	private String name;
	private List<Bb> obj1;
	Cc(String name,List<Bb> obj1)
	{
		this.name=name;
		this.obj1=obj1;
	}
	public int getnoofstudents()
	{Integer noofstu=0;
		List<Aa> obj;
		for(Bb obj2:obj1)
		{
			obj=obj2.getlist();
			for(Aa obj4:obj)
			{
				noofstu++;
			}
		}
		return noofstu;
	}
}

public class Aggreagtionobject {

	public static void main(String[] args) {
	Aa a1=new Aa("Piyush","CSE");
	Aa a3=new Aa("Prakhar","CSE");
	Aa a2=new Aa("Ashish","EEE");
	Aa a4=new Aa("Ankit","EEE");
	List<Aa> obj3=new ArrayList<>();
	obj3.add(a1);
	obj3.add(a3);
	List<Aa> obj5=new ArrayList<>();
	obj5.add(a2);
	obj5.add(a4);
	Bb obj6=new Bb("cybernatics",obj3);
	Bb obj7=new Bb("cybernatics",obj5);
List<Bb> obj8=new ArrayList <>();
obj8.add(obj6);
obj8.add(obj7);
Cc objc=new Cc("For class Cc",obj8);
		//creating instance of class Cc
System.out.println("total in C");
System.out.println(objc.getnoofstudents());
	}

}
