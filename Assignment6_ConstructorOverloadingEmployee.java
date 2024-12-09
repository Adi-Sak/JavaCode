package basics;

public class Assignment6_ConstructorOverloadingEmployee {
	
	
	Assignment6_ConstructorOverloadingEmployee(String employeeName){
		
		System.out.println("EMP name:"+employeeName);
			
	}
	
	Assignment6_ConstructorOverloadingEmployee(int employeeID){
		System.out.println("EMP ID:"+employeeID);
		
	}
	
	Assignment6_ConstructorOverloadingEmployee(String employeeName, String employeecompany){
		
		System.out.println("EMP comany name:"+employeecompany);

		
	}
	
	Assignment6_ConstructorOverloadingEmployee(String employeeName, String employeecompany, String Designation){
		
		System.out.println("EMP designation:"+Designation);
	}
	
	Assignment6_ConstructorOverloadingEmployee(float salary){
		System.out.println("EMP designation:"+salary);

		
	}
	
	public static void main (String[] args) {
		
		Assignment6_ConstructorOverloadingEmployee obj1 = new Assignment6_ConstructorOverloadingEmployee("Aditya");
		Assignment6_ConstructorOverloadingEmployee obj2 = new Assignment6_ConstructorOverloadingEmployee(1);
		Assignment6_ConstructorOverloadingEmployee obj3 = new Assignment6_ConstructorOverloadingEmployee("Aditya","Amdocs");
		Assignment6_ConstructorOverloadingEmployee obj4 = new Assignment6_ConstructorOverloadingEmployee("Aditya","Amdocs","Tester");
		Assignment6_ConstructorOverloadingEmployee obj5 = new Assignment6_ConstructorOverloadingEmployee(120000);

      
		
	}
	
	
	
	
	

}
