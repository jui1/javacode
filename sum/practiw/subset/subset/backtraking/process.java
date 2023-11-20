package sum.practiw.subset.subset.backtraking;

public class process {
    public static void main(String[] args) {
       System.out.println(ans("", 3, 3)) ;
    }
    static int ans(String p , int r, int c){
        if(r==1 && c==1){
            return 1;
           
            
        }
        int count = 0;
        if(r>1){
        count = count+ ans(p+'D', r-1, c);
        }
        if(c>1){
          count = count+   ans(p+'R', r, c-1);
        }
        return count;

    }
    //     if(m ==1 || n ==1){
    //         return 1;
    //     }
    //  int   left = uniquePaths(m-1,n);
    //  int right = uniquePaths(m , n-1);

    //  return left+right;
}
