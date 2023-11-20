package fib;

public class first {
    public static void main(String[] args) {
        int n = 6;
        int s1 = 0;
        int s2 = 1;
        int num = 0;
        for(int i = 1; i<n ;i++){
           num =   s2+ s1;
           System.out.print( " " + num);

            s1 = s2;
            s2 = num;
        }
        
    }
}
