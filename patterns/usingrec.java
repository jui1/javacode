package patterns;

public class usingrec {
    public static void main(String[] args) {
       ans(5, 0); 
       fun(7, 0);
    }
    static void ans(int r ,int c){
       if(r ==0){
        return;
       }
       if(c<r){
        System.out.print("*");
        ans(r, c+1);
       }else{
        System.out.println(" ");
        ans(r-1, 0);
       }

    }
     static void fun(int r ,int c){
        if(r==0){
            return ;

        }
       if(c<r){
       
        fun(r , c+1);
         System.out.print("*");
       }else{
        
        fun(r-1, 0);
        System.out.println(" ");
       }
     }

}
