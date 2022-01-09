
public class Program6 {

	public static void main(String[] args) {

		try {

			try {
				int a = 12;
				int b = 0;
				int c = a / b;

			} catch (ArithmeticException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}

			int[] x = new int[5];
			x[6] = 7;
		} catch (ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			String s = e.getMessage();
			System.out.println(s);

		}
		finally {
			System.out.println("finally executed....");
		}
	}
}
