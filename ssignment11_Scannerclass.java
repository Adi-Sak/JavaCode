package basics;

import java.util.Scanner;

public class ssignment11_Scannerclass {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter Student ID: ");
		        int studentId = scanner.nextInt(); 

	
		        scanner.nextLine();

		        System.out.println("Enter Student Name: ");
		        String studentName = scanner.nextLine(); 

		        System.out.println("Enter College Name: ");
		        String college = scanner.nextLine(); 

		        System.out.println("Enter Branch: ");
		        String branch = scanner.nextLine(); 

		 
		        System.out.println(studentId);
		        System.out.println(studentName);
		        System.out.println(college);
		        System.out.println(branch);
		        

		    }
		
	
		
	}

