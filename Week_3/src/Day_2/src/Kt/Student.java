package Kt;

public class Student {
//    private int ID = 0;
    private String Name;
    private int Age;

    public Student(){}


    public Student(String Name, int Age) {
//        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return this.Name;
    }



    public int getAge() {
        return this.Age;
    }


    @Override
    public String toString() {
        return "Name: " + getName()
                +" ,Age: " + getAge();
    }
}
