package subset.subset.permulatition;

public class recurti {
    public static void main(String[] args) {
       ans("", "abs"); 
    }
    static void ans(String p , String jam){
        if(jam.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = jam.charAt(0);
        for(int i =0;i<=p.length();i++){
            String f = p.substring(0 ,i);
            String s = p.substring(i,p.length());

            ans(f+ch+s, jam.substring(1));
        }
    }
    
}
