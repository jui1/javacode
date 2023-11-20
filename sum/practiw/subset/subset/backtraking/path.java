package sum.practiw.subset.subset.backtraking;

import java.util.Arrays;

public class path {
    public static void main(String[] args) {
        
            boolean [] [] aman = { 
                { true , true , true},
                { true , true , true},
                { true , true , true},
         
             }; 
             int [][]  path = new int [aman.length][aman[0].length];
              ans("", aman, 0, 0, 1, path);
              
               }
    static void ans(String p ,boolean man[][] , int r ,int c,int step ,int [][]path){
        if(r==man.length-1 && c==man[0].length-1){
            path[r][c] = step;
           for(int []arr: path){
            System.out.println(Arrays.toString(arr));

           }
           System.out.println(p);
           System.out.println();
           return;
        }
        if(!man[r][c]){
            return ;
        }
        man[r][c]= false;
        path[r][c] = step;

        if(r<man.length-1){
            ans(p+'R', man, r+1, c, step+1, path);
        }
        if(c<man[0].length-1){
            ans(p+'C', man, r, c+1, step+1, path);
        }
        if(r>0){
            ans(p+'U', man, r-1, c, step+1, path);
        }
        if(c>0){
            ans(p+'D', man, r, c-1, step+1, path);
        }
        man[r][c]= true;
        path[r][c] = 0;


    

    }
}