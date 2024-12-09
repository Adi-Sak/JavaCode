package basics;

public class Assignment1_MethodCalling {

	public static void stat1() {
		
		
		System.out.println("Static Method 1");
	}

	public static void stat2() {

		System.out.println("Static Method 2");
	}

	public static void stat3() {

		System.out.println("Static Method 3");

	}

	public void Nonstat1() {

		System.out.println("Non Static Method 1");
	}

	public void Nonstat2() {

		System.out.println("Non Static Method 2");

	}
	
	
	
	public static void main(String[] args) {
		
	Assignment1_MethodCalling.stat1();
	Assignment1_MethodCalling.stat2();
	Assignment1_MethodCalling.stat2();

	
	Assignment1_MethodCalling obj1 = new Assignment1_MethodCalling();
	
	obj1.Nonstat1();
	obj1.Nonstat2();


	
	}
	

}
