package reverse;

public class simple {
    public static void main(String[] args) {
        
   System.out.println(ans(456));
    }
    static int ans(int n){
        int sum =0;
     
            if(n==0){
                return 0;
            }
            int rem = n%10;
            sum = sum *10 +rem;
            ans(n/10);
             return sum;
        }
    }

