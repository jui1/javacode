package margesort.quick;

import java.util.Arrays;

public class quick {
    public static void main(String[] args) {
        int arr[] = {74, 84, 25, 1, 7, 85};
        fun(arr, 0, arr.length - 1); 
        System.out.println(Arrays.toString(arr));
    }
    static  void fun(int arr[] ,int low ,int hight){
        if(low>= hight){
            return ;
        }

        int start = low;
        int end = hight;

        int mid = start+(end- start)/2;

        int p = arr[mid];

        while(start<=end){
            while(arr[start]<p){
                start++;
            }
            while(arr[end]>p){
                end--;
            }
            if(start<= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start ++;
                end--;
            }
        }
        fun(arr, low, end);
        fun(arr, start, hight);
    }
    
}
