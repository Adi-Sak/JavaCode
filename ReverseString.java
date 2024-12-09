package StringProrams;

public class ReverseString {

    public static void main(String[] args) {
        
        String str = "I Love My Self"; // Original string
        String rev = ""; // Variable to store the reversed string

        // Corrected for loop
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i); // Get each character from the end
            rev = rev + c; // Append the character to the reversed string
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + rev);
    }
}
