public class TriangleClassifier {
    public static String Triangle(int side1, int side2, int side3) {
        boolean check1 = side2 + side3 > side1;
        boolean check2 = side1 + side3 > side2;
        boolean check3 = side1 + side2 > side3;
        if (check1 && check2 && check3 && side1 > 0 && side2 > 0 && side3 > 0) {
            boolean isTamGiacCan1 = side1 == side2;
            boolean isTamGiacCan2 = side1 == side3;
            boolean isTamGiacCan3 = side3 == side2;
            if (isTamGiacCan1 || isTamGiacCan2 || isTamGiacCan3) {
                if (side1 == side2 && side1 == side3) {
                    return "Tam Giac Deu";
                } else return "Tam Giac Can";
            } else return "Tam Giac Thuong";
        }  else return "Khong Phai Tam Giac";
    }
}
