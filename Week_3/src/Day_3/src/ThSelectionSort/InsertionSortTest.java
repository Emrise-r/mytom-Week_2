package ThSelectionSort;

public class InsertionSortTest {
    public static void main(String[] args) {
        double[] list = new double[] {1, 2, -3, 7, 4, 2, 13, -4.7, -1};
        selectionSort.selectionSort(list);
        for (double v : list) {
            System.out.print(v + ", ");
        }
    }
}
