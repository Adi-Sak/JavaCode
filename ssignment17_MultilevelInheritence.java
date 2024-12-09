package basics;

class A1 {

	static void SM1() {

		System.out.println("1");

	}

	static void SM2() {

		System.out.println("2");

	}
}

class A2 extends A1 {

	static void SM3() {

		System.out.println("3");

	}

}

class A3 extends A2

{

	void NSM1() {

		System.out.println("4");

	}

	void NSM2() {

		System.out.println("5");

	}

}

public class ssignment17_MultilevelInheritence extends A3 {

	public static void main(String[] args) {

		SM1();
		SM2();
		SM3();

		A3 obj = new A3();

		obj.NSM1();
		obj.NSM2();

	}

}
