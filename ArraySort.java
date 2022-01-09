import java.util.Scanner;

public class ArraySort {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size");
		int l=sc.nextInt();
		
		System.out.println("Enter the array Elements");
		int[] a=new int[l];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			}
		
		int temp=0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
			
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}}
		}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		
	}
	
		System.out.println("Second largest:"+a[1]);
	}
}

	

