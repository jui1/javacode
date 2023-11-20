package sum.practiw.subset;

public class remove {
    public static void main(String[] args) {
        System.out.println(ans("aaabhabahabahbaha"));
    }
    static String ans(String um ){
        if(um.isEmpty()){
           return "";
           
       
        }
        char ch = um.charAt(0);
        if(ch =='a'){
           return ans( um.substring(1));
        }else{
            return  ch + ans(um.substring(1));
        }
    }
    
}
