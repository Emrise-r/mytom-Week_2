package codegym;

public class ClassC05 {
    public static void main(String[] args) {
        Student vinh = new Student(1, "Vinh");
        vinh.display();
        Student.change();
        vinh.display();
    }
}
