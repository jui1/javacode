package sum.practiw.subset.subset;

public class subset {
    public static void main(String[] args) {
        ans("", "abc");
    }
    static void ans(String p , String um){
        if(um.isEmpty()){
          System.out.println(p);
          return ;
        }
       char ch = um.charAt(0);
         ans(p+ch, um.substring(1));
      ans(p, um.substring(1));
    }
    
}
