package basics;

public class ssignment12_localGlobalFinalV {

	static int a = 10;

	final int num = 10;

	public static void Add() {

		int b = 25;

		int c = a + b;

		System.out.println(c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add();
		a = 100;
		Add();
		ssignment12_localGlobalFinalV obj1 = new ssignment12_localGlobalFinalV();
		// obj1.num = 100;
	}

}
