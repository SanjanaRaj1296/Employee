//Method Overloading
public class Test6 
{
	public void login(String username, String password)
	{
		System.out.println("Your Username is:"+username);
		System.out.println("Your Password is:"+password);
		}
	public void login(String password,long phonenumber)
	{
		
		System.out.println("Your Password is:"+password);
		System.out.println("Your PhoneNumber is:"+phonenumber);
		
	}
	public static void main(String[] args) 
	{
		Test6 t=new Test6();
		t.login("SANJANA", "sanjana123");
		System.out.println();
		t.login("sanjana123", 8904711785l);
		
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
