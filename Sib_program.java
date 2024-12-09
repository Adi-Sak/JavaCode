package StringProrams;
public class Sib_program 
{
	Sib_program()
	{
		System.out.println("Constructor");	

	}
	public static void main(String[] args)
	{

		System.out.println("Main method");	
		new Sib_program();
		new Sib_program();
	}
	static
	{
		System.out.println("SIB 1");
	}
	
	{
		System.out.println("IIB 1 ");
	}
	
	
	
}
