package patterns;

import java.util.Arrays;

public class buble {
    public static void main(String[] args) {
        int arr[] = {4,2,5,8,1};
        ans(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void ans(int arr[], int l, int index){
          if(l==0){
           return ;
          }
          if(index<l){
          if(arr[index]>arr[index+1]){
               int temp = arr[index];
               arr[index]= arr[index+1];
               arr[index+1] =temp;
          }
          ans(arr, l, index+1);
        }else{

            ans(arr, l-1, 0);
           
        }
    } 

    }