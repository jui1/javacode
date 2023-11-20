package subset.subset;

public class ifitsnotthenskip {
    public static void main(String[] args) {
        System.out.println(ans("appummapple"));
        
    }
    static String ans(String aman){
        if(aman.isEmpty()){
            return "";
        }
        if(aman.startsWith("app") && !aman.startsWith("apple")){
            return ans(aman.substring(3));
        }
        else{
            return  aman.charAt(0)+ ans(aman.substring(1));
        }
    }
    
}
