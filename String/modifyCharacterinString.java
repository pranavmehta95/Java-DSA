package String;

public class modifyCharacterinString {
    public static void main(String[] args) {
        String s = "Hello";
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }
}


// String is immutble in java