public class StringCompression {
    
    public static String compress(String str) {

        if (str == null || str.length() == 0) return "";
        int ctr = 1;
        char ch = str.charAt(0);
        if (str.length() == 1) return String.valueOf(ch) + ctr;
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= str.length()-1; i++) {
            if (str.charAt(i) == ch) {
                ctr++;
            } else {
                res.append(ch);
                res.append(ctr);
                ch = str.charAt(i);
                ctr = 1;
            }
        }
        res.append(ch);
        res.append(ctr);
        return res.toString();
    }

    public static void main(String[] args) {
        String compressed = compress("aaBBBa");
        System.out.println(compressed);
    }
}
