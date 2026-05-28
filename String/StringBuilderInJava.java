package String;

public class StringBuilderInJava {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb.length());
        StringBuilder x = new StringBuilder("10");
        System.out.println(x.length());
        System.out.println(x);


        StringBuilder a = new StringBuilder();
        System.out.println(a.capacity());
    }
    
}
