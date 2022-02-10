package javaProblem.string;

public class BinarySearch {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        int key = 60;
        binarySearch(arr,0,arr.length-1,key);
    }

    private static void binarySearch(int[] arr, int first, int last, int key) {
        int mid=(first+last)/2;
        if(first<=last) {
            if (arr[mid] == key) {
                System.out.println(mid);
            } else if (arr[mid] > key) {
                binarySearch(arr, first, mid, key);
            } else if (arr[mid] < key) {
                binarySearch(arr, mid + 1, last, key);
            }
        } else {
            System.out.println("element not found");
        }
    }

}
