package StringProrams;

public class PalindromeProgram {

	public static void main(String[] args) {

		String str = "WOW";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			char c = str.charAt(i);

			rev = rev + c;

		}

		System.out.println(rev);
		if (rev.equals(str)) {

			System.out.println("Its a Palindrome");

		}

		else {
			System.out.println("not a Palindrome");
		}

	}

}
