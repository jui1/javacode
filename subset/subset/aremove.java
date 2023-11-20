package subset.subset;

public class aremove {
    public static void main(String[] args) {
        ans("", "baccabaca");
    }

    static void ans(String p, String str) {
        if (str.isEmpty()) {
            System.out.println(p);
        } else {
            char ch = str.charAt(0);
            if (ch == 'a') {
                
                ans(p, str.substring(1));
            } else {
                
                ans(p + ch, str.substring(1));
            }
        }
    }
}

