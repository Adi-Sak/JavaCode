package basics;

import javax.print.attribute.standard.PDLOverrideSupported;

public class ssignment32_equalsignorecase {

	public static void main(String[] args) {

		String S1 = "Java";
		String S2 = "java";

		String s3 = "I love to code in Java ans well as othe language Python Also";

		boolean TF = S1.equals(S2);
		System.out.println(TF);
		boolean tf2 = S1.equalsIgnoreCase(S2);
		System.out.println(tf2);
		System.out.println("===================================================================");
		String Sub1 = "Java";
		String Sub2 = "Python";
		boolean X = s3.contains(Sub1);
		boolean Y = s3.contains(Sub2);
		System.out.println(X);
		System.out.println(Y);

	}

}
