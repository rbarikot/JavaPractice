package Udemy;
class Test122
{
	private int id;

	public int getId()
	{
		return id;
	}
	public int setId(int id)
	{
		this.id=id;
		return id;
	}
	
}
public class Encapsulation_Test1 {

	public static void main(String[] args) {
		Test122 ob= new Test122();
		ob.setId(12);
		System.out.println(ob.getId());


	}

}
