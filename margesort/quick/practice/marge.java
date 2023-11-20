package margesort.quick.practice;

import java.util.Arrays;

import fib.first;

public class marge {
    public static void main(String[] args) {
        int arr[] = {45, 41, 20, 10, 45, 78};
        int sortedArr[] = ans(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
    static int [] ans(int []arr){
            if(arr.length ==1)
            return arr;

            int mid = arr.length/2;
            int left[] = ans(Arrays.copyOfRange(arr,0,mid));
            int [] right = ans(Arrays.copyOfRange(arr,mid,arr.length));

            return fun(left , right);
    }
    static int [] fun(int []left ,int []right){
         int []mix = new int [left.length+right.length];

         int i = 0;
         int j = 0;
         int k = 0;

         while(i<left.length && j<right.length){
            if(left[i] <right[j]){
                mix[k]=left[i];
                i++;
            }else{
                mix[k]= right[j];
                j++;
            }
            k++;

         }
         while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
         }
         while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
         }
  return mix;
    }
    
}
