package arraylist;

public class rotatiom {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,1,2,3};
        System.out.println(searchInRotatedArray(arr, 0, arr.length -1, 2));
    }

    static int searchInRotatedArray(int arr[], int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        
        int mid = start + (end - start) / 2;
        
        if (arr[mid] == target) {
            return mid;
        }
        
        if (arr[start] <= arr[end]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return searchInRotatedArray(arr, start, mid - 1, target);
            } else {
                return searchInRotatedArray(arr, mid + 1, end, target);
            }
        }
        
        if (target >= arr[mid] && target <= arr[end]) {
            return searchInRotatedArray(arr, mid + 1, end, target);
        }
        
        return searchInRotatedArray(arr, start, mid - 1, target);
    }
}
