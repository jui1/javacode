package sum.practiw.subset.subset.backtraking.NQueen;

public class Queen {
    public static void main(String[] args) {
       int n = 4;
       boolean [][] man = new boolean[n][n];
       System.out.println(ans(man, 0)); 
     }
     static int ans(boolean [][] man, int row){
        if(row==man.length){
            fun(man);
           System.out.println();
            return 1;
        }
        int count = 0;
        for(int col =0 ; col< man.length;col++){
            if(isSafe(man , row,col)){
                man[row][col]=true;
                count += ans(man, row+1);
                man[row][col]=false;
            }
           
        }
         return count ;
     }
     static void fun(boolean[][] man){
        for(boolean [] row : man){
        for(boolean ele : row){
            if(ele){
                System.out.print("Q ");
            }else{
                System.out.print("X ");
            }
        }
        System.out.println();
        }
     } 

   public static boolean isSafe(boolean man[][],int row , int col){
        for(int i = 0;i<row;i++){
        if(man[i][col]){
            return false;
        }
        }
        int maxLeft = Math.min(row,col);
        for(int i = 1;i<= maxLeft ;i++){
            if(man[row-i][col-i]){
                return false;
            }
        }
        int maxRight = Math.min(row , man.length-col-1);
        for(int i = 1;i<=maxRight;i++){
            if(man[row-i][col+i]){
                return false;
            }
        }
      return true;

    }
    
}
