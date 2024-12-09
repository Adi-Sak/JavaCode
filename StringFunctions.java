package StringProrams;

public class StringFunctions {

	public static void main(String[] args) {

		String str = "I Love Myself";

		int length = str.length();
		System.out.println(length);

		String upper = str.toUpperCase();
		System.out.println(upper);

		String result = str.replace(" ", "");
		System.out.println("String without white spaces: " + result);

		String pro = "Programming";

		char charat4 = pro.charAt(4);
		System.out.println(charat4);

		String str1 = "Hello,";
		String str2 = "World";
		
		String con=str1.concat(str2);
		System.out.println(con);
		
		String sub= "Welcome to Java Programming";
		
		String p= sub.substring(11);
		System.out.println(p);
		
		String sub1= "Programming is Fun";
		
		String p1= sub.substring(0,11);
		System.out.println(p1);
		
		String trimFunction= " A Very Good Morning ";
		String trim=trimFunction.trim();
		System.out.println(trim);
		
		String replace= "A Very 845 sdh";
		String y=replace.replaceAll("[0-9]", "");
		System.out.println(y);
		String eplace= "A VeRy 845 Sdh";
		String y1=eplace.replaceAll("[A-Z]", "");
		System.out.println(y1);
		
		System.out.println(replace.matches("A().*"));

	
	}
}
