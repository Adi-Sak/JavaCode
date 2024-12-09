package basics;

public class Assignment9_NonstaticMO {


		
		void Add (int a,int b) {
			
			int output1 = a+b;
			System.out.println(output1);

		}
		
		void Add (double a, double b) {
			
			double output2 = a+b;
			System.out.println(output2);

		}
		
		void Add (int a, double b) {
			
			double output3 = a+b;
			System.out.println(output3);


		}
		
		void Add (String a, String b) {
			
			String output4 = a+b;
			
			System.out.println(output4);
		}


		public static void main(String[] args) {
			
			Assignment9_NonstaticMO a1 = new Assignment9_NonstaticMO();
			
			a1.Add(10,20);
			a1.Add(10.10,13.40);
			a1.Add(10,23.40);
			a1.Add("Adi","tya");
		}
		
	}



