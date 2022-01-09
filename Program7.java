
public class Program7 {
	public static void main(String[] args) {
		
		try {
			try {
				int a[]= new int[4];
				a[5]=2;
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array");
				
			}
			int a=10;
			int b=a/0;
	System.out.println(b);
			}catch (ArithmeticException e) {
				System.out.println("Arith");
			}
		}
	}


