package subset.subset;
import java.util.ArrayList;

public class arrylistsubset {
    public static void main(String[] args) {
        
        System.out.println( ans(" ", "abc"));
    }
    static ArrayList<String> ans(String p , String han){
 if(han.isEmpty()){
   ArrayList<String> ummm = new ArrayList<>();
  ummm.add(p);
  return ummm;

}
char ch = han.charAt(0);
ArrayList<String> left = ans(p+ch, han.substring(1));
ArrayList<String> right = ans(p,han.substring(1));
left.addAll(right);
return left;

    }

    
}
