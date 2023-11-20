package margesort;

public class inplace {
    public static void main(String[] args) {
        
            int arr[] = {1, 5, 3, 25, 6, 58, 0, 1};
            ans(arr, 0, arr.length);
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
        
    
    static void ans(int arr[],int s ,int e){
        if(e-s==1)
        return;

        int mid = s+(e-s)/2;
        ans(arr, s, mid);
        ans(arr, mid, e);

        ans2(arr,s,mid,e);

        
    }
    private static void ans2(int []arr, int s, int mid ,int e){
              int []mix = new int [e-s];
              int i = s;
              int j = mid;
              int k = 0;
              while(i<mid && j<e){
                if(arr[i]<arr[j]){
        mix[k]=arr[i];
        i++;

                }else{
                    mix[k]= arr[j];
                    j++;
                }
                k++;
              }
              while(i<mid){
                mix[k]=arr[i];
                i++;
                k++;
              }
              while(j<e){
                mix[k]= arr[j];
                j++;
                k++;
              }
              for(int p = 0;p<mix.length;p++){
                arr[s+p]= mix[p];
              }


    }
    
}
