import java.util.Scanner;

public class Test11 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []a = {123,-99,-1,12,18,17,99};
		int smallest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(smallest>a[i])
			{
				smallest=a[i];
			}
		}
		System.out.println(smallest);
			}
		
	}

