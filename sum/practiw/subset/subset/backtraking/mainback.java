package sum.practiw.subset.subset.backtraking;

public class mainback {
    public static void main(String[] args) {
        boolean [] [] aman = { 
            { true , true , true},
            { true , true , true},
            { true , true , true},
     
         }; 
           ana("", aman, 0, 0);
         } 
    
    static void ana(String p ,boolean min[][], int r , int c){
            if(r==min.length-1 && c== min[0].length-1){
                System.out.println(p);
                return ;
            } 
           if(!min[r][c]){
                  return ;
            }
            min[r][c]=false;

            if(r<min.length-1){
               ana(p+'R', min, r+1, c);
            }
            if(c<min[0].length-1){
                ana(p+'C', min, r, c+1);
            }
            if(r>0){
          ana(p+'U', min, r-1, c);
            }
            if(c>0){
                ana(p+'L', min, r, c-1);
            }
  min[r][c]=false;
    }
    
}
