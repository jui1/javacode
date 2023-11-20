package count;

public class countzero {
    public static void main(String[] args) {
        System.out.println(count(302010));
    }
    static int count(int n){
        return  aman(n,0);
    } 
    static int aman(int n,int c){
        if(n==0){
            return c;
        }
        int rem =n%10;
        if(rem==0){
            return aman(n/10, c+1);
        }




        
        return aman(n/10, c);
    }
    
}
