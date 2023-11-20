
package pareldrom;

public class jam {
    public static void main(String[] args) {
        System.out.println(ans(4561));
    }
    
    static int umm(int n) {
        int digits = (int) Math.log10(n) + 1;
        return fun(n, digits);
    }
    
    static int fun(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        
        int rem = n % 10;
        return rem * (int) Math.pow(10, digit - 1) + fun(n / 10, digit - 1);
    }
    static boolean ans(int n){
        if(n==umm(n)){
            return true;
        }
        return false;
    }
}
