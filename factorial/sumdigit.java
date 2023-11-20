package factorial;

public class sumdigit {
    public static void main(String[] args) {
      System.out.println(fun(11111));  
    }
    static int fun(int n){
        if(n==1){
           return 1;
        }
        return fun(n/10)+fun(n%10);
    }
    
}
