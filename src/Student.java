// Student class will inherit Person class
// How to inherit: extends
// How many class can a class inherit: 1

// Student is the child class and Person is the parent class
// Student is the Sub class and Person is the Super class
//Person is the base class

public class Student extends Person {
    // Attributes are inherited - Not the private attributes
    // Methods are inherited - Not the private methods
    //Setters and Getters are inherited - Not the private methods

    //Constructors - Are not inherited but you can use the constructors

    int student_id;
    double gpa;

    Student(){

    }
}
