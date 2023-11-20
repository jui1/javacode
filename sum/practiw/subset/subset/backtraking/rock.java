package sum.practiw.subset.subset.backtraking;

public class rock {
    public static void main(String[] args) {
       boolean [] [] aman = { 
       { true , true , true},
       { true , false , true},
       { true , true , true},

    }; 
      um("", aman, 0, 0);
    } 
    static void um(String p ,  boolean [] [] man ,int r ,int c){
        if( r==man.length-1 &&  c==man[0].length-1 ){
            System.out.println(p);
            return ;

        }
        if(!man[r][c]){
            return ;
        }
        if(man.length-1>r){
            um(p+'H', man, c, r+1);
        }
        if(man[0].length-1>c){
            um(p+'Y', man, c+1, r);
        }
        
    }
}
