package basics;



 class parent {
	 
	 void p() {
	 System.out.println("Parent Class");

	}
 }
	
	 
 class child extends parent{
	 
	 void c() {
		 
		 System.out.println("child Class");

	 }
	 
 }



public class ssignment16_SingleLevelInheritence {

	
	public static void main(String[] args) {
		
		
			child obj = new child();
			
			obj.c();
			obj.p();

		
		

	}

}
