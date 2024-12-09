package StringProrams;
import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {

		String s1 = "silent";
		String s2 = "listen";

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();


		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean bhai =Arrays.equals(c1, c2);
		if(bhai==true) {
			
			System.out.println("the given string is anagram");
		}

		else {
			System.out.println(" not Anagram");
		}
		
	}
}