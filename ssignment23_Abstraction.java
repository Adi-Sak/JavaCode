package basics;

import javax.management.Attribute;

abstract class sstudent{
	
	abstract void Study();
	abstract void Attendencs();
	
	void exam() {
		System.out.println("Exam Taken");
	}

	void goodStudent() {
		System.out.println("exam taken so good studen");
	}

	
}


class science extends sstudent{

	void Study() {
		
		System.out.println("They r in class");
	}

	
	void Attendencs() {
		
		System.out.println("Attendence is there");

	}
	
	
}


public class ssignment23_Abstraction {

	public static void main(String[] args) {
		

		sstudent obj1=new science();
		
		obj1.Study();
		obj1.Attendencs();
		obj1.exam();
		obj1.goodStudent();


	

	
	}

}
