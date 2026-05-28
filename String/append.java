package String;

public class append {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abc");
        System.out.println(s);
        s.append("123");
        System.out.println(s);
        char[] ch = {'p', 'r', 'a', 'n'};
        s.append(ch);
        System.out.println(s);
        // int[] arr = {'1', '2', '3', '4', '5'};
        // s.append(arr);     // It does'n work for the integer.
        // System.out.println(s);
        StringBuilder t = new StringBuilder("xyz");
        s.append(t);
        System.out.println(s);
    }
    
}
