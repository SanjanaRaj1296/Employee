import java.math.*;
import java.util.Scanner;

public class Quad 
{
	double d1,d2;
	
	Quad(double a,double b,double c)
	{
		d1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
		d2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
		System.out.println(d1);
		System.out.println(d2);
		
	}
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values for a, b and c");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		Quad q=new Quad(a,b,c);
	}
    }
