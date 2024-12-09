package StringProrams;

public class CharacterMethod {

	public static void main(String[] args) {

		String str = " Hello! 123@ jAvA_";

		int Alphabate = 0;
		int number = 0;
		int SpecialCharacter = 0;
		int Spaces = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isAlphabetic(ch)) {
				Alphabate++;

			}

			else if (Character.isDigit(ch)) {
				number++;

			}

			else if (Character.isWhitespace(ch)) {
				Spaces++;

			}

			else {

				SpecialCharacter++;

			}

		}

		System.out.println("Alphabate: "+Alphabate);
		System.out.println("Number: "+number);
		System.out.println("Space: "+Spaces);
		System.out.println("SpecialCharacter: "+SpecialCharacter);

	}

}
