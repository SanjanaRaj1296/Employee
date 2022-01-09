//Changing the number of parameters
public class Test7 
{
	public static void add(int x,int y)
	{
		System.out.println(x+y);
	}
	public void add(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	public static void main(String[] args) 
	{
		Test7 t=new Test7();
		//static methods can be accessed within the class by the name itself
		add(2, 3);
		t.add(5, 6, 7);
		
	}
	
	
	

}
