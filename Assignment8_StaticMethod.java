package basics;

public class Assignment8_StaticMethod {
	


		
		static void Add (int a,int b) {
			
			int output1 = a+b;
			System.out.println(output1);

		}
		
		static void Add (double a, double b) {
			
			double output2 = a+b;
			System.out.println(output2);

		}
		
		static void Add (int a, double b) {
			
			double output3 = a+b;
			System.out.println(output3);


		}
		
		static void Add (String a, String b) {
			
			String output4 = a+b;
			
			System.out.println(output4);
		}


		public static void main(String[] args) {
			
		
			Add(10, 20);
			Add(30,400);
			Add(20,1000);
			Add("adi","tya");
			
		}
		
	}

	


