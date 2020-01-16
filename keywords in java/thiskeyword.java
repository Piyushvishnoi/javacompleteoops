class cube
{
	Integer width;
	Integer depth;
	Integer length;
	public void area(Integer width,Integer depth,Integer length)
	{
		this.width=width;  //this keyword is used to remove confusion among same name of variables
		this.depth=depth;
		this.length=length;
		System.out.println(width*depth*length);
	}
}
public class thiskeyword {
	public static void main(String[] args) {
		
cube c=new cube();
c.area(2,3,4);
	}

}
