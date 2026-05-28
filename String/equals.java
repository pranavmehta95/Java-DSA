package String;

public class equals {
    public static void main(String[] args) {
        String s = "abcde";
        String a = "abcde";
        String b = new String(s);
        String c = "abc";
        c = c + "de";

        System.out.println(c==s);
        System.out.println(s.equals(c));
    }
    
}
