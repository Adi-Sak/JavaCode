package basics;

interface a {

	void Method1();

	void Method2();

	void Method3();

}

class b implements a {

	@Override
	public void Method1() {

		System.out.println("Implements Method1");

	}

	@Override
	public void Method2() {

		System.out.println("Implements Method2");

	}

	@Override
	public void Method3() {
		System.out.println("Implements Method3");

	}

}

public class ssignment24_InterfaceConcept {

	public static void main(String[] args) {

		a obj1 = new B();

		obj1.Method1();
		obj1.Method2();

		obj1.Method3();

	}

}
