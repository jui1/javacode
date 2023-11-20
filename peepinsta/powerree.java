package peepinsta;

public class powerree {
    public static void main(String[] args) {
        System.out.println(ans(2, 7));
    }

    static int ans(int n,int base){
        if(base==0){
           return 1;
        }
        
        return n*ans(n, base-1);
    }

    
}
