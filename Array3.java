//Program which accepts int array of any length,return a new array of its first 2 elements. 
//If the array is smaller than length 2, use whatever elements are present

import java.util.Scanner;
public class Array3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=sc.nextInt();
		
		System.out.println("Enter the array elements");
		int[] a=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		if(a.length>2)
		{
			System.out.println(a[0]+",");
			System.out.println(a[1]);
		}
		else
		{
			System.out.println(a[0]);
		}
		
	}

}
