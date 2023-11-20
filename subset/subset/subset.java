package subset.subset;

public class subset {
    public static void main(String[] args) {
        ans("", "abcc");
    }
    static void ans(String um ,String str){
        if(str.isEmpty()){
            System.out.println(um);
            return;

        }
        char c = str.charAt(0);
        ans(um +c, str.substring(1));
        ans(um, str.substring(1));
    }
    
}
