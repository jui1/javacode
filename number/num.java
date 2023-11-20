package number;

public class num {
    public static void main(String[] args) {
        ans(8);
    }
    static void ans(int n){
        if(n== 0){
            return ;
        }
        System.out.println(n);
        ans(n-1);
    }
    
}
