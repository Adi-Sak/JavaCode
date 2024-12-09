package basics;
//Superclass
class User {
 // Method to be overridden
 void login() {
     System.out.println("User login functionality.");
 }
}

//Subclass 1: Admin
class Admin extends User {
 @Override
 void login() {
     System.out.println("Admin logged in with admin privileges.");
 }
}

//Subclass 2: Teacher
class Teacher extends User {
 @Override
 void login() {
     System.out.println("Teacher logged in with teacher privileges.");
 }
}

//Subclass 3: Student
class Student extends User {
 @Override
 void login() {
     System.out.println("Student logged in with student privileges.");
 }
}

public class ssignment21_MethodOverriding {
 public static void main(String[] args) {
     // Creating objects for each subclass
     User admin = new Admin();
     User teacher = new Teacher();
     User student = new Student();

     // Demonstrating method overriding
     admin.login();   // Calls Admin's login method
     teacher.login(); // Calls Teacher's login method
     student.login(); // Calls Student's login method
 }
}



