package sum.practiw.subset.subset.question;

public class dice {
    public static void main(String[] args) {
        ans("", 4);
    }
    static void ans(String p, int up){
        if(up==0){
             System.out.println(p);
             return;
        }
        for(int i = 1;i<=6 &&  i<=up ;i++){
            ans(p+i , up-i);
        }
    }
    
}
