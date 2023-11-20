package peepinsta;

public class smallest {
    public static void main(String[] args) {
        int arr[] ={2,78,45,12};
        System.out.println(ans(arr, arr.length));
    }
    static int ans(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1], ans(arr, n-1));

    }
    
}
