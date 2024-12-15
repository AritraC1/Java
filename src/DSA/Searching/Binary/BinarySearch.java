package DSA.Searching.Binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] even = {2, 4, 6, 8, 12, 18};
        int[] odd = {3, 8, 11, 14, 16};

        System.out.println(binarySearch(even, 12));
        System.out.println(binarySearch(odd, 9));
    }

    // return the index
    static int binarySearch(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while (start <= end){

            // find the middle element
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid+1;
            } else {
                return mid; // element found
            }
        }

        // return -1 if not found
        return -1;
    }
}
