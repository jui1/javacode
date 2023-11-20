package number;

public class rever {
    public static void main(String[] args) {
        ans(5);
    }
    static void ans(int n){
     if(n<=0){
        return ;
     }
      ans(n-1);
      System.out.println(n);
    }
    
}
