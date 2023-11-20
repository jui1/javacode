package subset.subset;
import java.util.ArrayList;

public class subsequnce {
    public static void main(String[] args) {
        ans("", "abc");
        System.out.println(fun2("", "abc"));
    }
    static void ans(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        ans(p+ch, up.substring(1));
        ans(p, up.substring(1));
        ans(p+(ch+0), up.substring(1));

    }
    static ArrayList<String> fun2(String p ,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = fun2(p+ch, up.substring(1));
        ArrayList<String> second = fun2(p, up.substring(1));
        ArrayList<String> third = fun2(p +(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;

    }
    
}
