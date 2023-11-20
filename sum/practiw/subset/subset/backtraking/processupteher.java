package sum.practiw.subset.subset.backtraking;

public class processupteher {
    public static void main(String[] args) {
      ans("", 3, 3);
    }
   static void ans(String p, int r ,int c){
    if(r ==1 && c ==1){
        System.out.println(p);
        return ;
    }
    if(c>1 && r>1){
        ans(p +'M', r-1, c-1);
    }
    if(c>1){
        ans(p+'c', r, c-1);
    }
    if(r>1){
        ans(p, r-1, c);
    }
   }
    }
    

