package basics;

import java.util.Scanner;

public class ssignment13_SwitchDaysofWeek {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number from 1 to 7");
		
		int day= scanner.nextInt();
		
		switch (day){
		
		
		case 1: System.out.println("Monday");
        break;
		case 2: System.out.println("Tuesday");
        break;
		case 3: System.out.println("Wnesday");
        break;
		case 4: System.out.println("Thusday");
        break;
		case 5: System.out.println("Friday");
        break;
		case 6: System.out.println("Saturday");
        break;
		case 7: System.out.println("Sunday");
        break;
		
		default: System.out.println("Invalid input");
		
		
		}
			
		scanner.close();
		}

}
