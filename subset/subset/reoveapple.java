package subset.subset;

public class reoveapple {
    public static void main(String[] args) {
        System.out.println(ans("abbbbappleiljf999"));
    }
    static String ans(String aman){
        if(aman==""){
            return "";
        }
        if(aman.startsWith("apple")){
         return  ans(aman.substring(5));
        }else{
            return aman.charAt(0)+ans(aman.substring(1));
        }
        
    }
    
}
