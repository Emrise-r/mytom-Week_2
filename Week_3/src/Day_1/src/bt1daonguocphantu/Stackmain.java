package bt1daonguocphantu;

public class Stackmain {
    public static void main(String[] args) throws Exception {
        int[] Arr1 = new int[] {1, 2, 3, 4, 5};
        Stack stack = new Stack(5);
        for (int i = 0; i < Arr1.length; i++) {
            stack.push(Arr1[i]);
        }
        for (int i = 0; i < Arr1.length; i++) {
            Arr1[i] = stack.pop();
        }
        for (int a : Arr1){
            System.out.println(a);
        }
//        String[] Arr2 = new String[] {"Vinh", "Minh", "Long", "Thang", "Hieu"};
//        Stack stack2 = new Stack(5);
//        for (int i = 0; i < Arr2.length; i++) {
//            stack2.push(Arr2[i]);
//        }
//        for (int i = 0; i < Arr2.length; i++) {
//            Arr2[i] = stack2.pop();
//        }
//        for (String a : Arr2){
//            System.out.println(a);
//        }
    }
}
