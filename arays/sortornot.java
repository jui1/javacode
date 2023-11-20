package arays;

public class sortornot {
    public static void main(String[] args) {
      int  arr[] = { 1,2,3,45,5};
      System.out.println(ans(arr, 0));
    }
    static boolean ans(int arr[],int index ){
        if(index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && ans(arr, index+1);

    }
    
}
