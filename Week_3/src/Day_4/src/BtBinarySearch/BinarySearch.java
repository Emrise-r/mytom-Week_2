package BtBinarySearch;

public class BinarySearch {
    public static int BinarySearch(int arr[], int low, int high, int value) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            if (arr[mid] > value) {
                return BinarySearch(arr, low, mid - 1, value);
            }
            return BinarySearch(arr,mid + 1, high, value);
        }
        return - 1;
    }
}
