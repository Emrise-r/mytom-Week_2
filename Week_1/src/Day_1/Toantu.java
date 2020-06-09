package Day_1;

import java.util.Scanner;

public class Toantu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner amd = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = amd.nextFloat();

        System.out.println("Enter height: ");
        height = amd.nextFloat();
        float area = width * height;
        System.out.println(area);
    }

}
