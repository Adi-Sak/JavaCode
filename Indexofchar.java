package StringProrams;

public class Indexofchar {

	public static void main(String[] args) {

		String a1 = "Welcome India";
		char target = 'c'; // Character to find

		int index = a1.indexOf(target); // Find the index of 'c'

		if (index != -1) {
			System.out.println("The index of character '" + target + "' is: " + index);
		} else {
			System.out.println("The character '" + target + "' is not found in the string.");
		}
	}

}
