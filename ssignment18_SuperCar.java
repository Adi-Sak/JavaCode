package basics;

class Vechile {

	Vechile() {

		System.out.println("I'm Constructor vechile");
	}

}

class Car extends Vechile {

	public Car() {

		super();
		System.out.println("I'm Car constructor ");
	}

}

public class ssignment18_SuperCar {

	public static void main(String[] args) {

		Car objCar = new Car();

	}

}
