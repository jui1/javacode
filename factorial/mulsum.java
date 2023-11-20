package factorial;

public class mulsum {
    public static void main(String[] args) {
        System.out.println(ans(1234));
    }
    static int ans(int n){
        if(n%10==n){
            return n;
        }

        return ans(n/10)*ans(n%10);
    }
    
}
