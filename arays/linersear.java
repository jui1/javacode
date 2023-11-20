
package arays;
import  java.util.ArrayList;

public class linersear  {
    public static void main(String[] args) {
        int arr[] = {45, 78, 78, 96, 45};
        int target = 78;
        int index = 0;
        
        System.out.println(ans(arr, target, index));
        System.out.println(fun(arr, target, index));
        System.out.println(lastIndex(arr, target, arr.length - 1));
        bthIndex(arr, target, index);
        System.out.println(jam);
    }

    static boolean ans(int arr[], int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || ans(arr, target, index + 1);
    }

    static int fun(int arr[], int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return fun(arr, target, index + 1);
        }
    }

    static int lastIndex(int arr[], int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return lastIndex(arr, target, index - 1);
        }
    }
   static ArrayList<Integer> jam = new ArrayList<>();
      static void  bthIndex(int arr[],int target ,int index ){
        //  static ArrayList<Integer> jam = new ArrayList<>();
   
    if(index== arr.length){
        return ;
    }
    if(arr[index]==target){
        jam.add(index);
    }
    bthIndex(arr, target, index+1);
    }
     

}
