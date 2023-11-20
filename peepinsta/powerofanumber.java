package peepinsta;

public class powerofanumber {
    public static void main(String[] args) {
        System.out.println(ans(2, 4));
    }
    static int ans(int n ,int base){
        int result = 1;
        while(n>0){
        result *= base;
        n--;
    }
    return result;
}
    
}
