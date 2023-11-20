package sum.practiw.subset;

public class removeapple {
    public static void main(String[] args) {
        System.out.println(ans("amanapple"));
    }
    static String ans(String ham){
        if(ham.isEmpty()){
            return "";
        }
        if(ham.startsWith("apple")){
            return ans(ham.substring(5));
    }
    else{
        return ham.charAt(0) + ans(ham.substring(1));
    }
    
}
}