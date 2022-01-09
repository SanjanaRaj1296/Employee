//Program to add as many as numbers the programmer gives the inputs


public class Array2 
{
public static void add(int...x)
{
	for(int i=0;i<x.length;i++)
	{
		System.out.println(x[i]+",");
	}
}
public static void main(String[] args) 
{
	add(1,2,3,4,5,6,9,9,8);
	
}

}
