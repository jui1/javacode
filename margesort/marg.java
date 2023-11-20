package margesort;

import java.util.Arrays;

public class marg {
    public static void main(String[] args) {
        int [] arr= {7,8,4,6,7,5,1,5,0};
        System.out.println((Arrays.toString(ans(arr))));
    }
    static int [] ans(int arr[]){
        if(arr.length ==1)
        return arr;

        int mid =  arr.length/2;
        int [] left = ans(Arrays.copyOfRange(arr,0,mid));
        int right[] = ans(Arrays.copyOfRange(arr,mid,arr.length));

        return fun2(left , right);
    }
    private static int [] fun2(int []fist,int []sec){
                 int mix[] = new int [fist.length+sec.length];
                 int i =0;
                 int j =0;
                 int k = 0;

                 while(i<fist.length && j<sec.length){
                    if(fist[i]<sec[j]){
                        mix[k]= fist[i];
                        i++;
                    }
                    else{
          mix[k]= sec[j];
          j++;
                    }
                    k++;
                 }
                 while(i<fist.length){
                    mix[k]=fist[i];
                    i++;
                    k++;

                 }
                 while(j<sec.length){
                    mix[k]=sec[j];
                    j++;
                    k++;
                 }
                 return mix;
                
    }
    
}
