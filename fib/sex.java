package fib;

public class sex {
    public static void main(String[] args) {
        System.out.println(ans(7));
    }
    static int ans(int n){
        if(n <2){
            return n;
        }
        return ans(n-1)+ans(n-2);
    }
}
