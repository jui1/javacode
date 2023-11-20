package factorial;

public class sum {
    public static void main(String[] args) {
        System.out.println(ans(5));
    }
    static int ans(int n){
        if(n==1){
            return 1;
        }
        return n+ans(n-1);
    }
    
}
