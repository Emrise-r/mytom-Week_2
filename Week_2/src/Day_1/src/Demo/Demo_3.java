package Demo;

public class Demo_3 {
    public static void main(String[] args) {
        Faculty f = new Faculty();
    }
    static class Faculty extends Employee {
        public Faculty() {
            System.out.println("Faculty performing its tasks");
        }
    }

    static class Employee extends Person {
        public Employee() {
            this("Employee overloading its tasks");
            System.out.println("Employee performing its tasks!");
        }

        public Employee(String s) {
            System.out.println(s);
        }
    }

    static class Person {
        public Person() {
            System.out.println("Person performing its tasks!");
        }
    }
}
