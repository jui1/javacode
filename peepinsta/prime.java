package peepinsta;

public class prime {
    public static void main(String[] args) {
        int n = 37;
        System.out.println(ans(n, n / 2));
    }

    static boolean ans(int n, int div) {
        if (div == 1) {
            return true; 
        }
        if (n % div == 0) {
            return false; 
        }
        return ans(n, div - 1); 
    }
}

