// Private and protected are not allowed in here
public class Person {
    // height, age, color, name, weight: instance variable
    double height;
    int age;
    String color;
    String name;
    double weight;

    // Constructors can have private, protected, public access modifiers
    public Person() {
        // Defualt constructors can be empty
        height = 48;
        age = 80;
        color = "Black";
        name = "";
        weight = 140;
    }

    // Protected members are accessible within the same package - java files under same directory/ folder
    protected Person(double height, int age) {
        // Parameters are local variables to the constructor
        this.height = height;
        this.age = age;
    }


    // Overloaded Constructor (We cannot have two defualt constructors)
    private Person(double height, int age, String color, String name, double weight) {
        // Parameters are local variables to the constructor
        this.height = height;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;
    }



    public Person Call_Priavte() {
        Person p3 = new Person(72, 70, "Back", "Barack Obama", 170);
        return p3;
    }
}

