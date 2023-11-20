package sanchari;

public class hight {
    public static void main(String[] args) {
        int arr[] = {3, 6, 19, 10, 56, 24};
         int min = arr[0];
         int max = arr[0];
 
         for (int i=0;i<arr.length;i++)
         {
             if (min > arr[i])
             {
                 min = arr[i];
             }
             if(max < arr[i]){
                     max = arr[i];
                 }
             }
         
         System.out.println("the smallest no is " +min);
         System.out.println(max);
}
}
    

