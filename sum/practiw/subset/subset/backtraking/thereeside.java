package sum.practiw.subset.subset.backtraking;

public class thereeside {
    public static void main(String[] args) {
        System.out.println(ans(3, 3)) ;
    }
    static int  ans( int r , int c){
        if( r==1 || c ==1){
            // System.out.println("1");
            return 1;
        }

        int left = ans( r-1, c);
        int rig = ans( r, c-1);
        int mid =  ans( r-1, c-1);
        return left+rig+mid;
    }

    
}
