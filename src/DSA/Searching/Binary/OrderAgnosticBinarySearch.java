package DSA.Searching.Binary;

// When you don't know if the order of the sorted array is ascending or descending
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 12, 18, 20, 30, 100};
        System.out.println(orderAgnosticBinarySearch(arr, 5));
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){

            // find the middle element
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            }

            // For ascending order
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid+1;
                }
            }

            // For descending order
            else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid+1;
                }
            }
        }

        // return -1 if not found
        return -1;
    }
}
