package subset.subset;

public class aremoverecur {
    public static void main(String[] args) {
        System.out.println(ans("abbcbcbcbcababababababababab"));
    }
    static String ans(String aman){
        if(aman.isEmpty()){
            return "";
        }

        char a = aman.charAt(0);

        if(a=='a'){
            return ans(aman.substring(1));
        }else{
            return a+ans(aman.substring(1));
        }
    }
    
}
