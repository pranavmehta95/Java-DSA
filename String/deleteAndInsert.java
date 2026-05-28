package String;

public class deleteAndInsert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        sb.delete(2,6);
        System.out.println(sb);
        sb.insert(2,"shjh");
        System.out.println(sb);
    }
}
