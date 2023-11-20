package quentionleetcode;

public class product {
    public static void main(String[] args) {
        int arr[] ={ 1,2,3,4};
        int[] result = ans(arr);

        for (int num : result) {
            System.out.println(num);
    }
}
    static int[] ans(int arr[]){
        int [] ans= new int [arr.length];
                                                                                                                   
        for(int i = 0;i<arr.length;i++){
            int multin = 1;
            //1sst position bade baki sb multi hbeeee
            for(int j = 0;j<arr.length;j++){
                //calculate  

             if(i != j){
                    multin = multin*arr[j];
             }
            }

         ans[i] = multin;
        }
        return ans;
    }
    
}
