package peepinsta;
class largestnumber {
    public static void main(String[] args) {
        int arr[ ] = { 10,57,2,4,37,91};
        System.out.println(ans(arr, 0));
    }
    static int ans(int arr[] , int index){
        if(index==arr.length-1 ){
            return arr[index];
        }
        int maxum = ans(arr, index+1);
       if(arr[index] >maxum){
       return arr[index];
       }else{
        return maxum;
       }
        
    }
    
}
