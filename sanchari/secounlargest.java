package sanchari;

public class secounlargest {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 8, 20 };
        int sex = ans(arr, 0, Integer.MIN_VALUE, Integer.MIN_VALUE);
        System.out.println(sex);

    }
    private  static int ans(int [] arr,int index , int largest ,int sex){
        if(index==arr.length){
            return 0;
        }
        if(arr[index]>largest){
            sex= largest;
            largest = arr[index];

        } else if(arr[index] > sex && arr[index]<largest){
            sex = arr[index];
        }

        return ans(arr, index+1, largest, sex);
    }
    
}
