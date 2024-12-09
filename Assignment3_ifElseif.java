package basics;

public class Assignment3_ifElseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int marks =78;
		
		if(marks>=90) {
			System.out.println("A+ Grade");
		}
		
		else if (marks>=80) {
			System.out.println("A Grade");
		}
		else if (marks>=70) {
			System.out.println("B Grade");
		}	
		else if (marks>=60) {
			System.out.println("C Grade");
		}
		else {
			System.out.println("fail");
		}
		
	}

}
