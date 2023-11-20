package subset.subset.permulatition;
import java.util.ArrayList;

public class arratlis {
    public static void main(String[] args) {
        System.out.println(fun("", "abc"));
    }
    static ArrayList<String> fun(String p ,String jam){
           if(jam.isEmpty()){
            ArrayList<String> lit = new ArrayList<>();
            lit.add(p);
            return lit;
           }
           ArrayList<String> ans = new ArrayList<>();
           char ch = jam.charAt(0);
           for(int i =0;i<=p.length();i++){
            String f= p.substring(0,i);
            String s = p.substring(i,p.length());
     ans.addAll(fun(f+ch+s, jam.substring(1)));
           }
           return ans;
    }
    
}
