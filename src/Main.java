 // https://github.com/Reillym2/COSC113_Inheritance/blob/master/src/Main.java

        public class Main {
            public static void main(String[] args) {
                // Create two person object
                Person p1 = new Person();

//        Person p2 = new Person(72, 70, "Back", "Barack Obama", 170 );
//        System.out.println(p2.name);
                Person p2 = new Person(72, 70 );
                System.out.println(p2.age);

                Person p3 = p2.Call_Priavte();

                Student s1 = new Student();
                s1.age=20;
                s1.gpa=4.00;
                System.out.println(s1.gpa);
                System.out.println("-----------------");

                Instructor I1 = new Instructor();

                I1.Subject = "COSC-113" ;
                I1.Time = 12;

                System.out.println("He is " +I1.age);
                System.out.println("He teaches " + I1.Subject);
                System.out.println("He teaches at " + I1.Time + "PM");
    }
}