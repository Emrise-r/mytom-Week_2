package Day_3;

public class Demo2 {
    public String name;
    public int age;
    public int weight;
    public String address;
    public Demo2() {
        this.name = "Vinh";
        this.age = 22;
        this.weight = 55;
    }
    public Demo2(int age, String name, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public Demo2 (int age, int weight) {
        this.age = age;
        this.weight = weight;
    }


    public void getName() {
        System.out.println(this.name);
    }
    public void getAge() {
        System.out.println(this.age);
    }
    public void setName(String name) {
        this.name = name;
    }
    public  void getWeight() {
        System.out.println(this.weight);
    }
    public void getAddress() {
        System.out.println(this.address);
    }
}
