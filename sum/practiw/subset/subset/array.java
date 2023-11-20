package sum.practiw.subset.subset;
import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        System.out.println(ans("", "abc"));
    }
    static ArrayList<String> ans(String p ,String up){
        if(up.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;

        }
        char u = up.charAt(0);
        ArrayList<String> left = ans(p+u, up.substring(1));
        ArrayList<String> right = ans(p, up.substring(1));

        left.addAll(right);
        return left;
    }
    
}
