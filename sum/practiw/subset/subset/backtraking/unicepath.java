package sum.practiw.subset.subset.backtraking;

public class unicepath {
    public static void main(String[] args) {
       System.out.println( ans(3, 3));
    }
    static int ans(int r , int c){
        if(r ==1|| c==1){
           return 1;
        }

        int left = ans(r-1, c);
        int right = ans(r, c-1);
        return left +right;
    }
    
}
