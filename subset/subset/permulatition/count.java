package subset.subset.permulatition;

public class count {
    public static void main(String[] args) {
        System.out.println(ans("", "abs"));
    }
    static int ans(String p ,String aman){
        if(aman.isEmpty()){
        return 1;
        }
        int count = 0;
        char ch = aman.charAt(0);
        for(int i = 0;i<=p.length();i++){
            String f= p.substring(0, i);
            String  s = p.substring(i,p.length());
            count = count+ ans(f+ch+s, aman.substring(1));
        }
        return count;
    }
}
