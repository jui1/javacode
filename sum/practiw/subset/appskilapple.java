package sum.practiw.subset;

public class appskilapple {
    public static void main(String[] args) {
        System.out.println(umm("skipapplemana"));
    }
    static String  umm(String hamm){
        if(hamm.isEmpty()){
            return "";
        }
        if(hamm.startsWith("skip") && !hamm.startsWith("apple")){
            return umm(hamm.substring(5));
        }else{
            return hamm.charAt(0)+umm(hamm.substring(1));
        }
    }
    
}
