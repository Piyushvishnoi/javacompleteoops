package associationaggregationcomposition;
//Aggregation is a special form of Association 
//It represents Has-A relationship.
//It is a unidirectional association i.e. a one way relationship. For example, department can have students but vice versa is not possible and thus unidirectional in nature.
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

public class Aggreagtionobject {

	public static void main(String[] args) {
	Aa a1=new Aa("Piyush","CSE");
	Aa a2=new Aa("Ashish","EEE");
	List<Aa> obj1=new ArrayList<>();
	obj1.add(a1);

	}

}
